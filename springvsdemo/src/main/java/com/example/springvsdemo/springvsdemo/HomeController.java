package com.example.springvsdemo.springvsdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController{
    @GetMapping("/")
    public String home(){
        return "Hello from Spring boot!!";
    }
}