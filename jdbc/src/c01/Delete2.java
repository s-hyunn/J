package c01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("oracle.jdbc.OracleDriver");
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id ="green";  
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url,id,pw);
		
		Statement stmt = conn.createStatement();

		System.out.println("sdasd");

		String query = "DELETE FROM tbl_member WHERE id = 'bbb'";

		int result = stmt.executeUpdate(query);

		System.out.println("result: " + result);

	}
}
