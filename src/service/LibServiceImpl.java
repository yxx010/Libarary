package service;

import dao.LibDaoImpl;
import model.Book;
import model.User;

import java.util.List;
import java.util.Map;

public class LibServiceImpl{
    LibDaoImpl libDao=new LibDaoImpl();
    void regist(User user){
        libDao.regist(user);
    }
    int login(String username, String password){
        return libDao.login(username,password);

    }
    void addBookCategory(Long id, String categoryName, String description){

    }
    List<Map<String, Object>> getAllBookCategory(){

    }
    void addBook(Book book){

    }
    List<Book> getBooksByCondition(String bookID, String bookName, String categoryName){

    }

}
