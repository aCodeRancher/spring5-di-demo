package guru.springframework.controllers;

import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles="es")
public class MyControllerTest {
    @Autowired
    private MyController mycontroller;


    @Test
    public void testGreeting() throws Exception{
        assertEquals("Servicio de Saludo Primario", mycontroller.hello());
    }
}
