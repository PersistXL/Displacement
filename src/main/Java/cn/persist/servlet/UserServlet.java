package cn.persist.servlet;

import cn.persist.bean.UserInfo;
import cn.persist.service.UserService;
import cn.persist.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ACER on 2017/10/26.
 */
@WebServlet(name = "UserServlet",urlPatterns ="/UserServlet" )
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String method = request.getParameter("method");
        System.out.println(method)  ;
        if(method == "add"){
            add(request,response);
        }if(method == "delete"){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void add(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        String sex = request.getParameter("sex");
        int age = Integer.parseInt(request.getParameter("age"));
        String  job = request.getParameter("job");
        String  post_message = request.getParameter("post_message");
        String order_situation = request.getParameter("order_situation");
        String id_card = request.getParameter("id_card");
        String phone = request.getParameter("phone");
//        System.out.println(sex+age+job+post_message+order_situation+id_card+phone);
        UserInfo userInfo = new UserInfo();
        userInfo.setId_card(id_card);
        userInfo.setAge(age);
        userInfo.setJob(job);
        userInfo.setOrder_situation(order_situation);
        userInfo.setPost_message(post_message);
        userInfo.setPhone(phone);
        userInfo.setSex(sex);

        userService.add(userInfo);
    }
    protected void revamp(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        UserInfo userInfo = new UserInfo();
    }
}
