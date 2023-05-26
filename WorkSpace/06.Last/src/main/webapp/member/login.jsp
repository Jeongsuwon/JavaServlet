<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="/include/head.jsp"%>
<body id="page-top">
	<%@ include file="/include/header.jsp"%>
	<section class="page-section" id="contact">
		<div class="container">
			<!-- Contact Section Heading-->
			<h2
				class="page-section-heading text-center text-uppercase text-secondary mb-0">로그인</h2>
			<!-- Icon Divider-->
			<div class="divider-custom">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Contact Section Form-->
			<div class="row justify-content-center">
				<div class="col-lg-8 col-xl-7">
					<!-- * * * * * * * * * * * * * * *-->
					<!-- * * SB Forms Contact Form * *-->
					<!-- * * * * * * * * * * * * * * *-->
					<!-- This form is pre-integrated with SB Forms.-->
					<!-- To make this form functional, sign up at-->
					<!-- https://startbootstrap.com/solution/contact-forms-->
					<!-- to get an API token!-->
					<form id="contactForm" data-sb-form-api-token="API_TOKEN">
						<!-- id input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="id" name="id" type="text"
								placeholder="id를 입력하세요" data-sb-validations="required" /> <label
								for="name">아이디</label>
							<div class="invalid-feedback" data-sb-feedback="name:required">아이디
								필수입력</div>
						</div>
						<!-- pw address input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="pw" name="pw" type="email"
								placeholder="패스워드 입력" data-sb-validations="required" /> <label
								for="email">비밀번호</label>
							<div class="invalid-feedback" data-sb-feedback="email:required">비밀번호
								필수입력</div>
						</div>
						<a class="btn btn-primary btn-xl" onclick="login();">로그인</a>
					</form>
				</div>
			</div>
		</div>
	</section>
	<%@ include file="/include/footer.jsp"%>

	<script type="text/javascript">
        function login() {
			//jquery로 input type id에 입력된 값을 alert이나 console로 찍어보기
			//alert('눌림');
			//alert($('#id')).val());
			console.log($('#id').val());
			console.log($('#pw').val());
			if($('#id').val()==''){
				alert('아이디를 입력해주세요!');
				$('#id').focus();
				return;
			}else if($('#pw').val()==''){
				alert('비밀번호를 입력해주세요!');
				$('#pw').focus();
				return;
		}
			
			/* 여기까지 도착함 코드 스택이 -> 아이디 비밀번호가 입력이 된 상태 */
			//get방식으로 ajax비동기 통신을 통해서 servlet으로 데이터 전송.(url): 페이지 새로고침 
			$.ajax({
				type: 'post', //요청 방식
				url: 'login.mem', //요청 URL
				data: {	id: $('#id').val(), pw:$('#pw').val()			} , //요청시 보낼 파라미터 설정			
				success: function( response) { //성공시 실행할 함수
					if(response == ""){
						alert('아이디 또는 비밀번호 입력');
					}else{
						alert('aaa';)
					}
				}, error: function (req, text) { //실패시 실행할 함수
					alert(text + ': ' +req.status);
				}
			})
			
        }
        </script>
</body>

</html>