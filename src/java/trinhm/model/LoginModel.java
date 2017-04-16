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

/**
 *
 * @author tris
 */
public class LoginModel {
    
    public boolean checkLogin(String Username, String Password) {
        try{
        
        PreparedStatement stm=null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Personel";
            Connection con = DriverManager.getConnection(url, "sa", "123");
        String sql="select * from Users where Username=? and Password=? ";
      
            stm = con.prepareStatement(sql);
        stm.setString(1, Username);
        stm.setString(2, Password);
        ResultSet rs=stm.executeQuery();
        boolean exist=false;
        exist=rs.next();
        rs.close();
        stm.close();
        con.close();
        if(exist){
            return true;
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return  false;
    }
}
