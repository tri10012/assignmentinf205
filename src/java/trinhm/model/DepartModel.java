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
import trinhm.bean.Depart;

/**
 *
 * @author tris
 */
public class DepartModel {
   public DepartModel() {}

    public static List<Depart> showProduct(String tenpb){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "select * from Departs";
            if(tenpb.length() > 0){
                sql += " where Name like '%"+tenpb+"%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<Depart> list = new ArrayList<Depart>();
            while(rs.next()){
                String Id = rs.getString("Id");
                
                String Name = rs.getString("Name");
                
                Depart pb = new Depart(Id,Name);
                list.add(pb);
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
            String sql = "delete from Departs where Id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, Id);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public static void insert(Depart pb){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "insert into Departs values(?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, pb.getId());
            stm.setString(2, pb.getName());
            
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
      public static void update(Depart pb){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "update Departs set Name=? where Id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, pb.getName());
            stm.setString(2, pb.getId());
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
