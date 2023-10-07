package com.mytests.inheritanceTests.interfaceImplementing;

import com.mytests.types.SecondPojo;
import io.micronaut.http.annotation.Controller;

import java.util.List;

@Controller("/inherited")
public class ImplementationController implements ParentMappings {
    @Override
    public List<SecondPojo> list() {
        return null;
    }
}
