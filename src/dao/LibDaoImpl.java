package dao;

import model.Book;
import model.User;
import service.LibServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LibDaoImpl implements LibServiceImpl {
    private static final List<User> userDb=new ArrayList<>();
    private static final List<Map<String, Object>> categorys=new ArrayList<>();
    private static final List<Book> books=new ArrayList<>();

    @Override
    public void regist(User user) {
        if(!userDb.contains(user)){
            userDb.add(user);
        }
    }

    @Override
    public int login(String username, String password) {
        if(userDb!=null){
            for (int i = 0; i <userDb.size() ; i++) {
                if(userDb.get(0).getName().equals(username)){
                    if(userDb.get(0).getPassword().equals(password)){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public void addBookCategory(Long id, String categoryName, String description) {

    }

    @Override
    public List<Map<String, Object>> getAllBookCategory() {
        return null;
    }

    @Override
    public void addBook(Book book) {
        if(!books.contains(book)){
            books.add(book);
        }
    }

    @Override
    public List<Book> getBooksByCondition(String bookID, String bookName, String categoryName) {
        return null;
    }
}
