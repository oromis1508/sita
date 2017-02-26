<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/edit.css">
<script src="js/script.js" type="text/javascript"></script>
<title>Добавление новой записи</title>
</head>
<body>
<div class="wrapper">
	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
		<form action="add" method="post" class="addForm">
		<h1>Добавление новой записи</h1>
		<table>
		
		<tr>
		<td class="addField">
		<label>Название:<input type="text" name="Name"></label>
		</td>

		<td class="addField">
		<label>Семейство:<input type="text" name="Family"></label><br>
		</td>
		</tr>
		
		<tr>
		<td class="addField">
		<label>Тип:<br></label>
		<select name="Type" size="4">
			<option disabled>Выберите тип растения</option>
	  		<option value ="травянистое растение">Травянистое растение</option>
	  		<option value ="кустарник">Кустарник</option>
	  		<option value ="дерево">Дерево</option>
		</select>
		</td>

		<td class="addField">
		<label>Продолжительность жизни:<br></label>
		<select name="Life" size="4">
			<option disabled>Выберите тип растения</option>
	  		<option value ="однолетнее">Однолетнее растение</option>
	  		<option value ="двулетнее">Двулетнее растение</option>
	  		<option value ="многолетнее">Многолетнее растение</option>
		</select>
		</td>
		</tr>
		
		<tr>
		<td colspan="2" class="addField">
		<label>Количество растений:<input type="number" name="Number"></label><br>
		</td>
		</tr>
		
<!-- 		<tr> -->
<!-- 		<td class="addField"> -->
<!-- 		<label>Фото:<input name="data" type="file"></label><br> -->
<!-- 		</td> -->
<!-- 		</tr> -->
		
		<tr>
		<td colspan="2" class="addButton">
			<input type="submit" value="Добавить запись">
			<input type="button" onclick="history.back();" value="Назад">
		</td>
		</tr>
		
		</table>
		</form>
	</main>
	
	<%@ include file="footer.jsp" %>
</div>	
</body>
</html>