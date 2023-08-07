package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String fun(){
        System.out.println("in fun");
        return "<h1>Welcome</h1>";
    }



}
