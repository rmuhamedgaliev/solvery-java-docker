package dev.rmuhamedgaliev.solveryjavadocker.infrastructure.representation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello from Spring in Docker";
    }
}
