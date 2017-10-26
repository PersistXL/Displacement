package cn.persist.dao.impl;

import cn.persist.bean.UserBean;
import cn.persist.dao.UserDao;
import cn.persist.utils.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Created by ACER on 2017/10/26.
 */
public class UserDaoImpl implements UserDao {
    public void add(UserBean userBean) {
        //向数据库添加信息
        try{
            Connection conn = DBConn.dbConn();
            String changeSql = "INSERT INTO information(sex,age,job,post_message,order_situation,id_card,phone) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(changeSql);
            pstm.setString(1, userBean.getSex());
            pstm.setInt(2, userBean.getAge());
            pstm.setString(3, userBean.getJob());
            pstm.setString(3,userBean.getPost_message());
            pstm.setString(4,userBean.getOrder_situation());
            pstm.setString(5,userBean.getId_card());
            pstm.setString(6,userBean.getPhone());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
