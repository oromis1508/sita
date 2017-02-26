$(document).ready(function(){
	
	$(".editbtn, .deletebtn").bind('click', function(){
		
		var action = $(this).data('action');
		
		var id = $(this).data('id');
		var name = $(this).data('name');
		var type = $(this).data('type');
		var family = $(this).data('family');
		var life = $(this).data('life');
		var number = $(this).data('number');
		
		if(action=="edit")
			{
			localStorage.setItem("id",id);
			localStorage.setItem("name",name);
			localStorage.setItem("type",type);
			localStorage.setItem("family",family);
			localStorage.setItem("life",life);
			localStorage.setItem("number",number);
			location.href = "edit.jsp";
			}
		else
			if(action=="delete")
				{
				if(confirm("Вы уверены, что хотите удалить данные о " +name+ " ?"))
				$.ajax({
				type:'POST',
				url:"Action",
				data:"id="+id+"&name="+name,
				cache:false,
				success: function(data) {location.href=data;}
			});
				}
	});
});