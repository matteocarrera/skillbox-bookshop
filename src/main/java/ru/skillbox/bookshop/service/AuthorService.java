package ru.skillbox.bookshop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.skillbox.bookshop.data.Author;
import ru.skillbox.bookshop.repository.AuthorRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Map<String, List<Author>> getAuthors() {
        List<Author> authors = authorRepository.getAuthors();

        return authors.stream().collect(Collectors.groupingBy((Author a) -> a.getSecondName().substring(0, 1)));
    }
}
