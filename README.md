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
This https://mail.google.com/mail/u/0/#inbox/FMfcgxvzLrJVGvLnXkSfhCnlVLmBbJfp will return "http://localhost:8080/api/0b40b067"
   

**Return** 
``` json
{
    "code": "00",
    "description": "Successfull",
    "errors": null,
    "shortUrl": "http://localhost:8080/api/0b40b067"
    }
```
