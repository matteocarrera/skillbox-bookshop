package ru.skillbox.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecentPageController {

    @GetMapping("/recent")
    public String recentPage() {
        return "recent";
    }
}
