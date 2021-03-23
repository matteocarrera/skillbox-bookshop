package ru.skillbox.bookshop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.skillbox.bookshop.data.Book;
import ru.skillbox.bookshop.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getBooksData() {
        return bookRepository.getBooksData();
    }
}
