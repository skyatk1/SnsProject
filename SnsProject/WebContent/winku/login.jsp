<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
	<title>Winku Social Network Toolkit</title>
    <link rel="icon" href="images/fav.png" type="image/png" sizes="16x16"> 
    
    <link rel="stylesheet" href="css/main.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/color.css">
    <link rel="stylesheet" href="css/responsive.css">

</head>
<body>
<!--<div class="se-pre-con"></div>-->
<div class="theme-layout">
	<div class="container-fluid pdng0">
		<div class="row merged">
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="land-featurearea">
					<div class="land-meta">
						<h1>Winku</h1>
						<p>
							Winku is free to use for as long as you want with two active projects.
						</p>
						<div class="friend-logo">
							<span><img src="images/wink.png" alt=""></span>
						</div>
						<a href="#" title="" class="folow-me">Follow Us on</a>
					</div>	
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="login-reg-bg">
					<div class="log-reg-area sign">
						<h2 class="log-title">Login</h2>
							<p>
								회원이 아니신가요? <br>
								<a href="#" title=""> 사이트 먼저 살펴보기</a>
							</p>
						<form action="Main.me" method="post">
							<div class="form-group">	
							  <input type="text" id="input" required="required"/>
							  <label class="control-label" for="input" id="email" name="email">이메일</label><i class="mtrl-select"></i>
							</div>
							<div class="form-group">	
							  <input type="password" required="required"/>
							  <label class="control-label" for="input" name="pass">비밀번호</label><i class="mtrl-select"></i>
							</div>
							<div class="checkbox">
							  <label>
								<input type="checkbox" checked="checked"/><i class="check-box"></i>로그인 상태 유지
							  </label>
							</div>
							<a href="#" title="" class="forgot-pwd">비밀번호를 잊으셨나요?</a>
							<div class="submit-btns">
								<button class="mtr-btn signin" type="button"><span>로그인</span></button>
								<button class="mtr-btn signup" type="button"><span>회원가입</span></button>
							</div>
						</form>
					</div>

					<!--Register 폼-->
					<div class="log-reg-area reg">
						<h2 class="log-title">회원가입</h2>
							<p>
								회원이 아니신가요? <br>
								<a href="#" title=""> 사이트 먼저 살펴보기</a>
							</p>
						<form action="./EmailAuth.me" method="post">
							<div class="form-group">	
							  <input type="text" required="required"/>
							  <label class="control-label" for="input" name="f_name">성(First Name)</label><i class="mtrl-select"></i>
							</div>
							<div class="form-group">	
							  <input type="text" required="required"/>
							  <label class="control-label" for="input" name="l_name">이름(Last Name)</label><i class="mtrl-select"></i>
							</div>
							<div class="form-group">	
							  <input type="password" required="required"/>
							  <label class="control-label" for="input" name="pass">비밀번호</label><i class="mtrl-select"></i>
							</div>
							<div class="form-radio">
							  <div class="radio">
								<label>
								  <input type="radio" name="gender" checked="checked"/><i class="check-box"></i>남자
								</label>
							  </div>
							  <div class="radio">
								<label>
								  <input type="radio" name="gender"/><i class="check-box"></i>여자
								</label>
							  </div>
							</div>
							<div class="form-group">	
							  <input type="text" required="required"/>
							  <label class="control-label" for="input" name="email">이메일</label><i class="mtrl-select"></i>
							</div>
							<div class="checkbox">
							  <label>
								<input type="checkbox" checked="checked"/><i class="check-box"></i>약관에 동의하십니까?
							  </label>
							</div>
							<a href="#" title="" class="already-have">로그인 화면으로</a>
							<div class="submit-btns">
								<button class="mtr-btn signup" type="button"><span>가입하기</span></button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
	
	<script src="js/main.min.js"></script>
	<script src="js/script.js"></script>

</body>	
</html>