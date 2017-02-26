$(document).ready(function(){
	
	var id = localStorage.getItem("id");
	var name = localStorage.getItem("name");
	var type = localStorage.getItem("type");
	var family = localStorage.getItem("family");
	var life = localStorage.getItem("life");
	var number = localStorage.getItem("number");
	
	$("#Name").val(localStorage.getItem("name"));
	$("#Type").val(localStorage.getItem("type"));
	$("#Family").val(localStorage.getItem("family"));
	$("#Life").val(localStorage.getItem("life"));
	$("#Number").val(localStorage.getItem("number"));
	
	
	$("#save").bind('click', function(){
		
		var new_name = $("#Name").val();
		var new_type = $("#Type").val();
		var new_family = $("#Family").val();
		var new_life = $("#Life").val();
		var new_number = $("#Number").val();
		
		if(name!=new_name || type!=new_type || family!=new_family || life!=new_life || number!=new_number)
		$.ajax({
			type:'POST',
			url:"Action",
			data:"edit=true"
			+"&id="+id
			+"&name="+name
			+"&type="+type
			+"&family="+family
			+"&life="+life
			+"&number="+number
			+"&new_name="+new_name
			+"&new_type="+new_type
			+"&new_family="+new_family
			+"&new_life="+new_life
			+"&new_number="+new_number,
			cache:false,
		});
		
		window.location.href = "catalog";
		return false;
	});
});