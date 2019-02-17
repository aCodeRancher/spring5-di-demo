package guru.springframework.controllers;

import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
    @MockBean
    private MyController mycontroller;

    @Before
    public void setUp() throws Exception{
        when (mycontroller.hello()).thenReturn("Hello - Primary Greeting service");
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals("Hello - Primary Greeting service", mycontroller.hello());
    }
}
