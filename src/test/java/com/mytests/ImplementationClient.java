package com.mytests;

import com.mytests.inheritanceTests.interfaceImplementing.ParentMappings;
import com.mytests.types.SecondPojo;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client(path = "/inherited")
public interface ImplementationClient extends ParentMappings {
    @Override
    List<SecondPojo> list();
}
