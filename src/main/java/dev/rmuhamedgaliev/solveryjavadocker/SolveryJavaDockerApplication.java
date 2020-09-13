package dev.rmuhamedgaliev.solveryjavadocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "dev.rmuhamedgaliev.solveryjavadocker"
})
public class SolveryJavaDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolveryJavaDockerApplication.class, args);
    }

}
