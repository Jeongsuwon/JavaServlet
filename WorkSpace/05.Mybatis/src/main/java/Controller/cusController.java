package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.CustomerDAO;
import customer.CustomerVO;


@WebServlet("*.cu")
public class cusController extends HttpServlet {
	RequestDispatcher rd;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDAO dao = new CustomerDAO();
		System.out.println("일단 여기까지 옴");
		if(request.getServletPath().equals("/list.cu")){
			System.out.println("list.jsp");
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			rd = request.getRequestDispatcher("customer/list.jsp");
			List<CustomerVO> list = new CustomerDAO().listSelect();
			request.setAttribute("list", list);
		}else if(request.getServletPath().equals("/detail.cu")) {
			//url 또는 get post방식으로 servlet으로 오는 모든 데이터는 parameter(String)
			//req(요청), response(응답)
			//req객체의 set&getAttribute, getParameter
			//getParameter: jsp 또는 html페이지에서 servlet(back)요청 (a 태그 form url)
			//setAttribute,get: servlet 동작을 하고 데이터를 전송 ->
			int id = Integer.parseInt(request.getParameter("id"));
			dao.selectDetail(id);
			CustomerVO vo = dao.selectDetail(id);
			request.setAttribute("vo", vo);
			rd=request.getRequestDispatcher("customer/detail.jsp");
		}else if(request.getServletPath().equals("/update.cu")) {
			String id =request.getParameter("id");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			dao.update(id,email, phone);
			
		}else if(request.getServletPath().equals("/insert.cu")) {
			rd=request.getRequestDispatcher("customer/insert.jsp");
		}
		else if(request.getServletPath().equals("/new.cu")) {
			System.out.println(request.getParameter("id")); // <- 테스트 진행 시 key값이 중복안되게 입력하고 테스트
			CustomerVO vo = new CustomerVO();
			vo.setId(Integer.parseInt(request.getParameter("id")));
			vo.setName(request.getParameter("name"));
			vo.setEmail(request.getParameter("email"));
			vo.setPhone(request.getParameter("phone"));
			dao.insert(vo);
		}
		else {
			request.getAttribute("error/list.jsp");
			System.out.println("잘못된 요청");
		}
		rd.forward(request, response);
	}
	

}
