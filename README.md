## Url_Shortener
This is a url Shortener built with spring boot and redis.

***

## Parameters

- **Redis** — Requires redis to run
- **Link** — Input a long-link to get a short-link

***

## Return format
A JSON object containing the shortened url

- **current_page** — Number of the page that is returned.

***

## Errors
All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

## Test Environment
PostMan


***

## Example
**Request**

## Demo
This https://github.com/d-rep/URL-Shortener/blob/master/url-shortener-domain/src/main/java/com/repaskys/domain/ShortUrl.java will return "http://localhost:8080/api/1b87385d"
   

**Return** 
``` json
{
    "code": "00",
    "description": "Successfull",
    "errors": null,
    "shortUrl": "http://localhost:8080/api/0b40b067"
    }
```
