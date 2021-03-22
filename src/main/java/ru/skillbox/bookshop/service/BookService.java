package ru.skillbox.bookshop.service;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.skillbox.bookshop.data.Book;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final JdbcTemplate jdbcTemplate;

    private final String SQL =
            "SELECT t.id, title, CONCAT(authors.firstName, ' ',authors.secondName) AS author, priceOld, price " +
            "FROM books t\n" +
            "INNER JOIN authors ON authors.id = t.authorId";

    public List<Book> getBooksData() {
        List<Book> books = jdbcTemplate.query(SQL, (ResultSet resultSet, int rowNum) -> {
            Book book = new Book();
            book.setId(resultSet.getInt("id"));
            book.setAuthor(resultSet.getString("author"));
            book.setTitle(resultSet.getString("title"));
            book.setPriceOld(resultSet.getString("priceOld"));
            book.setPrice(resultSet.getString("price"));
            return book;
        });
        return new ArrayList<>(books);
    }
}
