package com.narendra.CustomerService.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class Controller  {



    @RequestMapping("/healthcheck")
    public String sayHello(){
        log.info("Doing healthcheck");
        return "hello there";
    }



}
