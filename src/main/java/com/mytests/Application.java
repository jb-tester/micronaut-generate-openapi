package com.mytests;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "${api.title}",
                version = "${api.version}",
                description = "${openapi.description}",
                contact = @Contact(url = "https://ip-server.com", name = "irina", email = "irina.petrovskaya@jetbrains.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}