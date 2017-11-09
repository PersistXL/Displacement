package cn.persist.dao.impl;

import cn.persist.bean.UserInfo;
import cn.persist.dao.LoginDao;
import cn.persist.utils.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDaoImpl implements LoginDao {
    PreparedStatement pstm = null;
    Connection conn=null;
    ResultSet rs = null;
    public UserInfo Login(UserInfo userInfo) {
        UserInfo userInfo1 =new UserInfo();
        try {
           System.out.println("dao曾方法"+userInfo);
            conn = DBConn.dbConn();
//           Statement sql = conn.createStatement();//创建语句对象
           String sql = "select * from userinfo WHERE username = ? AND password = ?";
            pstm = conn.prepareStatement(sql);
           pstm.setString(1, userInfo.getUsername());
           pstm.setString(2,userInfo.getPassword());
            rs = pstm.executeQuery();
           if (rs.next()) {
               System.out.println("查询出来的结果"+rs);
               userInfo1 .setUsername(rs.getString(2));
               userInfo1 .setPassword(rs.getString(3));
               userInfo1 .setSex(rs.getString(4));
               userInfo1 .setAge(rs.getInt(5));
               userInfo1 .setJob(rs.getString(6));
               userInfo1 .setId_card(rs.getString(7));
               userInfo1 .setPhone(rs.getString(8));
               userInfo1 .setImg(rs.getString(9));
               return userInfo1;
           }
       }catch (Exception e){
           System.out.println(e);
       }finally {
            DBConn.close(conn,pstm,rs);

        }

        return userInfo1;
    }
}
