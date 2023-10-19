package com.example;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class NormalMessage {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
