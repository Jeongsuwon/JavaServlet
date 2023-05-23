<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>pageContext : <%=pageContext.getAttribute("pageCtx") %></p>
	<!-- PageContext 페이지 내에서만 데이터가 유지됨(지역변수와 유사함 -->
	<p>request : <%=pageContext.getAttribute("req") %></p>
	<!-- Forward라는 페이지 요청이 있을 때만 다음 페이지로 전송, 넘어가는 처리가 됨(메소드 파라미터부와 유사) -->
	<p>session : <%=pageContext.getAttribute("session") %></p>
	<!-- 전역변수(필드) 유사함 크롬창을 새로 띄우거나(브라우저 다른 것) 또는 서버가(리스타트되면서 유지가 되고 안되고가 랜덤)-->
	<p>application : <%=pageContext.getAttribute("app") %></p>
</body>
</html>