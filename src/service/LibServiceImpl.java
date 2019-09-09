package service;

import model.Book;
import model.User;

import java.util.List;
import java.util.Map;

public interface LibServiceImpl{
    void regist(User user);
    int login(String username, String password);
    void addBookCategory(Long id, String categoryName, String description);
    List<Map<String, Object>> getAllBookCategory();
    void addBook(Book book);
    List<Book> getBooksByCondition(String bookID, String bookName, String categoryName);
}
