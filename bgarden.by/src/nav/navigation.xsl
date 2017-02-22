<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl">
	

        	
<xsl:template match="/">

<xsl:apply-templates select="pages" />

</xsl:template>

 <xsl:template match="pages">
 	<html />
 	<body>
 	<nav>
	<ul>
		<xsl:apply-templates select="page" />
	</ul>
	</nav>
	</body>
 </xsl:template>
 
 <xsl:template match="page">
 	<li><a>
 		<xsl:attribute name="href">
 			<xsl:value-of select="url"/>
 		</xsl:attribute>
 		
 		<xsl:value-of select="name"/>
 	</a></li></xsl:template>
</xsl:stylesheet>