package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ControllerStudent {
    @GetMapping("/users")
    private String showUsers(){
        return "Usuarios";
    }

    @PostMapping(value = "/friends",headers = {

    })
    private void AddFriend(){

    }

    @GetMapping("/people")
    private String showPeople(){
        return "Hola personas";
    }
}
