package ru.skillbox.bookshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.skillbox.bookshop.service.BookService;

@Controller
@RequestMapping("/bookshop")
@AllArgsConstructor
public class MainPageController {

    private final BookService bookService;

    @GetMapping("/main")
    public String mainPage(Model model) {
        model.addAttribute("bookData", bookService.getBooksData());
        return "index";
    }
}
