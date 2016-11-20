<!DOCTYPE html>
<html>
<head>
	<title>Wiflix :: Sign On</title>
  <asset:stylesheet src="style2.css"/>
  <asset:stylesheet src="popup-box.css" media="all" />
	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>

		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Sign In And Sign Up Forms  Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

	</script>
  <asset:javascript   src="jquery.min.js" />
<asset:javascript src="jquery.magnific-popup.js" />
<asset:javascript src="modernizr.custom.53451.js" />
 <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});

						});
</script>

</head>
<body>
	<h1>SignIn OR SignUp</h1>
	<div class="w3layouts" >
		<div class="signin-agile">
			<h2>Sign In to Wiflix</h2>
			<form action='${postUrl}' method='POST' id='loginForm' autocomplete="off">
				<input type="text" name="j_username" class="name" placeholder="username" required="">
				<input type="password" name="j_password" class="password" placeholder="password" required="">
				<ul>
					<li>
						<input type="checkbox" name="${rememberMeParameter}" id="remember_me" checked="checked">
						<label for="${rememberMeParameter}"><span></span>Remember me</label>
					</li>
				</ul>
				<a href="#">Forgot Password?</a><br>
				<div class="clear"></div>
				<input type="submit" value="Login"></input>
			</form>
		</div>
		<div class="signup-agileinfo">
			<h3>Sign Up For Wiflix</h3>
			<p>Phasellus vel urna magna. Quisque molestie felis varius ex faucibus auctor. Aenean sit amet erat ullamcorper, condimentum odio in, commodo tellus.</p>
			<div class="more">
				<a class="book popup-with-zoom-anim button-isi zoomIn animated" data-wow-delay=".5s" href="#small-dialog">Sign Up</a>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<div class="footer-w3l">
		<p class="agileinfo">Copyright &copy; 2016 Wiflix . All Rights Reserved </p>
	</div>
	<div class="pop-up">
	<div id="small-dialog" class="mfp-hide book-form">
		<h3>Sign Up</h3>
			<form action="/user/signupUser" method="post">
				<input type="text" name="phoneNumber" placeholder="phone number" required=""/>
				<input type="text" name="username" class="email" placeholder="Email" required=""/>
				<input type="password" name="password" class="password" placeholder="Password" required=""/>
				<input type="password" name="repeatPassword" class="password" placeholder="Confirm Password" required=""/>
				<input type="submit" value="Sign Up">
			</form>
	</div>
</div>
<body>
</html>
