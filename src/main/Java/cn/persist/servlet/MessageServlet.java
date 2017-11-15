package cn.persist.servlet;

import cn.persist.bean.MessageInfo;
import cn.persist.bean.UserInfo;
import cn.persist.service.MessageService;
import cn.persist.service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ACER on 2017/11/11.
 */
@WebServlet(name = "MessageServlet",urlPatterns = "/MessageServlet")
public class MessageServlet extends HttpServlet {
    MessageService messageService = new MessageServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String method = request.getParameter("method");
        System.out.println(method);
        if(method.equals("refers")){
            refers(request,response);
        }if(method == "refer"){

        }
//        MessageInfo messageInfo = new MessageInfo();
//        messageInfo.setName(request.getParameter("name"));
//        messageInfo.setEmail(request.getParameter("email"));
//        messageInfo.setDate(request.getParameter("date"));
//        messageInfo.setPhone(request.getParameter("phone"));
//        messageInfo.setMatter(request.getParameter("matter"));
//        String name = request.getParameter("name");
//

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request , response);
    }
    public void refers (HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException{
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String date = request.getParameter("date");
        String phone = request.getParameter("phone");
        String matter = request.getParameter("matter");

        MessageInfo messageInfo = new MessageInfo();
        messageInfo.setName(name);
        messageInfo.setEmail(email);
        messageInfo.setDate(date);
        messageInfo.setPhone(phone);
        messageInfo.setMatter(matter);


//        MessageService messageService = new MessageServiceImpl();
        messageService.refers(messageInfo);

    }
}
