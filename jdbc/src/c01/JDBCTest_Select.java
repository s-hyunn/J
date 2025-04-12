package c01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest_Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Member> list = new ArrayList<>();

		Class.forName("oracle.jdbc.OracleDriver"); // 11버전 코드 ?

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "green";
		String password = "1234";
		// 접속담당 -connection
		Connection conn = DriverManager.getConnection(url, user, password);
		// 쿼리실행- Statement import sql 것 사용 중요!!!

		Statement stmt = conn.createStatement();

		String query = "SELECT * FROM tbl_member";
		ResultSet rs = stmt.executeQuery(query);
		   
	      
	      while(rs.next()) {
	         Member member = new Member(); // 얘가 반복문 밖으로 나가면 인스턴스 생성이 한번 뿐인데 그걸 계속 배열에 넣으니 같은 사람이 뜨는거임
	      
	         String id = rs.getString("id");
	         String pw = rs.getString("pw");
	         String name = rs.getString("name");
	         String phone = rs.getString("phone");
	         String grade = rs.getString("grade");
	         
	       
	         member.setId(id);
	         member.setPw(pw);
	         member.setName(name);
	         member.setPhone(phone);
	         member.setGrade(grade);
	         
	         list.add(member);
	      }
	      
	      for(Member m : list) {
	         System.out.println(m);
	      }

		
		
		
		
	}

}
