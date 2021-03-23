package ru.skillbox.bookshop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.skillbox.bookshop.data.Author;
import ru.skillbox.bookshop.repository.AuthorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<Author> getAuthors() {
        return authorRepository.getAuthors();
    }
}
