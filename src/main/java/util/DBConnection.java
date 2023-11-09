/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author virgi
 */
public class DBConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/stockDB";
    private static final String USER= "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection connection=null;
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        } 
        catch (ClassNotFoundException | SQLException ex) {
            
            ex.printStackTrace();
            
        }
        return connection;
    }
           
            
    
}
