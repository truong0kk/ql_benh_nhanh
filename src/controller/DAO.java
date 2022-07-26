/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class DAO {
    public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://TRUONG-LTC\\SQLEXPRESS01:1433;database=truongdz;user=truong;password=123123");
                   
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
        return conn;
    }
}
