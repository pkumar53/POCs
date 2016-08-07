<%@page session="false" contentType="text/html" pageEncoding="ISO-8859-1" import="java.util.*,javax.portlet.*,com.ibm.basicsample.*"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>                         
<portlet:defineObjects/>        
        

<DIV style="margin: 6px">
<H3 style="margin-bottom: 3px">Welcome!</H3>
This is a sample edit mode page.  You have to edit this page to customize it for your own use.<BR>
<H3 style="margin-bottom: 3px">Write to the PortletPreferences</H3>
This is a sample form to demonstrate how to change the PortletPreferences when the portlet is in edit mode.
<DIV style="margin: 12px; margin-bottom: 36px">
<% /******** Start of sample code ********/ %>
<% 
  PortletPreferences preferences = renderRequest.getPreferences();
  if( preferences!=null ) {
    String value = (String)preferences.getValue(com.ibm.basicsample.BasicSamplePortlet.EDIT_KEY,"");
%> 
  <FORM ACTION="<portlet:actionURL/>" METHOD="POST">
    <LABEL for="<%=com.ibm.basicsample.BasicSamplePortlet.EDIT_TEXT%>">New Value</LABEL><BR>
    <INPUT name="<%=com.ibm.basicsample.BasicSamplePortlet.EDIT_TEXT%>" value="<%=value%>" type="text"/><BR>
    <INPUT name="<%=com.ibm.basicsample.BasicSamplePortlet.EDIT_SUBMIT%>" value="Save" type="submit"/>
  </FORM>
<%
  }
else {
  %>Error: PortletPreferences is null.<%
  }
%>
<% /******** End of sample code *********/ %>
</DIV>


<FORM ACTION='<portlet:renderURL portletMode="view"/>' METHOD="POST">
	<INPUT NAME="back" TYPE="submit" VALUE="Back to view mode">
</FORM>
</DIV>