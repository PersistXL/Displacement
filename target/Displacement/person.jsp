<%@ page import="cn.persist.bean.UserInfo" %>
<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>个人信息页面</title>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="后台登录" />
<!--Google Fonts-->
<!--<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
--><!--Google Fonts-->
</head>
<body>
<!--header start here-->
<div class="login-form">
			<div class="top-login">
				<span><img src="images/group.png" alt=""/></span>
			</div>
			<h1>个人信息页面</h1>

			<div class="login-top">
				<%
					UserInfo userInfo= (UserInfo) request.getSession().getAttribute("userInfo");
				%>
			<form action="/UserServlet">
				<input type="hidden" name="method" value="add">
				<div class="login-ic">
					<input type="text"  id="username" name="username" value="<%=userInfo.getUsername()%>" />
					<div class="clear"> </div>

				</div>
				<div class="login-ic">
					<input type="password"  id="password" name="password" value="<%=userInfo.getPassword()%>" />
					<div class="clear"> </div>
				</div>
				<div class="login-ic">
					<input type="radio" value="男" placeholder="男" name="sex" checked /><span style="color: white">男</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="radio" value="女" placeholder="女" name="sex" /><span style="color: white">女</span>
					<div class="clear"> </div>
				</div>
				<div class="login-ic">
					<input type="text"  id="age" name="age" value="<%=userInfo.getAge()%>" />
					<div class="clear"> </div>
				</div>
				<div class="login-ic">
					<input type="text"  id="job" name="job" value="<%=userInfo.getJob()%>"/>
					<div class="clear"> </div>
				</div>
				<div class="login-ic">
					<input type="text"  id="id_card" name="id_card" value="<%=userInfo.getId_card()%>" />
					<div class="clear"> </div>
				</div>
				<div class="login-ic">
					<input type="text"  id="phone" name="phone" value="<%=userInfo.getPhone()%>" />
					<div class="clear"> </div>
				</div>
				<div class="log-bwn">
					<input type="submit" value="修改" onclick="alert('修改成功'),window.open('index.html')">
				</div>
				<br/>
				<%--<div class="log-bwn">--%>
					<%--<input type="reset" value="重置"/>--%>
				<%--</div>--%>
				</form>
			</div>
			<p class="copy">© 2017 换班系统网络公司</p>
</div>		
<!--header start here-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">

	$("#username").val();
	$("#age").val()
</script>
</body>
</html>