package ru.skillbox.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookshop")
public class GenresController {

    @GetMapping("/genres")
    public String genresPage() {
        return "genres";
    }
}
