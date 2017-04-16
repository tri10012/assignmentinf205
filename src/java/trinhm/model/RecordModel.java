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
import trinhm.bean.Record;
import trinhm.bean.Staff;

/**
 *
 * @author tris
 */
public class RecordModel {
    
    public RecordModel(){}
    
    public static List<Record> showProduct(String tendg){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "select * from Records";
            if(tendg.length() > 0){
                sql += " where Name like '%"+tendg+"%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<Record> list = new ArrayList<Record>();
            while(rs.next()){
                String Id = rs.getString("Id");
                
                String Type = rs.getString("Type");
                String Reason = rs.getString("Reason");
                String Date = rs.getString("Date");
                String StaffId = rs.getString("StaffId");
                Record dg = new Record(Id,Type,Reason,Date,StaffId);
                list.add(dg);
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
            String sql = "delete from Records where Id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, Id);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
     }
        
        public static void insert(Record dg){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "insert into Records values(?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
           
            stm.setString(1, dg.getType());
            stm.setString(2, dg.getReason());
            stm.setString(3, dg.getDate());
            stm.setString(4, dg.getStaffId());
            
            
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
