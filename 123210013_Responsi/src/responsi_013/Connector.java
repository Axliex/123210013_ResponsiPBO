package responsi_013;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;


public class Connector {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/responsi013";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection conn;
    Statement statement;
    PreparedStatement pstmt;

    public Connector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
    
    
    
    
}
