package com.xc.sample.controller;

import com.xc.sample.service.SampleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "示例相关接口")
@RestController
@RequestMapping(("/sample"))
public class SampleController {

    private SampleService sampleService;

    @GetMapping("/service-info")
    @Operation(summary = "示例服务信息")
    public String serviceInfo() {
        return sampleService.serviceInfo();
    }
}
