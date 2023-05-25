package customer;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CustomerDAO {
	//싱글톤 (static{} 블럭킹을 만들어서 CustomerDAO가 사용될 때 무조건 먼저 실행될 코드를 넣어둠)
	//Connection <- conn 열고 닫고를 수동으로 함
	//외부에서 사용할 수 있는 (인스턴스 멤버에서 sqlsession <-만 사용함. 따라서 인스턴스멤버나 스태틱멤버로
	//↑만들어줌
	private static SqlSession sql;
	static {		
		String resource = "mybatis/conn.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory =
				new SqlSessionFactoryBuilder().build(inputStream);
		sql = sqlSessionFactory.openSession(); // Connection 객체 이용하는 것이랑 같음.
		
	
	}	
	public void test() {
		int test = sql.selectOne("jsw.dual");	
		System.out.println(test);
		
	}
	
	public List<CustomerVO> listSelect() {
		List<CustomerVO> list = sql.selectList("cu.list");
		System.out.println(list.size());
		return list;
	}
	
	public CustomerVO selectDetail(int id){
		CustomerVO vo = sql.selectOne("cu.detail", id);
		System.out.println(vo.getName());
		return vo;
	}
	
	public void update(String id, String email, String phone) {
		CustomerVO vo = new CustomerVO();
		vo.setId(Integer.parseInt(id));
		vo.setEmail(email);
		vo.setPhone(phone);
		int result = sql.update("cu.update", vo );
		sql.commit();
		System.out.println(result);
	}
	
	public void insert(CustomerVO vo) {
		int result = sql.insert("cu.insert", vo);
		sql.commit();
		System.out.println(result);
	}
	
}

	
	