<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/global.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/emp_det.css">
<title>Profile</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>
</head>
<body>
<form name="profileForm" id="profileForm" action="ProfileController" method="post">
<div id="headerContent">
	<h1>EmS</h1>
</div>
<div id="bodyContent">
	<div id="menu" class="menuSec">
		<ul>
			<li onclick="switchTab('profileForm','home');">Home</li>
			<li onclick="switchTab('profileForm','employeeList');">Employee List</li>
			<li class="active">Profile</li>
			<li onclick="switchTab('profileForm','actions');">Actions</li>
		</ul>
	</div>
	<div id="mainContent">
		<div class="empDet">
			<h2>Employee Details</h2>
			<div class="rowfix">
				<div class="columnfix label">Name: </div>
				<div class="columnfix data">${employee.profile.firstName employee.profile.middleName employee.profile.lastName}</div>
			</div>
			<div class="rowfix">
				<div class="columnfix label">Employee ID: </div>
				<div class="columnfix data">${employee.employeeId}</div>
			</div>
			<div class="rowfix">
				<div class="columnfix label">Address: </div>
				<div class="columnfix data">${employee.profile.contact.address.country}</div>
			</div>
			<div class="rowfix">
				<div class="columnfix label">Company: </div>
				<div class="columnfix data">CGI Information Systems and Management Consultants Pvt. Ltd.</div>
			</div>
		</div>
		<img alt="pic" src="../images/IMG_20151124_135731.jpg">
	</div>
</div>
<div id="footerContent"></div>
</form>
</body>
</html>