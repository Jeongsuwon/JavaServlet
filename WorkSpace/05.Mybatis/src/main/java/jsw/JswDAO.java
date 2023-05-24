package jsw;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import customer.CustomerVO;

public class JswDAO {
	public void test() {
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
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
//			  int dualInt = session.selectOne("jsw.dual");
			  //session.method(->, insert, update, delete, selectOne, selectList)
			  //selectOne, selectList
			  //데이터 한건, 데이터 여러건
			  //selectOne("")-> parameter(statement)
			  //mapper namespace.id
//			    System.out.println("mybatis를 통해 select : " + dualInt);
			//vo : getter & setter를 만들면 자동으로 되는 것은 bean(Spring 객체 만들 때만 사용됨)
//			JswVO vo = session.selectOne("jsw.voselect");
//			System.out.println("==");
//			List<JswVO> voList = session.selectList("jsw.listselect");
//			System.out.println("리스트 사이즈 : " + voList.size());
			
			//파라미터의 전송은 단 하나의 객체만 가능하다 -> String, int, ArrayList, HashMap....
			
			//메소드가 같은이름으로 여러 개 정의된 것 : 오버로딩
			// $, #
			// $ 표시는 ex) vo를 파라미터로 넘기면 vo에 값을 그대로 출력(조건으로 사용)
			//					where id = field1(x) field1이라는 컬럼이 없기때문에 오류
			// # 표시는 데이터 타입에 맞춰서 처리가 된다.
			//		where id = 'field1' (o) 값 비교이기때문에 오류 x
			
			// 파라미터는 어떤 타입이든 상관없지만 하나만 전송할 수 있음.(Parameter Object)
			// 변수를 여러 개 가지고있는 클래스를 만든다(구조가 db와 같은 것 --> vo, dto 활용)
			
//			String data = session.selectOne("jsw.selectwhere1",1);
//			System.out.println(data);
//			CustomerVO vo = new CustomerVO();
//			vo.setId(2);
			
//			List<CustomerVO> list = session.selectList("jsw.selectwhere3");
//			System.out.println(list);
//			for(CustomerVO vo : list) {
//				System.out.println(vo.getId() + vo.getName() + vo.getGender());
//			}
			
			//내가 VO를 가지고 있지 않음.
//			CHARACTER_ID, CHARACTER_NAME, MASTER_ID
			//HashMap<K,V> <- Key, Value 둘다 클래스타입 가능
			//ArrayList<E> 
			HashMap<String, Object> params = new HashMap<>();
			params.put("id", 1);
			params.put("name", "루크 스카이워커");
			
			
			String characterName = session.selectOne("jsw.mapselect", params); 
			System.out.println(characterName);
			
			}
	}
}
