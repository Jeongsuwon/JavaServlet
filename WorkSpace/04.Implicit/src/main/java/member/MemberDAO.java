package member;

public class MemberDAO {
	//현재는 코드가 (servlet, jsp) 생소하여 어려우니 JDBC를 연동x 나중에 연습해보기.
	
	//id와pw를 파라메터로 입력받아 id가 user pw => user1234인 경우 true
	
	public boolean isLogin(String id, String pw) {
		if(id.equals("user")&&pw.equals("user1234")) {
			return true;
		}
		return false;
		
	}
}
