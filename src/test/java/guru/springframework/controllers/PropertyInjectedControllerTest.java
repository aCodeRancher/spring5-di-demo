package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


/**
 * Created by jt on 5/24/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyInjectedControllerTest {
    @Autowired
    private PropertyInjectedController propertyInjectedController;

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}