package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {

   @Autowired
    private MyController mycontroller;


    @Test
    public void testPrimaryGreeting() throws Exception{
        assertEquals("Hello - Primary Greeting service", mycontroller.hello());
    }
}
