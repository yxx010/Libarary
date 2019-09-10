package servlet;

import dao.LibDaoImpl;
import service.LibServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        LibServiceImpl libService=new LibServiceImpl();
        if(libService.isLogin(username,password)){
            System.out.println("登录成功！");
            request.getRequestDispatcher("/server.html").forward(request,response);
        }else {
            System.out.println("登录失败");
            response.getWriter().println("登录失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}