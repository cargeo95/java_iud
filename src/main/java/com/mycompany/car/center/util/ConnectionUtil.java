package com.mycompany.car.center.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtil {
    
    
    private static final String USER = "postgres";
    private static final String PASSWORD = "231100";
    private static final String URL = "jdbc:postgresql://localhost:5432/bd_iud";
    
    public static Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(URL, USER, PASSWORD);
    
    }
    
}
