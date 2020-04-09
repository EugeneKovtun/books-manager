package net.proselyte.bookmanager.dao;

import java.util.List;
import net.proselyte.bookmanager.model.Book;

public interface BookDao {
    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();
}
