<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/global.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMS Login</title>
</head>
<body>
<form name="loginForm" id="loginForm" action="AuthController" method="post">
	<div id="headerContent">
		<h1>EmS</h1>
	</div>
	<div id="bodyContent">
		<div id="leftpane"></div>
		<div id="rightpane">
			<h1>EMS Login</h1>
			<c:if test="${error != null}">
				<c:forEach var="err" items="${error.errorMessage}">
					<c:out value="${err}"></c:out>
				</c:forEach>
			</c:if>
			<div class="inputDiv">
				<label>Username:</label>
				<input type="text" name="userName" id="username">
			</div>
			<div class="inputDiv">
				<label>Password:</label>
				<input type="password" name="password" id="password">
			</div>
			<div class="inputDiv">
				<button id="login" name="login" value="login">Login</button>
			</div>
		</div>
	</div>
	<div id="footerContent"></div>
</form>
</body>
</html>