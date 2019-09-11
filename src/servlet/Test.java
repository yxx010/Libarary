package servlet;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       Book book=new Book("1","管理者","经管","100","很好看");
       Book book1= new Book("2","高效","经管","100","很好看");
       List<Book> books=new ArrayList<>();
       books.add(book);
        books.add(book1);
        System.out.println(books);
       List<Book> list=search(books,"2","","");
        System.out.println(list);


    }
    public static List<Book> search(List<Book>books,String bookID, String bookName, String categoryName){
        List<Book> bookList=new ArrayList<>();
        bookList=books;
        if (!bookID.isEmpty()) {
            for (int i = 0; i <bookList.size() ; i++) {
                Book book=bookList.get(i);
                if(!book.getId().equals(bookID)){
                    bookList.remove(book);
                }
            }
        }
        if (!bookName.isEmpty()) {
            for (int i = 0; i <bookList.size() ; i++) {
                Book book=bookList.get(i);
                if(!book.getName().equals(bookName)){
                    bookList.remove(book);
                }
            }
        }
        if (!categoryName.isEmpty()) {
            for (int i = 0; i <bookList.size() ; i++) {
                Book book=bookList.get(i);
                if(!book.getCategory().equals(categoryName)){
                    bookList.remove(book);
                }
            }

        }

        return bookList;
    }
}
