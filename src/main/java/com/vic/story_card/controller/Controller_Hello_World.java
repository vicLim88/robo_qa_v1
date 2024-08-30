package com.vic.story_card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_Hello_World {


    // http://localhost:8080/hello_world
    @GetMapping("/hello_world")
    public String hello_world(Model model){
        model.addAttribute("message", "Hello World, this is VIC");
        return "hello_world";
    }
}
