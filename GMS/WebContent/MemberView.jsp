<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-color: #d0e4fe;
}
</style>
<style type="text/css">
  ul {list-style: none;padding: 0px;margin: 5px; background-color: #333; overflow: hidden;  }
  ul li {display: block;position: relative;float: left;border:1px solid #000;}
  li ul {display: none;}
  ul li a {display: block;background: #000;padding: 5px 10px 5px 10px;text-decoration: none;
           white-space: nowrap;color: #fff;}
  ul li a:hover {background: #f00;}
  li:hover ul {display: block; position: relative;}
  li:hover li {float: none;}
  li:hover a {background: #f00;}
  li:hover li a:hover {background: #000;}
  #drop-nav li ul li {border-top: 0px;}
  
.active {
background-color: #4CAF50;
}
</style>
<style >
div.relative
{
position: relative;
width: 600px;
height: 200px;
border: 3px solid #73AD21 ;

}
</style>

</head>
<body>
<form action="">
<div class="relative">
<ul id="drop-nav">
  <li><a href="#" class="active">MemberView</a></li>
  <li><a href="#">ViewProfile</a>
    <ul>
      <li><a href="#">NumberProfile</a></li>
      <li><a href="AddMember.jsp" id="addmember">AddMember</a></li>
    
    </ul>
  </li>
   <li><a href="#">ViewAttendence</a>
    <ul>
      <li><a href="#">SerchStaff</a></li>
      <li><a href="AddMember.jsp" id="addmember">AddStaff</a></li>
    
    </ul>
  </li>
  <li><a href="#">ViewDues and Payment history </a>
    <ul>
      <li><a href="#">PayFees</a></li>
      <li><a href="#">Payment Dues</a></li>
     
    </ul>
  </li>
  
</ul>
</div>
</form>
</body>
</html>