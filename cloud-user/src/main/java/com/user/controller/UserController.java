package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/buy")
    public String butTicket(String name){
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/hello",String.class);
        return name+"购买了"+""+s;
    }
}
