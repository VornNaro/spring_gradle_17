package com.test.springgradle17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGradle17Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringGradle17Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Gradle 17";
    }

}
