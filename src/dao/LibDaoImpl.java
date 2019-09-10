package dao;

import model.Book;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibDaoImpl{
    private static final List<User> userDb=new ArrayList<>();
    private static final List<Map<String, Object>> categorys=new ArrayList<>();
    private static final List<Book> books=new ArrayList<>();

    public void regist(User user) {
        if(!userDb.contains(user)){
            userDb.add(user);
        }
    }

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
    public void addBookCategory(Long id, String categoryName, String description) {
        Map<String,Object> map=new HashMap<>();
        map.put("id",id);
        map.put("categoryName",categoryName);
        map.put("description",description);
        categorys.add(map);
    }

    public List<Map<String, Object>> getAllBookCategory() {

        return categorys;
    }

    public void addBook(Book book) {
        if(!books.contains(book)){
            books.add(book);
        }
    }

    public List<Book> getBooksByCondition(String bookID, String bookName, String categoryName) {

        return null;
    }

    public static List<User> getUserDb() {
        return userDb;
    }

    public static List<Map<String, Object>> getCategorys() {
        return categorys;
    }

    public static List<Book> getBooks() {
        return books;
    }
}
