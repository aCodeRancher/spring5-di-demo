package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by jt on 5/24/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstructorInjectedControllerTest {
    @MockBean
    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp() throws Exception {
       // this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
        when(constructorInjectedController.sayHello()).thenReturn(GreetingServiceImpl.HELLO_GURUS);
    }

    @Test
    public void testGreeting() throws Exception {

        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}