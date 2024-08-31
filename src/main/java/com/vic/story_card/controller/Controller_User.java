package com.vic.story_card.controller;

import com.vic.story_card.model.Model_User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_User {
    @GetMapping("/user_name")
    public String user_name(Model model) {
        Model_User user = new Model_User("Vic",
                "vic.lim@icloud.com",
                "ADMIN",
                "MALE",
                "ADMIN");
        model.addAttribute("user", user);
        return "user_name";
    }
}
