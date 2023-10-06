package com.mytests;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.List;

/**
 * *
 * <p>Created by irina on 10/5/2023.</p>
 * <p>Project: micronaut-generate-openapi</p>
 * *
 */
@Controller("/first")
public class Controller1 {

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

    // single parameter in the POST methods is not processed as request body if the explicit @Body annotation is not provided
    //   https://youtrack.jetbrains.com/issue/IDEA-334227
    @Post("/test1")
    public boolean post1(List<FirstPojo> pojoList){
        return true;
    }
    // but this is ok:
    @Post("/test2")
    public boolean post2(@Body List<FirstPojo> pojoList){
        return true;
    }

    // `@Body#value` should be considered: https://youtrack.jetbrains.com/issue/IDEA-334230
    @Post("/test3")
    public String post3(@Body("p1") Integer p1 ){
        return ":"+p1;
    }

    // Multiple parameters in post method https://youtrack.jetbrains.com/issue/IDEA-334228
    @Post("/test4")
    public String post4(String arg1, int arg2, boolean arg3){
        return arg1+" "+arg2+" "+arg3;
    }
}
