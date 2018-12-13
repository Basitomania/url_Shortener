package com.urlshortener.shortener;

import java.util.List;

public class Response {
    private final String code;
    private final String description;
    private final String errors;
    private final String shortUrl;


    public Response(String code, String description, String errors, String shortUrl) {
        this.code = code;
        this.description = description;
        this.errors = errors;
        this.shortUrl = shortUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", errors=" + errors +
                '}';
    }
}
