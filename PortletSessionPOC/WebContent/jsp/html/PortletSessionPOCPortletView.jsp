<%@page import="javax.portlet.PortletSession"%>
<%@page import="com.portlet.session.poc.beans.StudentBean"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%
	StudentBean bean = (StudentBean) renderRequest.getPortletSession()
			.getAttribute("portletScopeStudentBean");
	StudentBean bean2 = (StudentBean) renderRequest.getPortletSession()
			.getAttribute("appScopeStudentBean",
					PortletSession.APPLICATION_SCOPE);
	if (bean == null) {
%>
Enter the details
<a href="<portlet:renderURL portletMode="EDIT"/>">here</a>
<%
	} else {
%>
<h3>Portlet Scope Object</h3>
<table>
	<tbody>
		<tr>
			<td>First Name:</td>
			<td><%=bean.getFirstName() == null ? "" : bean
						.getFirstName()%></td>
		</tr>
		<tr>
			<td>Middle Name:</td>
			<td><%=bean.getMiddleName() == null ? "" : bean
						.getMiddleName()%></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><%=bean.getLastName() == null ? "" : bean.getLastName()%></td>
		</tr>
		<tr>
			<td>Roll Number:</td>
			<td><%=bean.getRollNumber()%></td>
		</tr>
		<tr>
			<td>Class Name:</td>
			<td><%=bean.getClassName() == null ? "" : bean
						.getClassName()%></td>
		</tr>
		<tr>
			<td>Section Name:</td>
			<td><%=bean.getSectionName() == null ? "" : bean
						.getSectionName()%></td>
		</tr>
	</tbody>
</table>
<%
	}
	if (bean2 != null) {
%>
<h3>Application Scope Object</h3>
<table>
	<tbody>
		<tr>
			<td>First Name:</td>
			<td><%=bean2.getFirstName() == null ? "" : bean2
						.getFirstName()%></td>
		</tr>
		<tr>
			<td>Middle Name:</td>
			<td><%=bean2.getMiddleName() == null ? "" : bean2
						.getMiddleName()%></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><%=bean2.getLastName() == null ? "" : bean2.getLastName()%></td>
		</tr>
		<tr>
			<td>Roll Number:</td>
			<td><%=bean2.getRollNumber()%></td>
		</tr>
		<tr>
			<td>Class Name:</td>
			<td><%=bean2.getClassName() == null ? "" : bean2
						.getClassName()%></td>
		</tr>
		<tr>
			<td>Section Name:</td>
			<td><%=bean2.getSectionName() == null ? "" : bean2
						.getSectionName()%></td>
		</tr>
	</tbody>
</table>
<%
	}
%>