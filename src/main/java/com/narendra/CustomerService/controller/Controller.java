package com.narendra.CustomerService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller  {



    @RequestMapping("/healthcheck")
    public String sayHello(){
        return "hello there";
    }



}
