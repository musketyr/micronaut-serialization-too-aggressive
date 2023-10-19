package com.example;

import io.github.cjstehno.ersatz.ErsatzServer;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.test.support.TestPropertyProvider;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Map;

@MicronautTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NormalClientTest implements TestPropertyProvider {

    private static final ErsatzServer server = new ErsatzServer(config -> config
            .expectations(expectations -> expectations
                    .GET("/message")
                    .responds().body("{\"message\":\"Hello World\"}", "application/json")
            )
    );

    @Inject
    NormalClient client;

    @Test
    void testItWorks() {
        NormalMessage message = client.getMessage();
        Assertions.assertEquals("Hello World", message.getMessage());
    }

    @Override
    public @NonNull Map<String, String> getProperties() {
        return Map.of("micronaut.http.services.normal.url", server.getHttpUrl());
    }
}
