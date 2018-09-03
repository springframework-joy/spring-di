package org.srikanth.spring.di.springdi.controllers;

import org.springframework.stereotype.Controller;
import org.srikanth.spring.di.springdi.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
