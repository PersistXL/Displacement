package cn.persist.utils;

import java.sql.*;

/**
 * Created by ACER on 2017/10/24.
 */

public class DBConn {
    private static Connection conn = null;

    public static Connection dbConn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            String url = "jdbc:mysql://localhost:3306/change?useUnicode=true&characterEncoding=UTF-8";
            String username = "root";
            String password = "root";

            conn = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }

    public static void close( Connection conn , PreparedStatement pstm,ResultSet rs)  {
        try{
        if(rs != null){
            rs.close();
        }
        if(pstm !=null){
            pstm.close();
        }
        if(conn != null){
            conn.close();
        }}catch (Exception e){
            e.fillInStackTrace();
        }
    }
    public static void close( Connection conn , PreparedStatement pstm) throws SQLException {
        if(pstm !=null){
            pstm.close();
        }
        if(conn != null){
            conn.close();
        }
    }
}