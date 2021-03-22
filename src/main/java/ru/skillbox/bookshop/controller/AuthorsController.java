package ru.skillbox.bookshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.skillbox.bookshop.service.AuthorService;

@Controller
@RequestMapping("/bookshop")
@AllArgsConstructor
public class AuthorsController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public String authorsPage(Model model) {
        model.addAttribute("authors", authorService.getAuthors());
        return "authors";
    }
}
