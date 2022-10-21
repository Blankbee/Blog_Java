/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blog;

import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author sengul.bayrak
 */
//3. adım
public class connect {
    
    private static Connection con = null;
    //private static Statement st;
 
    public static Connection connection()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:D:/OneDrive/Masaüstü/java/Blog/blog.db";
            con = DriverManager.getConnection(url);
            System.out.println("Connection succesful!");
            return con;
            
        }
        catch(Exception e)
        {
            System.out.println("Connection failed!");
             return null;
        }
        
           
    }
    
}
