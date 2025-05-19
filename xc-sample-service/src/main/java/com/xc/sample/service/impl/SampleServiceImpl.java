package com.xc.sample.service.impl;

import com.xc.sample.service.SampleService;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {
    @Override
    public String serviceInfo() {
        return "Hello,this is sample controller";
    }
}
