package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 어떤글자.js <-로 끝나는 모든 것들을 요청받게 => *.js

@WebServlet("*.js")
public class JstController extends HttpServlet {
		// doGet, doPost <= Spring에서는 default로 두 가지가 합쳐진 버전의 메소드를 활용
		// service(get, post의 모든 요청을 받는 메소드)
		RequestDispatcher rd;
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println(req.getServletPath());
			//RequestDispatcher <= req객체가 요청을 받고나서 다시 새로운 페이지로 요청을 넘겨야 할 때 (Forward)사용
			//페이지를 보여줄지말지를 요청온 Mapping기준으로 분기 -> list.js
			if(req.getServletPath().equals("/list.js")) {
				req.setAttribute("key", "값"); //forward로 요청을 넘길 때는 setAttribute를 통해 데이터 전달.
				req.setAttribute("key1", "jsp");
				req.setAttribute("key2", "servlet");
				req.setAttribute("key3", "el");
				rd = req.getRequestDispatcher("jstl/list.jsp"); // 다시 전환되어야 할 jsp, html페이지 경로
				//Model(MVC M): DATO DTO를 다음 페이지로 넘겨주고 요청을 맡긴다.
			}else if(req.getServletPath().equals("/listdetail.js")) {
				//form태그와 url로 넘어온 파라미터 -> req.getParameter(set x)
				//controller에서 -> jsp페이지로 넘어갈 때 -> req.getAttribute
				//parameter로 q_bbsCode라는 이름으로 값 1013이 필요함.
				System.out.println("request로부터 요청받은 파라미터 1013" + req.getParameter("q_bbscode"));
				System.out.println("조회를 할 때, list.jsp->listdetail로 갈 때");
				System.out.println("게시글 번호 -> select를 하기위해서");
				req.setAttribute("selectOne", "글의 상세정보");
				
				//문자열을 저장할 수 있는 ArrayList를 만들고 데이터를 10건 넣어보기
				ArrayList<String> arr = new ArrayList<>();
				
				for(int i=0; i<10; i++) {
				arr.add("j"+i);
				}
				req.setAttribute("strList", arr);
				rd=req.getRequestDispatcher("jstl/listdetail.jsp");
			}	
			else {
				rd = req.getRequestDispatcher("error/list.jsp"); //나중에 추가예정 JSW(20230523)->20230526
			}
			
			rd.forward(req, resp); // jsp페이지로 모든 정보를 넘기고 처리를 떠맡긴다.
		}
		
		

}
