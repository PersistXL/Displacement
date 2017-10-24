package cn.persist.servlet;


import cn.persist.bean.UserInfo;
import cn.persist.service.LoginService;
import cn.persist.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ACER on 2017/10/24.
 */

@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);

        LoginService loginService = new LoginServiceImpl();

        UserInfo userInfo = new UserInfo(username, password);

        boolean bool = loginService.Login(userInfo);

        if (bool) {
            System.out.println("密码正确");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else {
            System.out.println("密码错误");
            req.getRequestDispatcher("Login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
