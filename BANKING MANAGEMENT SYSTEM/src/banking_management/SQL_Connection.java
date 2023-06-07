package banking_management;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;


 public class SQL_Connection {
    static Connection connect;
    
    public static Connection ConnectorDb(){
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
        System.out.println("Database Connected!");    
        return cn;
        
        
    } catch (Exception e) {
        System.out.println("Database not Connected!");
        return null;
    }
    
    }
    
}
