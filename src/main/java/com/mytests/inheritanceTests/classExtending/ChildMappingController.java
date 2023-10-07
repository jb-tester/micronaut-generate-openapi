package com.mytests.inheritanceTests.classExtending;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/classInheritance")
public class ChildMappingController extends BaseMapping {
    @Get("/test2")
    public String childGet(){
        return "from child class";
    }
}
