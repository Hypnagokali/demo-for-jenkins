package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {


    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
