package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import guru.springframework.services.GreetingService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class ConstructorInjectedControllerTest {
    @MockBean
    private ConstructorInjectedController constructorInjectedController;

    @MockBean
    private GreetingService greetingService;

    /*@Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }*/

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}