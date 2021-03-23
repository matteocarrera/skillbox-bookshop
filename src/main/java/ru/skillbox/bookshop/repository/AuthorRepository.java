package ru.skillbox.bookshop.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.skillbox.bookshop.data.Author;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class AuthorRepository {

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
