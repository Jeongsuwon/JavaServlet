<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<!-- url mapping / jdbclogin을 만들고 (servlet) -->
	<form action="../jdbclogin" method="post">
		<input type="text" name="id">
		<input type="text" name="pw">
		<input type="submit">
	</form>
	
</body>
</html>