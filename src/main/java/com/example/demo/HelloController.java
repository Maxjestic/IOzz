package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.LocalTime.now;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello, time is: " + now();
    }
}
