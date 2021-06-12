package com.example.stalk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable("name") String name){
        return "Welcome to bean stalk code pipeline demo [" + name + "], Updated through CICD process";
    }
}
