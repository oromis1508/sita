function newXMLHttpRequest() {
			 
			  var xmlreq = false;
			 
			  if (window.XMLHttpRequest) {
			 
			    // Create XMLHttpRequest object in non-Microsoft browsers
			    xmlreq = new XMLHttpRequest();
			 
			  } else if (window.ActiveXObject) {
			 
			    // Create XMLHttpRequest via MS ActiveX
			    try {
			      // Try to create XMLHttpRequest in later versions
			      // of Internet Explorer
			 
			      xmlreq = new ActiveXObject("Msxml2.XMLHTTP");
			 
			    } catch (e1) {
			 
			      // Failed to create required ActiveXObject
			 
			      try {
			        // Try version supported by older versions
			        // of Internet Explorer
			 
			        xmlreq = new ActiveXObject("Microsoft.XMLHTTP");
			 
			      } catch (e2) {
			 
			        // Unable to create an XMLHttpRequest with ActiveX
			      }
			    }
			  }
			 
			  return xmlreq;
			}


window.onload = function () {
	

//	}
	
	var submit = document.getElementById("submit");
	submit.onclick = function () {
		
		var xmlHttp = newXMLHttpRequest();
		
		var login = document.getElementById("login").value;
		var pass = document.getElementById("pass").value;
		
		// Открыть соединение с сервером
		xmlHttp.open("POST", "Auth", true);
		
		
		xmlHttp.setRequestHeader("Content-Type", 
          "application/x-www-form-urlencoded");
		
		// Передать запрос
		xmlHttp.send("login=" + login + "&pass=" + pass);
		
		
	}
	
	var logout = document.getElementById("logout");
	
	logout.onclick = function () {
		var xmlHttp = newXMLHttpRequest();
		xmlHttp.open("POST", "Logout", true);
		xmlHttp.send(null);
	}
} 

function goEdit() {
	
	var xmlHttp = newXMLHttpRequest();
	
	var elems = document.getElementById(this.id).form.elements.age;
	
	// Открыть соединение с сервером
	xmlHttp.open("POST", "Action", true);
	
	xmlHttp.setRequestHeader("Content-Type", 
      "application/x-www-form-urlencoded");
	
	// Передать запрос
	xmlHttp.send("Name=" + elems[0] + "&Type=" + elems[1] + "&Family=" + elems[2]
			   + "&Life=" + elems[3] + "&Number=" + elems[4]);
	
//	var elems = document.getElementById(this.id).form.elements.age;
//	document.location.href = "edit.jsp";
	
//	document.getElementById("Name").value = elems[0];
//	
////	if(elems[1].equals(""))
////	document.getElementById("Type");
//	document.getElementById("Family").value = elems[2];;
////	document.getElementById("Life");
//	document.getElementById("Number").value = elems[4];
	
}

$(document).ready(function(){
	
	$("a.photo").fancybox();
});