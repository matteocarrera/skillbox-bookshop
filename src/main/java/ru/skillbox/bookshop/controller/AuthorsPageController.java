package ru.skillbox.bookshop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.skillbox.bookshop.service.AuthorService;

@Controller
@RequiredArgsConstructor
public class AuthorsPageController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public String authorsPage(Model model) {
        model.addAttribute("authorsMap", authorService.getAuthors());
        return "authors";
    }
}
