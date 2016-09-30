<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD</title>
</head>
<body>
<f:view>
	<h:form>
		<h:panelGrid border="1" columns="1">
			<h:outputText value="Name"></h:outputText>
			<h:inputText value="#{helloBean.name}"></h:inputText>
			<h:commandButton action="#{helloBean.addMethod}" value="Try add"></h:commandButton>
		</h:panelGrid>
	</h:form>
</f:view>
</body>
</html>