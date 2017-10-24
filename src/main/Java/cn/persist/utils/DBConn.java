package cn.persist.utils;

import java.sql.Connection;
import java.sql.DriverManager;

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
}