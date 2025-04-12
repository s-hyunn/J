package Login받은;

import java.util.HashMap;
import java.util.Map;

public class SessionStorage {
	
    // 로그인한 회원 정보 저장 (key: id, value: Member 객체)
	
    public static Map<String, Member> sessionMap = new HashMap<>();
}
