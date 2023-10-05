package com.mytests;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * *
 * <p>Created by irina on 10/5/2023.</p>
 * <p>Project: micronaut-generate-openapi</p>
 * *
 */
@Controller("/first")
public class Controller1 {

    /**
     * @param pv1 some pathvar
     * @return dummy test1 output
     */
    @Get(uri = "/test1/{pv1}", produces = MediaType.TEXT_PLAIN)
    public String test1(String pv1) {
        return "test1";
    }
}
