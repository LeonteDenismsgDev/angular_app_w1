package elitisti.angular_app.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {



    @PostMapping("/greet")
    public String greet(@RequestBody String name) {
        return "Hello " + name;
    }
}