package com.rdmishra.springbootcicd.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class Welcome {

    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to spring boot CI/CD");
    }

    @GetMapping("/v1")
    public ResponseEntity<String> cicd() {
        return ResponseEntity.ok("Successfully Achive GOAL");
    }
}
