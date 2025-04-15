package microservices_java_btc.com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloworld")
    public String helloWorldMethod() {
        return "Hello, World!";
    }
}