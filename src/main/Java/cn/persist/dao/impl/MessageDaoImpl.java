package cn.persist.dao.impl;

import cn.persist.bean.MessageInfo;
import cn.persist.dao.MessageDao;
import cn.persist.utils.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by ACER on 2017/11/15.
 */
public class MessageDaoImpl implements MessageDao {
    public MessageInfo refers(MessageInfo messageInfo) {
        //向数据库添加信息
        try{
            Connection conn = DBConn.dbConn();
            String changeSql = "INSERT INTO message(name,email,date,phone,matter) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(changeSql);
            pstm.setString(1,messageInfo.getName());
            pstm.setString(2,messageInfo.getEmail());
            pstm.setString(3,messageInfo.getDate());
            pstm.setString(4, messageInfo.getPhone());
            pstm.setString(5, messageInfo.getMatter());
            pstm.executeUpdate();
//            pstm.setString(8,userInfo.getImg());
            System.out.println("获取信息"+pstm);
        }catch (Exception e){
            e.printStackTrace();
        }
        return messageInfo;
    }
}
