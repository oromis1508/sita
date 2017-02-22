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
	
	<%
	Cookie []cookies = request.getCookies();
	String Name = null;
	String Family = null;
	String Type = null;
	String Life = null;
	String Number = null;
	for(Cookie cookie : cookies)
		switch(cookie.getName())
		{
		case "Name":Name=cookie.getValue(); break;
		case "Family":Family=cookie.getValue(); break;
		case "Type":Type=cookie.getValue(); break;
		case "Life":Life=cookie.getValue(); break;
		case "Number":Number=cookie.getValue(); break;
		}
	%>

	<%@ include file="header.jsp" %>
	
	<%@ include file="navigation.jsp" %>
	
	<main>
		<form action="edit" method="post" class="editForm">
		<h1>Редактирование записи</h1>
		<table>
		
		<tr>
		<td class="editField">
		<label>Название:<input type="text" name="Name" value="<%=Name%>"></label>
		</td>
		</tr>
		
		<tr>
		<td class="editField">
		<label>Семейство:<input type="text" name="Family" value="<%=Family%>"></label><br>
		</td>
		</tr>
		
		<tr>
		<td class="addField">
		<label>Тип:<br></label>
		<select name="Type" size="4" >
			<option disabled>Выберите тип растения</option>
	  		<option value ="травянистое растение">Травянистое растение</option>
	  		<option value ="кустарник">Кустарник</option>
	  		<option value ="дерево">Дерево</option>
		</select>
		</td>
		</tr>
		
		<tr>
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
		<td class="addField">
		<label>Количество растений:<input type="number" name="Number" value="<%=Number%>"></label><br>
		</td>
		</tr>
		
<!-- 		<tr> -->
<!-- 		<td class="addField"> -->
<!-- 		<label>Фото:<input name="data" type="file"></label><br> -->
<!-- 		</td> -->
<!-- 		</tr> -->
		
		<tr>
		<td class="addButton">
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