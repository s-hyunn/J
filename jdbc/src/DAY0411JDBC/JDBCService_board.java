package DAY0411JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import c01.Board;

public class JDBCService_board implements IJDBCService<Board>{
	Scanner sc=new Scanner(System.in);
	// sql crud 기능
	
	// DB에 입력 insert
	@Override
	public void insert(Board b) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO tbl_board (bno, title, content, writer, regdate) VALUES (?, ?, ?, ?, SYSDATE)";
        Connection conn = DBManager.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(query);

        pstmt.setString(1, b.getBno());
        pstmt.setString(2, b.getTitle());
        pstmt.setString(3, b.getContent());
        pstmt.setString(4, b.getWriter());

        pstmt.executeUpdate();

        pstmt.close();
        conn.close();
    }

	// 데이터 수정 update
	@Override
	public void update(Board b) throws ClassNotFoundException, SQLException {
        String query = "UPDATE tbl_board SET title = ?, content = ? WHERE bno = ?";
        Connection conn = DBManager.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(query);

        pstmt.setString(1, b.getTitle());
        pstmt.setString(2, b.getContent());
        pstmt.setString(3, b.getBno());

        pstmt.executeUpdate();

        pstmt.close();
        conn.close();
    }

	// 데이터 삭제 delete
	@Override
	public void delete(Board b) throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM tbl_board WHERE bno = ?";
        Connection conn = DBManager.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(query);

        pstmt.setString(1, b.getBno());
        pstmt.executeUpdate();

        pstmt.close();
        conn.close();
    }

	// 데이터 조회 select
	@Override
	public ArrayList<Board> selectAll() throws ClassNotFoundException, SQLException {
		ArrayList<Board> list = new ArrayList<>();
		// db 접속(Connection)
		Connection conn = DBManager.getConnection();
        // 쿼리 실행(Statement)
		String query = "SELECT * FROM tbl_board";
		PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

		
		// db 로부터 받은 데이터 받기(ResultSet)
		while (rs.next()) {
            Board b = new Board();
            b.setBno(rs.getString("bno"));
            b.setTitle(rs.getString("title"));
            b.setContent(rs.getString("content"));
            b.setWriter(rs.getString("writer"));
            b.setRegdate(rs.getString("regdate"));
            list.add(b);
        }
		// 결과 반환해주기 return 필요 //배열길이가 정해져(array)있지않고 유동적으로 바뀔때는 list 활용
		return list; // 어레이리스트 타입반환
	}
}
