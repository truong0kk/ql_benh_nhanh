/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class loginCtl {
    public boolean checkAccount(String user, String password) // Kiem tra tai khoan va mat khau dung?
       {
           DAO d = new DAO();
           String sql = "Select uusername, upassword from users";
           try 
           {
               Connection conn = d.getConnection();
               Statement st = conn.createStatement();
               ResultSet rs = st.executeQuery(sql);
               while(rs.next())
               {
                   if(user.equals(rs.getString("uusername")) && password.equals(rs.getString("upassword")))
                       return true;
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return false;
       } 
}
