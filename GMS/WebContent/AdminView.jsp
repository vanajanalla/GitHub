<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminView</title>
<!-- css -->
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/fancybox/jquery.fancybox.css" rel="stylesheet">
<link href="css/jcarousel.css" rel="stylesheet" />
<link href="css/flexslider.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" />

</head>
<body>
	<div id="wrapper" style="background-color: #68A4C4;">
		<!-- start header -->
		<div class="container" style="background-color: #68A4C4;">
			<a href="#" target="blank"><button type="button"
					class="btn btn-primary"
					style="margin-top: 5px; margin-bottom: 5px; float: right;">Welcome
					User</button></a>
		</div>
		<header>
			<div class="navbar navbar-default navbar-static-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="Home.jsp"><img
							class="img-responsive" src="img/logo.jpg" alt="" /></a>
					</div>
					<div class="navbar-collapse collapse ">
						<ul class="nav navbar-nav">
							<li><a href="AdminHome.html" target="iframe_a">HOME</a></li>
							<li><a href="AddMember.html" target="iframe_a">ADD MEMBER</a></li>
							<li><a href="UpdateMember.html" target="iframe_a">Update MEMBER</a></li>
							<li><a href="PayFee.jsp" target="iframe_a">PAYMENT DUES</a></li>
							<li><a href="PayFee.jsp" target="iframe_a">PAY FEES</a></li>
							<li><a href="ViewAttendence.jsp" target="iframe_a">VIEW ATTENDENCE</a></li>
							<li><a href="crt.html" target="iframe_a">ACCOUNTS</a></li>
						</ul>
					</div>
				</div>
			</div>
		</header>
		
		<iframe width="100%" height="600px" src="AdminHome.html"
			name="iframe_a"></iframe>
		<footer>

			<div id="sub-footer">
				<div class="container">
					<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
						<div class="col-lg-6">
							<div class="copyright">
								<p>
									<span>&copy; SoftSolutions 2016 All right reserved. 
								</p>
							</div>
						</div>
						<div class="col-lg-6">
							<ul class="social-network">
								<li><a href="#" data-placement="top" title="Facebook"><i
										class="fa fa-facebook"></i></a></li>
								<li><a href="#" data-placement="top" title="Google plus"><i
										class="fa fa-google-plus"></i></a></li>
								<!--<li><a href="#" data-placement="top" title="Twitter"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#" data-placement="top" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
						<li><a href="#" data-placement="top" title="Pinterest"><i class="fa fa-pinterest"></i></a></li>-->

							</ul>
						</div>
					</div>
				</div>
			</div>
		</footer>
	</div>
</body>
</html>