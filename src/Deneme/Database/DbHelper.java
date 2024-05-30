package Deneme.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private static final String url = "jdbc:mysql://localhost/universty";
    private static final String user = "root";
    private static final String password = "root";
    public static Connection getConection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

}
