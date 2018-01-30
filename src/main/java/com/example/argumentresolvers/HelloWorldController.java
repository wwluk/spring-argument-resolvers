package com.example.argumentresolvers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello(@ResolveValue String value) {
        String greetings = String.format("Hello %s!", value);
        System.out.println(greetings);
        return greetings;
    }
}
