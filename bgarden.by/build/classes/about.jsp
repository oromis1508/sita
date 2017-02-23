<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/about.css">
<title>Контактная информация</title>
</head>
<body>
<div class="wrapper">
	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
	<h1>Контакты</h1>
	
	<table>
	<tr>
		<td class="leftbar">	
			<h2>Заказ экскурсий:</h2>
			<p>(017) 292 69 15
		
			<h2>Режим работы</h2>
			<p>вторник, среда, четверг, 
			<p>пятница: 10:00-18:00<br><br>
			<p>суббота, 
			<p>воскресенье:10:00-17:00<br><br>
			<p>ПОНЕДЕЛЬНИК-ВЫХОДНОЙ ДЕНЬ
			
			<h2>Телефоны для справки:</h2> 
			<p>+375 (17) 284-14-84
			<p>+375 (17) 284-24-66
		</td>
	
		<td class="rightbar">
			<h2>Стоимость посещения в Центрального ботанического сада</h2>
			
			<table>
			<tr>
				<td>Посещение ландшафтной зоны и экспозиционной оранжереи</td>	
			  	<td>6р.00к.</td>
			</tr>
			<tr>
				<td>Посещение ландшафтной зоны и экспозиционной оранжереи (льготное, при наличии 
				удостоверения)*</td>	
			 	<td>3р.00к.</td>
			</tr>
			<tr>
				<td>Абонемент на посещение ландшафтной зоны  (в течение месяца)	</td>
				<td>20р.00к.</td>
			</tr>	
			<tr>
				<td>Проведение фото- и видеосъемок торжественных мероприятий на территории 
					Центрального Ботанического сада</td>
				<td>20р.00к.</td>
			</tr>
			<tr>
				<td colspan="2">* к льготной категории относятся: школьники, пенсионеры по возрасту, 
				учащиеся и студенты учебных заведений дневной формы обучения</td>
			</tr>
			</table>
		</td>
	</tr>
	
	<tr>
		<td colspan="2" class="bottombar">
			<h2>Наш адрес:</h2>
			<p>ул. Сурганова, дом 2В, Минск.
			<h2>Как добраться</h2>
			<p>метро — станция «Парк Челюскинцев»; 
			<p>автобусы № 100, 25, 37, 91 до остановки «Площадь Калинина».
		</td>
	</tr>
	
	<tr class="bottombar">
		<td colspan="2">
			<h2>Схема ботанического сада</h2>
			<img src="images/scheme.jpg">
		</td>
	</tr>
	</table>
	</main>
	
	<%@ include file="footer.jsp" %>
</div>	
</body>
</html>