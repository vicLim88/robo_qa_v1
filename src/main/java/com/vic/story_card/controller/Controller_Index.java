package com.vic.story_card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_Index {
    @RequestMapping("/")
    public String main_page(){
        return "main_page";
    }
}
