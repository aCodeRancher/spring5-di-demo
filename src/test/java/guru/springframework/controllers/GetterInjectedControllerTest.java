package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 * Created by jt on 5/24/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GetterInjectedControllerTest {
    @Autowired
    private GetterInjectedController getterInjectedController;

    @Test
    public void testGreeting() throws Exception {
        assertEquals("Hello - I was injected by the getter", getterInjectedController.sayHello());
    }
}