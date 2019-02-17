package guru.springframework.controllers;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * Created by jt on 5/24/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstructorInjectedControllerTest {

    @Autowired
    private ConstructorInjectedController constructorInjectedController;


    @Test
    public void testGreeting() throws Exception {
        assertEquals("Hello - I was injected via the constructor!!!", constructorInjectedController.sayHello());
    }
}