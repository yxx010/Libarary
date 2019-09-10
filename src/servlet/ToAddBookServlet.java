package servlet;

import model.Book;
import service.LibServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ToAddBookServlet")
public class ToAddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LibServiceImpl libService=new LibServiceImpl();
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String category=request.getParameter("category");
        String price=request.getParameter("price");
        String des=request.getParameter("des");
        Book book=new Book(id,name,category,price,des);
        libService.addBook(book);
        response.getWriter().println("添加成功");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
