package servlet;

import dao.LibDaoImpl;
import model.User;
import service.LibServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    private LibServiceImpl libService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        User user=new User(username,password,phone,email);
        System.out.println(user);
        LibDaoImpl libDao=new LibDaoImpl();
        libDao.regist(user);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
