$(document).ready(function(){
	
	$("#account").bind('click', function(){
	$.ajax({
		type:'GET',
		url:"change",
		cache:false,
		success: function(data) {
			alert("")
			var arr = data.split(',');
			localStorage.setItem("login",arr[0]);
			localStorage.setItem("pass",arr[1]);}
	
	});
	location.href = "account.jsp";
	return false;
	});
});