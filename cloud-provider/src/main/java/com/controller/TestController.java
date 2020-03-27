package com.controller;

import com.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    testService testService;

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/hello")
    public String controller(){
        System.out.println(port);
        return testService.hello()+port;
    }
}
