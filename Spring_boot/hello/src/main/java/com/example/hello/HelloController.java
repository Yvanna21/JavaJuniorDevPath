package com.example.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/hello") // This will be the base URL for all
    public String hello(){
        return "Hello World!";
    }
}
