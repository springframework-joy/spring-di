package org.srikanth.spring.di.springdi.controllers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.srikanth.spring.di.springdi.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void init() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayHello(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}
