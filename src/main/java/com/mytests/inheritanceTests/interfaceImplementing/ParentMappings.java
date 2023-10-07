package com.mytests.inheritanceTests.interfaceImplementing;


import com.mytests.types.SecondPojo;
import io.micronaut.http.annotation.Get;

import java.util.List;

public interface ParentMappings {

    @Get("/listOfPojos")
    List<SecondPojo> list();
}
