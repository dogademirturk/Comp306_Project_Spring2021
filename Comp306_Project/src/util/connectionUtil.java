/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import com.mysql.cj.jdbc.MysqlDataSource;

public class connectionUtil {
     
     private static  String servername="localhost";
     private static String dbname="real_estate_db";
     private static String username="root";
     private static Integer portnumber=3306;
     //change it to your password
     private static String password="Zeynepsila1.";
    public static Connection getTheConnection()
    {
        Connection connection =null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
         try {
             connection=datasource.getConnection();
         } catch (SQLException ex) {
             Logger.getLogger(connectionUtil.class.getName()).log(Level.SEVERE, null, ex);
         }
        return connection;
        
                
    }
       
}
