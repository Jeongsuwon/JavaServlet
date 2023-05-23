package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Ex04Scope
 */
@WebServlet("/Ex04Scope")
public class Ex04Scope extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request에 있는 attribute" + request.getAttribute("req"));
		HttpSession session = request.getSession(); //세션의 초기화식(이미 WAS에서 제공해주는 것을 받아오는 형식, new x)
		System.out.println("session에 있는 attribute" + session.getAttribute("session"));
		System.out.println("Application Context Attribute " + getServletContext().getAttribute("app"));
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher rd = request.getRequestDispatcher("Ex01_Reqeust/Ex04_ScopeResult.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
