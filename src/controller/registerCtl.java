/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.users;

/**
 *
 * @author Administrator
 */
public class registerCtl {
    private registerCtl(){}; 
    private users a = new users();
    private static registerCtl instance; // single controller
    public static registerCtl getinstance()
    {
        if(instance == null)
            instance = new registerCtl();
        return instance;
    }
    
    public users getPerson() 
    {
        return a;
    }
    
    public boolean checkUsername(String username)// Kiem tra ten nguoi dung
    {
        String sql = "Select * from users";
        try 
        {
            DAO d = new DAO();
            Connection conn = d.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                if(username.equals(rs.getString("uusername")))
                    return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void setAccount(String username, String password)// set cac thuoc tinh 
    {
        a.setUusername(username);
        a.setUpassword(password);

    }
    
    public void addUser() // them nguoi dung vao co so du lieu
    {
            try
            {
                DAO d = new DAO();
                Connection conn = d.getConnection();
                PreparedStatement ps = conn.prepareStatement("insert into users values(?,?)");
                ps.setString(1, a.getUusername());
                ps.setString(2, a.getUpassword());
                int chk = ps.executeUpdate();
            if(chk > 0){
                JOptionPane.showMessageDialog(null, "Sucessfully");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error, Please re-enter the data");
            }
            }catch (Exception e) {
                e.printStackTrace();
        }     
    }
}
