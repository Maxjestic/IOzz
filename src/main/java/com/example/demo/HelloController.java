package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello, time is: " + LocalDateTime.now();
    }
}
