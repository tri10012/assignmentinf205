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
import trinhm.bean.Staff;


/**
 *
 * @author tris
 */
public class StaffModel {
    
    public StaffModel() {}

    public static List<Staff> showProduct(String tennv){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "select * from Staffs";
            if(tennv.length() > 0){
                sql += " where Name like '%"+tennv+"%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<Staff> list = new ArrayList<Staff>();
            while(rs.next()){
                String Id = rs.getString("Id");
                
                String Name = rs.getString("Name");
                String Gender = rs.getString("Gender");
                String Birthday = rs.getString("Birthday");
                String Photo = rs.getString("Photo");
                String Email = rs.getString("Email");
                String Phone = rs.getString("Phone");
                double Salary = rs.getDouble("Salary");
                String Notes = rs.getString("Notes");
                String DepartId = rs.getString("DepartId");
                Staff nv = new Staff(Id,Name,Gender,Birthday,Photo,Email,Phone,Salary,Notes,DepartId);
                list.add(nv);
            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
        public static void delete(String Id){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "delete from Staffs where Id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, Id);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
        
         public static void insert(Staff nv){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "insert into Staffs values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, nv.getId());
            stm.setString(2, nv.getName());
            stm.setString(3, nv.getGender());
            stm.setString(4, nv.getBirthday());
            stm.setString(5, nv.getPhoto());
            stm.setString(6, nv.getEmail());
            stm.setString(7, nv.getPhone());
            stm.setDouble(8, nv.getSalary());
            stm.setString(9, nv.getNotes());
            stm.setString(10, nv.getDepartId());
            
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
         
         public static void update(Staff nv){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "update Staffs set Name=?, Gender=?, Birthday=?, Photo=?,Email=?, Phone=?, Salary=?, Notes=?,DepartId=? where Id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, nv.getName());
            stm.setString(2, nv.getGender());
            stm.setString(3, nv.getBirthday());
            stm.setString(4, nv.getPhoto());
            stm.setString(5, nv.getEmail());
            stm.setString(6, nv.getPhone());
            stm.setDouble(7, nv.getSalary());
            stm.setString(8, nv.getNotes());
            stm.setString(9, nv.getDepartId());
            stm.setString(10, nv.getId());
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
