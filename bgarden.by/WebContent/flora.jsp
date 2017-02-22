<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- <script src="js/script.js" type="text/javascript"></script> -->
<title>Флора ботанического сада</title>
</head>
<body>
</head>
<body>
<div class="wrapper">
	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
	
		<h1>Каталог флоры ботанического сада</h1>
		<h2>В данном разделе представлена разнообразная информация о растениях нашего сада.<BR>
		Вы можете воспользоваться различными функциями, представленными в нашем каталоге:</h2>
		<div class="funktions">
			<a href="catalog">
			<div class="funktion">
			Полный каталог растений<BR>
			<img src="images/catalog/Астранция большая.jpg">
			<img src="images/catalog/Береза карликовая.jpg">
			<img src="images/catalog/Бубенчик лилиелистный.jpg">
			<img src="images/catalog/Гвоздика пышная.jpg">
			<img src="images/catalog/Кизильник черноплодный.jpg">
			<img src="images/catalog/Колокольчик болонский.jpg">
			<img src="images/catalog/Колокольчик сибирский.jpg">
			<img src="images/catalog/Куколь посевной.jpg">
			<img src="images/catalog/Лук скорода.jpg">
			<img src="images/catalog/Медвежий лук.jpg">
			<img src="images/catalog/Осока Дэвелла.jpg">
			<img src="images/catalog/Осока повислая.jpg">
			<img src="images/catalog/Пихта белая.jpg">
			<img src="images/catalog/Пальчатокоренник мясо-красный.jpg">
			<img src="images/catalog/Тайник яйцевидный.jpg">
			<img src="images/catalog/Сеслерия голубая.jpg">
			</div></a>
			
			<div class="funktion">Поиск по каталогу
			<form action="search" method="get"><input type="search" name="search" id="search"></form>
			</div>
			
			<a href="search.jsp">
				<div class="funktion">
					Расширенный поиск
					<img id="searchimg" src="images/search.jpg">
				</div>
			</a>	
			
			<a href="graph.jsp"><div class="funktion">Просмотр графиков</div></a>	
		</div>
		
	</main>
	
	<%@ include file="footer.jsp" %>
</div>
</body>
</html>