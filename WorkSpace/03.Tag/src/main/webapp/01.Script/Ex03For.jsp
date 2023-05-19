<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>반복문</h3>
	<%
		for(int i=0; i<10; i++){ %>
			<%if(i%2==0){ %>
			<p><%=i + "짝수" %></p>
			<%}else{ %>
			<p><%=i + "홀수" %></p>				
			<%} %>
		<%}%>
</body>
</html>