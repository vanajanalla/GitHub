<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

 ul {list-style: none;padding: 0px;margin: 5px;  overflow: hidden;  }
  ul li {display: block;position: relative;float: left;border:1px solid #000;}
   li ul {display: none;}
    ul li a {display: block;background: #000;padding: 5px 10px 5px 10px;text-decoration: none;
           white-space: nowrap;color: #fff; }
                    white-space: nowrap;color: #fff;}
  ul li a:hover {background: #f00;}
  li:hover ul {display: block; position: relative;}
  li:hover li {float: none;}
  li:hover a {background: #f00;}
  li:hover li a:hover {background: #000;}
  #drop-nav li ul li {border-top: 0px;}
  
</style>
<style >
div.ex{border: 2px solid #73AD21;}
</style>
</head>
<body>
<form action="">
<div class="ex">

<div class="relative"  >
<ul id="drop-nav">
  <li><a href="#">MemberProfile</a></li>
  <li><a href="#">Accounts</a>
    <ul>
      <li><a href="#">payfee</a></li>
      <li><a href="" id="histroy">due histroy</a></li>
    
    </ul>
  </li>
  
  
  
  <li><a href="#">Attendence</a>
    <ul>
      <li><a href="#">General Inquiries</a></li>
      <li><a href="#">Ask me a Question</a></li>
    </ul>
  </li>
</ul>
</div>
</div>
</form>
</body>
</html>