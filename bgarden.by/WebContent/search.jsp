<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/search.css">
<script src="js/script.js" type="text/javascript"></script>
<title>Поиск по каталогу</title>
</head>
<body>
<div class="wrapper">
	
	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
	
	<form action="search" method="post" class="searchForm">
	<h1>Расширенный поиск</h1>
	<table>
	<tr>
	<td class="searchField">
	<label for="valueRegNum">Регистрационный номер:</label><br>
	<select name="signRegNum">
  		<option value ="&lt;=">&lt;=</option>
  		<option selected value ="=">=</option>
  		<option value ="&gt;=">&gt;=</option>
	</select>
	<input type="number" name="valueRegNum" id="valueRegNum">
	</td>
	
	<td class="searchField">
	<label for="valueNumber">Количество растений:</label><br>
	<select name="signNumber">
  		<option value ="&lt;=">&lt;=</option>
  		<option selected value ="=">=</option>
  		<option value ="&gt;=">&gt;=</option>
	</select>
	<input type="number" name="valueNumber" id="valueNumber">
	</td>
	</tr>
	
	<tr>
	<td class="searchField">
	<label for="valueName">Название:</label><br>
	<label><input type="radio" name="signName" value="contain" class="radio">Содержит</label>
	<label><input type="radio" name="signName" value="match" class="radio">Полностью совпадает</label>	
	<input type="text" name="valueName" id="valueName">
	</td>
	
	<td class="searchField">
	<label for="valueFamily">Семейство:</label><br>
	<label><input type="radio" name="signFamily" value="contain" class="radio">Содержит</label>
	<label><input type="radio" name="signFamily" value="match" class="radio">Полностью совпадает</label>
	<input type="text" name="valueFamily" id="valueFamily">
	</td>
	</tr>
	
	<tr>
	<td class="searchField">
	<label>Тип:<br></label>
	<select name="plantType[]" multiple="multiple" size="4">
		<option disabled>Выберите тип растения</option>
  		<option value ="травянистое растение">Травянистое растение</option>
  		<option value ="кустарник">Кустарник</option>
  		<option value ="дерево">Дерево</option>
	</select>
	</td>
	
	<td class="searchField">
	<label>Продолжительность жизни:<br></label>
	<select name="plantLife[]" multiple="multiple" size="4">
		<option disabled>Выберите тип растения</option>
  		<option value ="однолетнее">Однолетнее растение</option>
  		<option value ="двулетнее">Двулетнее растение</option>
  		<option value ="многолетнее">Многолетнее растение</option>
	</select>
	</td>
	</tr>
	
	<tr>
	<td class="searchButton" colspan="2">
		<input type="submit" value="Поиск в каталоге">
		<input type="reset" value="Сбросить всё">
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