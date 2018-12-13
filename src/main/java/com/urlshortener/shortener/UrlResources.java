package com.urlshortener.shortener;
import com.google.common.hash.Hashing;
import com.urlshortener.shortener.Model.Url;
import com.urlshortener.shortener.util.createUrl;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api")
public class UrlResources {

    @Autowired
    StringRedisTemplate redisTemplate;


    @GetMapping("/{id}")
    public String getUrl(@PathVariable String id, HttpServletResponse resp) throws IOException {
        String url = redisTemplate.opsForValue().get(id);
        if(url != null){
            resp.sendRedirect(url);
        } else{
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
        System.out.println("URL Retrived : " + url);
        return url;
    }

    @PostMapping("/user")
    public Response create(@RequestBody String url){

        UrlValidator urlValidator = new UrlValidator(
            new String[]{"http", "https"}
        );

        if(urlValidator.isValid(url)){
            Response response = new Response("00", "Successfull", null,  "http://localhost:8080/api/" + createUrl.shortenUrl(url));
            String id = createUrl.shortenUrl(url);
            redisTemplate.opsForValue().set(id, url);
            return response;
        }
        throw new RuntimeException("URL Invalid: " + url);
    }
}


















