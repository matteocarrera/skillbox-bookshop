package ru.skillbox.bookshop.service;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.skillbox.bookshop.data.Author;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private final JdbcTemplate jdbcTemplate;

    private final String SQL =
            "SELECT * FROM authors";

    public List<Author> getAuthors() {
        List<Author> authors = jdbcTemplate.query(SQL, (ResultSet resultSet, int rowNum) -> {
            Author author = new Author();
            author.setId(resultSet.getInt("id"));
            author.setFirstName(resultSet.getString("firstName"));
            author.setSecondName(resultSet.getString("secondName"));
            return author;
        });
        return new ArrayList<>(authors);
    }
}
