package com.example.HolaMundo2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class hola {
    
    @GetMapping("/")
    public String hola(){
        return "hola Mundo";
    }
}
