package com.mytests.generalCases;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.*;

@Controller("/vars")
public class PathAndQueryVariablesController {

    @Get(value = "/test1/{id}/queryvars{?max,min}")
    public int test1(@PathVariable("id")  Integer pv1, @Nullable @QueryValue("max") Integer qv1, @Nullable @QueryValue("min") Integer qv2) {


        return pv1+qv1+qv2;
    }

    // 'nullable' should be inserted to parameters schemas
    @Get(value = "/test2/{name}/queryvars{?var1,var2}")
    public String test2(@Nullable @PathVariable(name="name", defaultValue = "foo")  String pv1, @Nullable @QueryValue(value = "var1", defaultValue = "bar") String qv1, @Nullable @QueryValue(value = "var2", defaultValue = "false") boolean qv2) {
        return pv1;
    }
}

