$(document).ready(function(){
	
	$("#login_change").val(localStorage.getItem("login"));
	$("#pass_change").val(localStorage.getItem("pass"));
	
	$("#change").bind('click', function(){
		$.ajax({
			type:'POST',
			url:"change",
			data:"login="+$("#login_change").val()+"&pass"+$("#pass_change").val(),
			cache:false,
			success: function(data) {
				localStorage.setItem("login",$("#login_change").val());
				localStorage.setItem("pass",$("#pass_change").val());
				location.reload();
			}
		});
		return false;
		});
});