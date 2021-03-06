package com.app.mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author:wuqi
 * @date:2020/2/21
 * @description:com.app.mybatis
 * @version:1.0
 */
public class JDBCTest {


    public static void main(String[] args) throws Exception {
        //Class.forName("com.mysql.jdbc.Driver");1.5后SPI机制
        Connection con = DriverManager.getConnection("jdbc:mysql://mcip:3306/study","root","123456");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        while (resultSet.next()){
            System.out.println(resultSet.getString("user_id")+"-"+
                    resultSet.getString("user_name"));
        }
        con.close();
    }
}
