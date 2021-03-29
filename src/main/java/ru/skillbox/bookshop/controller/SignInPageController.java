package ru.skillbox.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInPageController {

    @GetMapping("/signin")
    public String signinPage() {
        return "signin";
    }
}
