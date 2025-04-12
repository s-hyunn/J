package Login받은;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:testdb";
    private static final String USER = "green";
    private static final String PASSWORD = "1234";

    // static initializer
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
