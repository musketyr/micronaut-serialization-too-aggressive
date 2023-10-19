package com.example;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class SerdeableMessage {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
