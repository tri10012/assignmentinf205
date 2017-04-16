/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinhm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import trinhm.bean.User;

/**
 *
 * @author tris
 */
public class UserModel {
    public UserModel() {}

    public static List<User> showProduct(String tentk){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "select * from Users";
            if(tentk.length() > 0){
                sql += " where Name like '%"+tentk+"%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<User> list = new ArrayList<User>();
            while(rs.next()){
                String Username = rs.getString("Username");
                
                String Password = rs.getString("Password");
                String Fullname = rs.getString("Fullname");
                User tk = new User(Username,Password,Fullname);
                list.add(tk);
            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    } 
    public static void delete(String Username){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "delete from Users where Username=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, Username);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void insert(User tk){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "insert into Users values(?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tk.getUsername());
            stm.setString(2, tk.getPassword());
            stm.setString(3, tk.getFullname());
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
}
