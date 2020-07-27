/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_management;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DB {
    private static Connection con;
    public static Connection connect()throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url="jdbc:mysql://localhost:3306/stock_management";
        con=DriverManager.getConnection(url,"root","");
    
    return con;
    }
}
