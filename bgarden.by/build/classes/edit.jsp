<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/about.css">
<title>Добавление новой записи</title>
</head>
<body>
<div class="wrapper">

	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
		<form action="edit" method="post" id="editForm">
		<h1>Редактирование записи</h1>
		<table>
		
		<tr>
		<td class="editField">
		<label>Название:<input type="text" id="Name"></label>
		</td>
		</tr>
		
		<tr>
		<td class="editField">
		<label>Семейство:<input type="text" id="Family"></label><br>
		</td>
		</tr>
		
		<tr>
		<td class="editField">
		<label>Тип:<br></label>
		<select id="Type" size="4" >
			<option disabled>Выберите тип растения</option>
	  		<option value ="травянистое растение">Травянистое растение</option>
	  		<option value ="кустарник">Кустарник</option>
	  		<option value ="дерево">Дерево</option>
		</select>
		</td>
		</tr>
		
		<tr>
		<td class="editField">
		<label>Продолжительность жизни:<br></label>
		<select id="Life" size="4">
			<option disabled>Выберите тип растения</option>
	  		<option value ="однолетнее">Однолетнее растение</option>
	  		<option value ="двулетнее">Двулетнее растение</option>
	  		<option value ="многолетнее">Многолетнее растение</option>
		</select>
		</td>
		</tr>
		
		<tr>
		<td class="editField">
		<label>Количество растений:<input type="number" name="id"></label><br>
		</td>
		</tr>
		
<!-- 		<tr> -->
<!-- 		<td class="editField"> -->
<!-- 		<label>Фото:<input name="data" type="file"></label><br> -->
<!-- 		</td> -->
<!-- 		</tr> -->
		
		<tr>
		<td class="editButton">
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