<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/edit.css">
<script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="js/script.js" type="text/javascript"></script>
<script src="js/jqedit.js" type="text/javascript"></script>
<title>Редактирование записи</title>
</head>
<body>
<div class="wrapper">

	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
		<form id="editForm">
		<h1>Редактирование записи</h1>
		<table>
		
		<tr>
		<td class="editField">
		<label>Название:<input type="text" id="Name"></label>
		</td>
		
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
		<td colspan="2" class="editField">
		<label>Количество растений:<input type="number" id="Number"></label><br>
		</td>
		</tr>
		
<!-- 		<tr> -->
<!-- 		<td class="editField"> -->
<!-- 		<label>Фото:<input name="data" type="file"></label><br> -->
<!-- 		</td> -->
<!-- 		</tr> -->
		
		<tr>
		<td colspan="2" class="editButton">
			<input type="submit" value="Сохранить изменения" id="save">
			<input type="button" onclick="history.back();" value="Назад">
		</td>
		</tr>
		
		</table>
		</form>
		<div class="results"></div>
	</main>
	
	<%@ include file="footer.jsp" %>
</div>	
</body>
</html>