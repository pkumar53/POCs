<%@page session="false" contentType="text/html" pageEncoding="ISO-8859-1" import="java.util.*,javax.portlet.*,com.ibm.basicsample.*" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>                
<portlet:defineObjects/>
<%
	com.ibm.basicsample.BasicSamplePortletSessionBean sessionBean = (com.ibm.basicsample.BasicSamplePortletSessionBean)renderRequest.getPortletSession().getAttribute(com.ibm.basicsample.BasicSamplePortlet.SESSION_BEAN);
%>
 

<DIV style="margin: 6px">

<H3 style="margin-bottom: 3px">Welcome!</H3>
This is a sample view mode page.  You have to edit this page to customize it for your own use.<BR>
<H3 style="margin-bottom: 3px">Order entry</H3>
This is a sample form to test action handling.

<DIV style="margin: 12px; margin-bottom: 36px">
<% /******** Start of sample code ********/ %>
<%
	String formText = sessionBean.getFormText();
	if( formText.length()>0 ) {
		%>
		Order details for order id "<%=formText%>" should be displayed here.
		<%
	}
	%>
	<FORM method="POST" action="<portlet:actionURL/>">
		<LABEL  for="<%=com.ibm.basicsample.BasicSamplePortlet.FORM_TEXT%>">Enter Order id:</LABEL><BR>
		<INPUT name="<%=com.ibm.basicsample.BasicSamplePortlet.FORM_TEXT%>" type="text"/>
		<INPUT name="<%=com.ibm.basicsample.BasicSamplePortlet.FORM_SUBMIT%>" type="submit" value="Submit"/>
	</FORM>
<% /******** End of sample code *********/ %>
</DIV>

</DIV>