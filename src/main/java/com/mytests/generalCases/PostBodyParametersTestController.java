package com.mytests.generalCases;

import com.mytests.types.FirstPojo;
import com.mytests.types.MyEnum;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.util.List;

/**
 * *
 * <p>Created by irina on 10/5/2023.</p>
 * <p>Project: micronaut-generate-openapi</p>
 * *
 */
@Controller("/first")
public class PostBodyParametersTestController {


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

    // more body types - ok

    @Post("/test5")
    public String post5(@Body MyEnum arg){
        return arg.name();
    }
    @Post("/test6")
    public String post6(@Body Boolean arg){
        return arg.toString();
    }
}
