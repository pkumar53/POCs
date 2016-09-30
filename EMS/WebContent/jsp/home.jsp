<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/global.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/home.css">
<title>Home</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>
</head>
<body>
<div id="headerContent">
	<h1>EmS</h1>
</div>
<div id="bodyContent">
<form id="homeForm" action="/HomeController" method="post">
	<div id="menu" class="menuSec">
		<ul>
			<li class="active">Home</li>
			<li onclick="switchTab('employeeList');">Employee List</li>
			<li onclick="switchTab('profile');">Profile</li>
			<li onclick="switchTab('actions');">Actions</li>
		</ul>
	</div>
	<div id="mainContent">
		<div id="lhspane">
			<strong>Introduction</strong><br />
			<strong>Settings</strong><br />
			<strong>Logout</strong><br />
		</div>
		<div id="rhspane">
			<h3>Welcome $ {employee.profile.firstName}</h3>
			Lorem ipsum al neos forghel sel dhenaplol. Lorem ipsum al neos forghel sel dhenaplol. Lorem ipsum al neos forghel sel dhenaplol
			Lorem ipsum al neos forghel sel dhenaplol. Lorem ipsum al neos forghel sel dhenaplol. Lorem ipsum al neos forghel sel dhenaplol
			Lorem ipsum al neos forghel sel dhenaplol. Lorem ipsum al neos forghel sel dhenaplol. Lorem ipsum al neos forghel sel dhenaplol
			Lorem ipsum al neos forghel sel dhenaplol. Lorem ipsum al neos forghel sel dhenaplol. Lorem ipsum al neos forghel sel dhenaplol
		</div>
	</div>
	<input type="hidden" name="actionRequested" value="">
</form>
</div>
<div id="footerContent"></div>
</body>
</html>