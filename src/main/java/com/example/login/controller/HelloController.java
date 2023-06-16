package com.example.login.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloController() {
        return "hello";
    }

    @GetMapping("/admin")
    @Secured("/ADMIN")
    public String helloAdmin() {
        return "admin";
    }
}
