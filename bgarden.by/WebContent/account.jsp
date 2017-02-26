<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/script.js" type="text/javascript"></script>
<script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="js/jqchange.js" type="text/javascript"></script>
<title>Личный кабинет</title>
</head>
<body>
<div class="wrapper">
	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
	<section>	
	<form id="formChange">
		Вход для администрации<BR>
		<div class="change_field">
   			<label for="login">Логин</label>
   			<input type="text" id="login_change"/>
		</div>
		<div class="change_field">
   			<label for="pass">Пароль</label>
   			<input type="text" id="pass_change"/>
		</div>
		
		<div class="change_field">
			<input type="submit" value="Изменить" id="change"/>
		</div>
	</form>
	</section>
	</main>
	
	<%@ include file="footer.jsp" %>
</div>
</body>
</html>