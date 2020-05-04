/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakshi jain
 */

import java.sql.*;
import java.sql.DriverManager;
public class javaconnect {
   private static String Username="root";
   private static String Password="";
    public static Connection  getConnection()
    {
         Connection con = null;
         
        try
        {
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance",Username,Password);
            System.out.println("connected");
           
        }
        
        catch(Exception e)
        {
            
            System.out.println(e.getMessage());
        }
        return con;
    }
}
