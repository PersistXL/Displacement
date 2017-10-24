package cn.persist.dao.impl;

import cn.persist.bean.UserInfo;
import cn.persist.dao.LoginDao;
import cn.persist.utils.DBConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by ACER on 2017/10/24.
 */
public class LoginDaoImpl implements LoginDao {

    public boolean Login(UserInfo userInfo) {
       try {
           System.out.println("dao曾方法"+userInfo);
           Connection conn = DBConn.dbConn();
           Statement sql = conn.createStatement();//创建语句对象
           ResultSet rs = sql.executeQuery("select * from userinfo");
           while (rs.next()) {
               System.out.println("while循环"+userInfo);
               String username = rs.getString(2);
               String password = rs.getString(3);

               if (userInfo.getUsername().equals(username) && userInfo.getPassword().equals(password)) {
                   return true;
               }
           }
       }catch (Exception e){
           System.out.println(e);
       }

        return false;
    }
}
