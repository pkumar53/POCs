<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/global.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/actions.css">
<title>Actions</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>
</head>
<body>
<form id="actionForm" name="actionForm" action="ActionController" method="post">
<div id="headerContent">
	<h1>EmS</h1>
</div>
<div id="bodyContent">
	<div id="menu" class="menuSec">
		<ul>
			<li onclick="switchTab('actionForm','home');">Home</li>
			<li onclick="switchTab('actionForm','employeeList');">Employee List</li>
			<li onclick="switchTab('actionForm','profile');">Profile</li>
			<li class="active">Actions</li>
		</ul>
	</div>
	<div id="mainContent">
		<div class="listdiv">
			<h3>$ {action} Employee</h3>
			<table class="listtable">
				<tbody>
					<tr>
						<td class="label">Employee ID</td>
						<td><label>142666</label></td>
					</tr>
					<tr>
						<td class="label">Employee Name</td>
						<td><input type="text" name="empName" value="Pratyush Kumar Das"></td>
					</tr>
					<tr>
						<td class="label">Designation</td>
						<td><input type="text" name="designation" value="Senior Software Engineer"></td>
					</tr>
					<tr>
						<td class="label">Practice</td>
						<td><input type="text" name="practice" value="Java"></td>
					</tr>
					<tr>
						<td class="label">Role</td>
						<td><input type="text" name="role" value="Senior Developer"></td>
					</tr>
					<tr>
						<td class="label">Action</td>
						<td><input type="submit" name="submit" value="Save Employee Details"></td>
					</tr>
				</tbody>
			</table>
		</div>		
	</div>
</div>
<div id="footerContent"></div>
</form>
</body>
</html>