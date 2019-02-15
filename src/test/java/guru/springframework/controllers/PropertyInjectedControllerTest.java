package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.when;

/**
 * Created by jt on 5/24/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyInjectedControllerTest {
    @MockBean
    private PropertyInjectedController propertyInjectedController;


    @Before
    public void setUp() throws Exception {
       // this.propertyInjectedController = new PropertyInjectedController();
        //this.propertyInjectedController.greetingService = new GreetingServiceImpl();
        when(propertyInjectedController.sayHello()).thenReturn(GreetingServiceImpl.HELLO_GURUS);
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}