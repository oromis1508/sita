<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/script.js" type="text/javascript"></script>
<title>Национальный ботанический сад Респубники Беларусь</title>
</head>
<body>
<div class="wrapper">
	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
		<div class="welcome">
			<h1>Добро пожаловать на сайт национального ботанического сада Респубники Беларусь!</h1>
		</div>
		
		<img class="main-img" alt="Национальный сад" src="images/main.jpg">
		<div class="main-content">
			<p>Ботанический сад был организован в 1932 по решению Совета Народных Комиссаров БССР. Это самый 
			крупный в стране центр по сохранению биологического разнообразия живых растений, ведущее научное 
			учреждение в области интродукции, акклиматизации, физиологии, биохимии и экологии растений, охраны 
			окружающей среды.</p>
			<p>Наш сад принадлежит к числу крупнейших ботанических садов Европы как по площади (153 га), так и по 
			составу коллекций (более 9 тысяч наименований, в том числе 2,3 тысячи закрытого грунта).</p>
		</div>
	</main>
	
	<%@ include file="footer.jsp" %>
</div>
</body>
</html>