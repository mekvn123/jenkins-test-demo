package com.example.jenkins_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/hello")
    public void getHello() {
        System.out.println("this is a test hello Api.");
    }
}
