package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("normal")
public interface NormalClient {

    @Get("/message")
    NormalMessage getMessage();

}
