package com.xc.sample.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "示例控制器")
@RestController
@RequestMapping(("/sample"))
public class SampleController {

    @GetMapping("/sample")
    @Operation(summary = "示例接口")
    public String hello() {
        return "Hello,this is sample controller";
    }
}
