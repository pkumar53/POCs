<%@page import="javax.portlet.PortletSession"%>
<%@page import="com.portlet.session.poc.beans.StudentBean"%>
<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%
StudentBean bean = (StudentBean)renderRequest.getPortletSession().getAttribute("appScopeStudentBean", PortletSession.APPLICATION_SCOPE);
%>
<form action='<portlet:actionURL portletMode="VIEW"/>' >
	<table>
		<tbody>
			<tr>
				<td>Enter First Name:</td>
				<td><input type="text" name="firstName" value="<%=bean.getFirstName() == null?"":bean.getFirstName()%>"></td>
			</tr>
			<tr>
				<td>Enter Middle Name:</td>
				<td><input type="text" name="middleName" value="<%=bean.getMiddleName() == null?"":bean.getMiddleName()%>"></td>
			</tr>
			<tr>
				<td>Enter Last Name:</td>
				<td><input type="text" name="lastName" value="<%=bean.getLastName() == null?"":bean.getLastName()%>"></td>
			</tr>
			<tr>
				<td>Enter Roll Number:</td>
				<td><input type="text" name="rollNumber" value="<%=bean.getRollNumber()%>"></td>
			</tr>
			<tr>
				<td>Enter Class Name:</td>
				<td><input type="text" name="className" value="<%=bean.getClassName() == null?"":bean.getClassName()%>"></td>
			</tr>
			<tr>
				<td>Enter Section Name:</td>
				<td><input type="text" name="sectionName" value="<%=bean.getSectionName() == null?"":bean.getSectionName()%>"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
		</tbody>
	</table>
</form>