<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.BufferedWriter"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.File"%>
<%@page import="java.net.URL"%>
<%@page import="javax.xml.transform.*" %>
<%@page import="javax.xml.transform.stream.StreamResult"%>
<%@page import="javax.xml.transform.stream.StreamSource"%>
<%@page import="java.io.File"%>
<%@page import="java.io.IOException"%>
<%@page import="java.net.URISyntaxException" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
		<%
		URL url = getClass().getResource("/nav");
		
		TransformerFactory factory = TransformerFactory.newInstance();
        Source xslt = new StreamSource(new File(url.getPath()+"/navigation.xsl"));
        Transformer transformer = factory.newTransformer(xslt);

        Source text = new StreamSource(new File(url.getPath()+"/navigation.xml"));
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.transform(text, new StreamResult(
        		new File(url.getPath()+"navigation_out.xml")));
		
		BufferedReader br = new BufferedReader(new FileReader(url.getPath()+"/navigation_out.xml"));
		BufferedWriter bw = new BufferedWriter(response.getWriter());
		String line;
		
		while((line = br.readLine())!=null)
			bw.write(line);bw.flush();
		br.close();
		%>
</body>
</html>