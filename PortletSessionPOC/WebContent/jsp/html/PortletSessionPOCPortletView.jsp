<%@page import="com.portlet.session.poc.beans.StudentBean"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%
	StudentBean bean = (StudentBean) renderRequest.getPortletSession()
			.getAttribute("sessionStudentBean");
	if (bean == null) {
%>
Enter the details
<a href="<portlet:renderURL portletMode="EDIT"/>">here</a>
<%
	} else {
%>
<table>
	<tbody>
		<tr>
			<td>Enter First Name:</td>
			<td><%=bean.getFirstName() == null ? "" : bean
						.getFirstName()%></td>
		</tr>
		<tr>
			<td>Enter Middle Name:</td>
			<td><%=bean.getMiddleName() == null ? "" : bean
						.getMiddleName()%></td>
		</tr>
		<tr>
			<td>Enter Last Name:</td>
			<td><%=bean.getLastName() == null ? "" : bean.getLastName()%></td>
		</tr>
		<tr>
			<td>Enter Roll Number:</td>
			<td><%=bean.getRollNumber()%></td>
		</tr>
		<tr>
			<td>Enter Class Name:</td>
			<td><%=bean.getClassName() == null ? "" : bean
						.getClassName()%></td>
		</tr>
		<tr>
			<td>Enter Section Name:</td>
			<td><%=bean.getSectionName() == null ? "" : bean
						.getSectionName()%></td>
		</tr>
	</tbody>
</table>
<%
	}
%>