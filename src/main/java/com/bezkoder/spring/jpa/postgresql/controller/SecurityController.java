package com.bezkoder.spring.jpa.postgresql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/home")
    public String homeEndpoint() {
        return "Baeldung !";
    }
}
