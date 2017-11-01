package cn.persist.dao.impl;

import cn.persist.bean.UserInfo;
import cn.persist.dao.LoginDao;
import cn.persist.utils.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDaoImpl implements LoginDao {

    public boolean Login(UserInfo userInfo) {
       try {
           System.out.println("dao曾方法"+userInfo);
           Connection conn = DBConn.dbConn();
//           Statement sql = conn.createStatement();//创建语句对象
           String sql = "select * from userinfo WHERE username = ? AND password = ?";
           PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.setString(1, userInfo.getUsername());
           pstm.setString(2,userInfo.getPassword());
           ResultSet rs = pstm.executeQuery();
           if (rs.next()) {
               System.out.println("查询出来的结果"+rs);
               DBConn.close(conn,pstm,rs);
               return true;
           }
       }catch (Exception e){
           System.out.println(e);
       }

        return false;
    }
}
