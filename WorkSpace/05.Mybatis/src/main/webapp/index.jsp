<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=CHROME">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>실습용 테마</title>
<link rel="icon" href="favicon.ico" type="image/x-icon">
<script src="https://kit.fontawesome.com/c47106c6a7.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css">
<script src="js/ie.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
	<header>
		<div class="inner">
			<h1>
				<a href="#">HANUL202</a>
			</h1>
			<ul id="gnb">
				<li><a href="list.js">JSTL(TEST_DB)</a></li>
				<li><a href="list.cu">사원목록</a></li>
				<li><a href="#">고객관리</a></li>
				<li><a href="list.jsw">내이니셜</a></li>
				<!-- list.jsw를 요청하면 요청을 받을 수 있는 Controller를 추가한다.
					 list.jsw가 아닌 ab등의.jsw를 요청하면 콘솔창에 잘못된요청
					 list.jsw가 요청되면 field를 두개 가진 dto를 ArrayList로 만들고 -> list.jsw에서는
					 el과 jstl을 사용해서 보여준다. -->
				<li><a href="rrr.bat">mybatis</a></li>
			</ul>



			<ul class="util">
				<li><a href="#">로그인</a></li>
				<li><a href="#">회원가입</a></li>
			</ul>

		</div>

	</header>
<body>
	

	<figure>
		<video src="img/visual.mp4" autoplay muted loop></video>
		<div class="inner">
			<h1>INNOVATION</h1>
			<p>
				Lorem ipsum dolor, sit amet consectetur adipisicing elit. <br>

				Id praesentium molestias similique quaerat magni facere in a?
				Adipisci, possimus reprehenderit!
			</p>

			<a href="#">view detail</a>

		</div>

	</figure>

	<section>

		<div class="inner">

			<h1>소개 영상</h1>
			<h6 style="text-align: center;">유튜브 사용해보기</h6>
			<div class="wrap">
				<article>
					<div class="youtube">
					
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>
				<article>
					<div class="youtube">
					
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>
				<article>
					<div class="youtube">
						
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>
			</div>
		</div>
	</section>
	<footer>
		<div class="inner">
			<div class="upper">
				<h1>한울직업전문학교</h1>
				<ul>
					<li><a href="#">Policy</a></li>
					<li><a href="#">Terms</a></li>
					<li><a href="#">Family Site</a></li>
					<li><a href="#">Sitemap</a></li>
				</ul>
			</div>
			<div class="lower">
				<address>
					Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas,
					facere.<br> TEL : 062-111-1234 C.P : 010-1234-5678
				</address>
				<p>2022 Hanul &copy; copyright all right reserved.</p>
			</div>
		</div>
	</footer>





</body>



</html>