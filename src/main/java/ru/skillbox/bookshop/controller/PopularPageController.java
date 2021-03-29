package ru.skillbox.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PopularPageController {

    @GetMapping("/popular")
    public String popularPage() {
        return "popular";
    }
}
