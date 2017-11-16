package cn.persist.dao.impl;

import cn.persist.bean.MessageInfo;
import cn.persist.dao.MessageDao;
import cn.persist.utils.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public List<MessageInfo> query() {
        List<MessageInfo> list = new ArrayList<MessageInfo>();
        //在数据库中查询信息
        try{
            Connection conn = DBConn.dbConn();
            String changeSql = "select * from message";
            PreparedStatement pstm = conn.prepareStatement(changeSql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                MessageInfo messageInfo = new MessageInfo();
                messageInfo.setName(rs.getString("name"));
                messageInfo.setEmail(rs.getString("email"));
                messageInfo.setPhone(rs.getString("phone"));
                messageInfo.setMatter(rs.getString("matter"));
                list.add(messageInfo);
            }
            return list;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
