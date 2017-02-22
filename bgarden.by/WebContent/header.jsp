<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<header>

	<form action="search" method="get" class="head_search">
	<label>Поиск по каталогу<BR>
	<input type="search" name="search" id="search"></label>
	</form>

	<a href="/bgarden.by/index.jsp">
	<img class="headimg" alt="Национальный ботанический сад Респубники Беларусь" src="images/logo.png">
	</a>
	
	<section class="auth" id="auth">	
	<form action="Auth" method="post">
		Вход для администрации<BR>
		<div class="field">
   			<label for="login">Логин</label>
   			<input type="text" name="login"/>
		</div>
		<div class="field">
   			<label for="pass">Пароль</label>
   			<input type="password" name="pass" />
		</div>
		<div class="field">
			<input type="submit" name="submit" value="Авторизация">
		</div>
	</form>
	</section>
</header>	
</body>
</html>