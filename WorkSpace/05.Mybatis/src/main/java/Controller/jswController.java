package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsw.JswVO;

@WebServlet("*.jsw")
public class jswController extends HttpServlet {
	RequestDispatcher rd;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getServletPath().equals("/list.jsw")) {
			rd = req.getRequestDispatcher("jsw/list.jsp");
		}else {
			System.out.println("잘못된 요청");
			rd = req.getRequestDispatcher("error/list.jsp");
		}
		
		ArrayList<JswVO> dto = new ArrayList<>();
		//<><- Object를 상속받은 Class타입만 넣을 수 있음.
		JswVO vo = new JswVO();
	
		for(int i=0; i<10; i++) {
			vo.setiNum(i);
			vo.setStr("A"+i);
			dto.add(vo);
		}
		
		
		req.setAttribute("arr", dto);
		
		rd.forward(req, resp);
	}
}
