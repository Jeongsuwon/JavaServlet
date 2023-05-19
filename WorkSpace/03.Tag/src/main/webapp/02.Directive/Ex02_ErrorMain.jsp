<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page errorPage="Ex02_Error.jsp" %>
		<% int nNum; %>
		<% nNum=2/0; %>
		<h1>오류 발생 페이지 메인</h1>
		
</body>
</html>