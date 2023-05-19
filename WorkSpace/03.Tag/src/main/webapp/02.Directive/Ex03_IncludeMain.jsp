<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- 반복되는 헤더나 푸터를 계속해서 복붙하고 작업하는 것은 매우 불합리(귀찮고 수정 시 매우 힘듦)
			파일에 포함시키는 방식(미리 만들어놓은 다른 파일을 이용)
			장점: 헤더와 푸터 파일 자체를 재사용했기때문에 (붙여서) 수정이 필요하다면 헤더파일 하나만 수정하면
				 해결가능 
			단점: 헤더와 푸터가 기능이 안되거나 오류가 발생하면 모든 화면에서 x	  -->
		<%@ include file="Ex03Header.jsp" %>
		
		<P>수원컴퍼니</P>
		<P>메인페이지입니다.</P>
		<P>컨텐츠가 여기 있음</P>
		
		<%@ include file="Ex03Footer.jsp" %>
		
</body>
</html>