package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


/**
 * Created by jt on 5/24/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GetterInjectedControllerTest {
    @MockBean
    private GetterInjectedController getterInjectedController;

    @MockBean
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingService;

    @Before
    public void setUp() throws Exception {
        //this.getterInjectedController = new GetterInjectedController();
       // this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
        getterInjectedController.setGreetingService(greetingService);
        when(getterInjectedController.sayHello()).thenReturn(GreetingServiceImpl.HELLO_GURUS);
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}