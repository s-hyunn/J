package Login받은;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {

    // 게시글 등록 (로그인된 사용자만)
    public void writeBoard(Board board) {
        // 로그인 여부 확인
        if (!SessionStorage.sessionMap.containsKey(board.getWriter())) {
            System.out.println("로그인한 사용자만 게시글을 작성할 수 있습니다.");
            return;
        }

        String sql = "INSERT INTO tbl_board (bno, title, content, writer, regdate) VALUES (?, ?, ?, ?, SYSDATE)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, board.getBno());
            pstmt.setString(2, board.getTitle());
            pstmt.setString(3, board.getContent());
            pstmt.setString(4, board.getWriter());

            int result = pstmt.executeUpdate();
            System.out.println("게시글 등록 완료! " + result + "건 등록됨");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 게시글 전체 목록 출력
    public void listBoard() {
        String sql = "SELECT * FROM tbl_board ORDER BY bno";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Board b = new Board();
                b.setBno(rs.getString("bno"));
                b.setTitle(rs.getString("title"));
                b.setContent(rs.getString("content"));
                b.setWriter(rs.getString("writer"));
                b.setRegdate(rs.getString("regdate"));

                System.out.println(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
