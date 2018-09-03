package org.srikanth.spring.di.springdi.controllers;

import org.junit.Before;
import org.junit.Test;
import org.srikanth.spring.di.springdi.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;
public class GetterInjectedControllerTest {

    private GetterInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new GetterInjectedController();
        this.propertyInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
