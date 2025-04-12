package Login받은;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberService {

    // 회원가입
    public void insertMember(Member mem) {
    	if (isIdExist(mem.getId())) {
            System.out.println("이미 존재하는 아이디입니다. 다른 아이디를 사용해주세요.");
            return;
        }
    	
        String sql = "INSERT INTO tbl_member VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, mem.getId());
            pstmt.setString(2, mem.getPw());
            pstmt.setString(3, mem.getName());
            pstmt.setString(4, mem.getPhone());
            pstmt.setString(5, mem.getGrade());

            int result = pstmt.executeUpdate();
            System.out.println("회원가입 성공! 등록된 회원 수: " + result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isIdExist(String id) {
        String sql = "SELECT COUNT(*) FROM tbl_member WHERE id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                return true; 
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    // 로그인
    public boolean login(String id, String pw) {
        String sql = "SELECT * FROM tbl_member WHERE id = ? AND pw = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            pstmt.setString(2, pw);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Member mem = new Member();
                mem.setId(rs.getString("id"));
                mem.setPw(rs.getString("pw"));
                mem.setName(rs.getString("name"));
                mem.setPhone(rs.getString("phone"));
                mem.setGrade(rs.getString("grade"));

                // 로그인 성공 → 세션 등록
                SessionStorage.sessionMap.put(id, mem);
                System.out.println(mem.getName() + "님 로그인 성공!");
                return true;
            } else {
                System.out.println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 로그아웃
    public void logout(String id) {
        if (SessionStorage.sessionMap.containsKey(id)) {
            SessionStorage.sessionMap.remove(id);
            System.out.println(id + "님 로그아웃 완료!");
        } else {
            System.out.println("로그인되어 있지 않은 사용자입니다.");
        }
    }
}
