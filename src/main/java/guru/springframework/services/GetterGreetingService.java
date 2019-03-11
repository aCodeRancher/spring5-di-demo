package guru.springframework.services;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;
/**
 * Created by jt on 5/24/17.
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
