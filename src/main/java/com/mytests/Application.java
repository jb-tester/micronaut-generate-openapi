package com.mytests;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "Micronaut OpenAPI Generation Test",
                version = "1.0.0",
                description = "my dummy API ",
                contact = @Contact(url = "https://ip-server.com", name = "irina", email = "irina.petrovskaya@jetbrains.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}