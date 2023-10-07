package com.mytests.generalCases;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.List;

@Controller
public class GeneralCasesController {

    // mapping method javadoc is not considered:
    //   https://youtrack.jetbrains.com/issue/IDEA-334234
    /**
     * getTest1 method
     * @param pv1 some pathvar
     * @return dummy test1 output
     */
    @Get(uri = "/test1/{pv1}", produces = MediaType.TEXT_PLAIN)
    public String test1(String pv1) {
        return "test1";
    }

    // produces and consumes: ok
    @Post(value = "/test2", consumes = MediaType.APPLICATION_XML, produces = MediaType.TEXT_PLAIN)
    public List<String> test2(@Body String[] mybody){
        return List.of(mybody);
    }

    // processes: ok
    @Post(value = "/test3", processes = MediaType.APPLICATION_XML)
    public List<String> test3(@Body String[] mybody){
        return List.of(mybody);
    }

    // defaults: generated response content type is '*/*', should be application/json
    @Post("/test4")
    public List<String> test4(@Body String[] mybody){
        return List.of(mybody);
    }
}
