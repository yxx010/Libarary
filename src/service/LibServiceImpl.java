package service;

import dao.LibDaoImpl;
import model.Book;
import model.User;

import java.util.List;
import java.util.Map;

public class LibServiceImpl{
    LibDaoImpl libDao=new LibDaoImpl();
    public void regist(User user){
        libDao.regist(user);
    }
    public boolean isLogin(String username, String password){
        if(libDao.login(username,password)==1){
            return true;
        }else
        {
            return false;
        }

    }
    public void addBookCategory(Long id, String categoryName, String description){
        libDao.addBookCategory(id, categoryName, description);
    }
    public List<Map<String, Object>> getAllBookCategory(){
        return libDao.getAllBookCategory();
    }
    public void addBook(Book book){
        libDao.addBook(book);
    }
    public List<Book> getBooksByCondition(String bookID, String bookName, String categoryName){
       return libDao.getBooksByCondition(bookID,bookName,categoryName);
    }

}
