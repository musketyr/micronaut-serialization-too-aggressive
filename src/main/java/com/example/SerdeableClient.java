package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("serdeable")
public interface SerdeableClient {

    @Get("/message")
    SerdeableMessage getMessage();

}
