package ru.skillbox.bookshop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.skillbox.bookshop.data.Book;
import ru.skillbox.bookshop.service.BookService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainPageController {

    private final BookService bookService;

    @ModelAttribute("bookData")
    public List<Book> getBooksData() {
        return bookService.getBooksData();
    }

    @GetMapping("/main")
    public String mainPage() {
        return "main";
    }
}
