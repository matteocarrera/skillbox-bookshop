package ru.skillbox.bookshop.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.skillbox.bookshop.data.Book;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepository {

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
