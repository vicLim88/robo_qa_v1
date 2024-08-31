package com.vic.story_card.controller;

import com.vic.story_card.model.Model_User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controller_Users {
    @GetMapping("/user_names")
    public String user_names(Model model) {
        Model_User user_vic = new Model_User("Vic_Admin",
                "vic.lim@icloud.com",
                "ADMIN",
                "MALE",
                "ADMIN");
        Model_User user_vic2 = new Model_User("Jackson32",
                "Jackson.Michael@icloud.com",
                "USER",
                "MALE",
                "STARTER");
        Model_User user_vic3 = new Model_User("Victoria_1",
                "victoria.secret@icloud.com",
                "USER",
                "FEMALE",
                "GROWTH");
        List<Model_User> users = new ArrayList<>();
        users.add(user_vic);
        users.add(user_vic2);
        users.add(user_vic3);

        model.addAttribute("users", users);
        return "user_names";
    }
}
