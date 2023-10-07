package com.mytests.inheritanceTests.classExtending;


import io.micronaut.http.annotation.Get;

public class BaseMapping {

    @Get("/test1")
    public String parentGet(){
        return "from base class";
    }
}
