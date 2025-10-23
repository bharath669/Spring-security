package com.example.Securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
