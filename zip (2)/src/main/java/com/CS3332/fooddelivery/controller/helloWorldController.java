package com.CS3332.fooddelivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloWorldController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}