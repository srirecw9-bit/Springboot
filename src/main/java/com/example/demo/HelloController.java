package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from Aziznagar Boot + Docker + Kubernetes!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Kubernetes!";
    }

    @GetMapping("/employee")
    public String employee() {
        return "Employee: 121, Name: Jaisriram, Dept: CSE";
    }
}
