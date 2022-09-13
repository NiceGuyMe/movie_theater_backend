package com.example.movie_theater.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class pingController {
    @GetMapping("/ping")
    public  String pong(){
        return "pong";
    }
    @PostMapping("/hello")
    public String postBody(@RequestBody String fullName) {
        return "Hello " + fullName;
    }
}
