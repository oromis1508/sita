<%@page import="model.Autentification"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="js/jqsetlogin.js" type="text/javascript"></script>
</head>
<body>
<header>

	<% new Autentification(getServletContext().getRealPath("header.jsp"), request.getSession()).logout();%>
	<form action="search" method="get" class="head_search">
	<label>Поиск по каталогу<BR>
	<input type="search" name="search" id="search"></label><BR>
	<a href="search.jsp">Расширенный поиск</a>
	</form>

	<a href="/bgarden.by/index.jsp">
	<img class="headimg" alt="Национальный ботанический сад Респубники Беларусь" src="images/logo.png">
	</a>
	
	<section class="auth" id="auth">	
	<form id="authForm">
		Вход для администрации<BR>
		<div class="field">
   			<label for="login">Логин</label>
   			<input type="text" id="login"/>
		</div>
		<div class="field">
   			<label for="pass">Пароль</label>
   			<input type="password" id="pass"/>
		</div>
		<div class="field">
			<input type="submit" value="Авторизация" id="submit"/>
		</div>
	</form>
	</section>
</header>	
</body>
</html>