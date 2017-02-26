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
		
		window.location.reload();
		return true;
	}
	
	var logout = document.getElementById("logout");
	
	logout.onclick = function () {
		var xmlHttp = newXMLHttpRequest();
		xmlHttp.open("POST", "Logout", true);
		xmlHttp.send(null);

		alert(window.location.pathname);
		if(window.location.pathname.equals("/bgarden.by/account.jsp"))
			window.location.href="index.jsp";
		window.location.reload();
		return false;
	}
} 