package cn.persist.dao.impl;

import cn.persist.bean.UserInfo;
import cn.persist.dao.UserDao;
import cn.persist.utils.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by ACER on 2017/10/26.
 */
public class UserDaoImpl implements UserDao {
    public void add(UserInfo userInfo) {
        //向数据库添加信息
        try{
            Connection conn = DBConn.dbConn();
            String changeSql = "INSERT INTO userinfo(username,password,sex,age,job,id_card,phone) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(changeSql);
            pstm.setString(1,userInfo.getUsername());
            pstm.setString(2,userInfo.getPassword());
            pstm.setString(3, userInfo.getSex());
            pstm.setInt(4, userInfo.getAge());
            pstm.setString(5, userInfo.getJob());
            pstm.setString(6,userInfo.getId_card());
            pstm.setString(7,userInfo.getPhone());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
