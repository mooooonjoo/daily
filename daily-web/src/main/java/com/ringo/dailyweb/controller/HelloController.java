package com.ringo.dailyweb.controller;

import com.ringo.dailycore.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/test")
    public String test(){
        return sampleService.getSampleService();
    }
}
