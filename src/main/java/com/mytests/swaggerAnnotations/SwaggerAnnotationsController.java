package com.mytests.swaggerAnnotations;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/swagger")
public class SwaggerAnnotationsController {

    @Get(uri="/test0")
    @Operation(summary = "MY OPERATION SUMMARY",  // ok
            description = "MY OPERATION DESCRIPTION", // ok
            operationId = "MY OPERATION ID"  // ok
    )
    @Tag(name = "MYTAG") // ok
    public String mymethod() {
        return "";
    }

    // empty OperationId is generated: https://youtrack.jetbrains.com/issue/IDEA-334320
    @Get(uri="/test1")
    @Operation(summary = "SUPER OPERATION SUMMARY",  // ok
            description = "SUPER OPERATION DESCRIPTION" // ok
    )
    public String noOpIdTest() {
        return "";
    }

    // all are ignored: https://youtrack.jetbrains.com/issue/IDEA-334321
    @ApiResponse(
            content = @Content(mediaType = "application/json",
                    schema = @Schema(type="string"))
    )
    @ApiResponse(responseCode = "400", description = "YOU ARE WRONG")
    @ApiResponse(responseCode = "404", description = "NOTHING FOUND")
    @Get("/test2")
    public String apiResponseTest(){
        return "";
    }

    // @Parameter#name and #required attributes are ignored; description - ok; https://youtrack.jetbrains.com/issue/IDEA-334318
    @Get(uri= "/test3/{arg}")
    public String parameterTest(@Parameter(description="NAME PARAMETER DESCRIPTION", name = "MYNAME", required = false) String arg) {
        return arg;
    }

    @Get(uri="/test4")
    @Operation(hidden = true) // ok
    public String hiddenOp() {
        return "";
    }

    // parameter is not hidden but should be; https://youtrack.jetbrains.com/issue/IDEA-334317
    @Get(uri= "/test4/{arg}")
    public String hiddenParameter(@Parameter(hidden = true) String arg) {
        return arg;
    }
}
