<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px solid black">
	<%for(int i=2; i<10; i++){%>
	<tr>  <!-- 행 추가 -->
	<%for(int j=1; j<10; j++){%>
	<td><p><%=i%><%="*"%><%=j%><%="="%><%=i*j%></p></td>
	<%}%>
	</tr>	
<%}%>
	</table>
	

</body>
</html>