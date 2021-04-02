package ru.skillbox.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpPageController {

    @GetMapping("/signup")
    public String signupPage() {
        return "signup";
    }
}
