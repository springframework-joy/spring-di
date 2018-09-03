package org.srikanth.spring.di.springdi.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class ConstructorGreetingService implements GreetingService{




    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the Constructor!!";
    }
}
