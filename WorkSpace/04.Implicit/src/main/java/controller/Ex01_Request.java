package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex01_Request
 */
@WebServlet("/Ex01_Request")
public class Ex01_Request extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		
		if("admin".equals(id)&&"admin1234".equals(pw)&&!id.equals(null)&&!pw.equals(null)) {
			//id<=String변수가 null일 경우 equals를 사용하면 nullpointerException발생
			System.out.println("아이디/ 비밀번호 맞아서 로그인");
		}else {
			System.out.println("아이디 또는 비밀번호 틀림");
		}
		
		System.out.println("get이용");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post이용");
		doGet(request, response);
	}

}
