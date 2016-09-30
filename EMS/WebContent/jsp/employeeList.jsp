<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/global.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/dashboard.css">
<title>Dashboard</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>
</head>
<body>
<form action="EmployeeListController" method="post" name="employeeListForm" id="employeeListForm">
<div id="headerContent">
	<h1>EmS</h1>
</div>
<div id="bodyContent">
	<div id="menu" class="menuSec">
		<ul>
			<li onclick="switchTab('employeeListForm','home');">Home</li>
			<li class="active">EmployeeList</li>
			<li onclick="switchTab('employeeListForm','profile');">Profile</li>
			<li onclick="switchTab('employeeListForm','actions');">Actions</li>
		</ul>
	</div>
	<div id="mainContent">
		<div class="listdiv">
			<h3>Employee list</h3>
			<table class="listtable">
				<thead>
					<tr>
						<th>S No</th>
						<th>Employee Name</th>
						<th>Employee ID</th>
						<th>Designation</th>
						<th>Practice</th>
						<th>Role</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${empList}" var="emp">
						<tr>
							<td>${emp.employeeId}</td>
							<td><a href="#">${emp.profile.firstName} ${emp.profile.middleName} ${emp.profile.lastName}</a></td>
							<td>${emp.employeeId}</td>
							<td>${emp.designations[0].designationName}</td>
							<td>${emp.practices[0].practiceName}</td>
							<td>${emp.roles[0].roleName}</td>
							<td><a href="#">Edit</a> | <a href="#">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<div id="footerContent"></div>
</form>
</body>
</html>