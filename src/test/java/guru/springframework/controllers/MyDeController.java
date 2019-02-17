package guru.springframework.controllers;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles="de")
public class MyDeController {

    @Autowired
    private MyController mycontroller;

    @Test
    public void testGermanGreeting()throws Exception{
        assertEquals("Primärer Grußdienst",
                mycontroller.hello());
    }
}
