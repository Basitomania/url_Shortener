package com.urlshortener.shortener.util;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class createUrl {

    public static String shortenUrl(String LongUrl){
        String ShortUrl = Hashing.murmur3_32().hashString(LongUrl, StandardCharsets.UTF_8).toString();
        return ShortUrl;
    }
}
