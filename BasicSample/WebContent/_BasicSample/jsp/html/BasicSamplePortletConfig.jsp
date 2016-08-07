<%@page session="false" contentType="text/html" pageEncoding="ISO-8859-1" import="javax.portlet.*,com.ibm.basicsample.*" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>                
<portlet:defineObjects/> 
 

<DIV style="margin: 6px">

<H3 style="margin-bottom: 3px">Welcome!</H3>
This is a sample config mode page.  You have to edit this page to customize it for your own use.<BR>
<H3 style="margin-bottom: 3px">Write to the PortletPreferences</H3>
This is a sample form to demonstrate how to change the PortletPreferences when the portlet is in configure mode.
<DIV style="margin: 12px; margin-bottom: 36px">
<% /******** Start of sample code ********/ %>
<% 
  PortletPreferences preferences = renderRequest.getPreferences();
  if( preferences!=null ) {
    String value = (String)preferences.getValue(com.ibm.basicsample.BasicSamplePortlet.CONFIG_KEY,"");
%> 
  <FORM ACTION="<portlet:actionURL/>" METHOD="POST">
    <LABEL for="<%=com.ibm.basicsample.BasicSamplePortlet.CONFIG_TEXT%>">New Value</LABEL><BR>
    <INPUT name="<%=com.ibm.basicsample.BasicSamplePortlet.CONFIG_TEXT%>" value="<%=value%>" type="text"/><BR>
    <INPUT name="<%=com.ibm.basicsample.BasicSamplePortlet.CONFIG_SUBMIT%>" value="Save" type="submit"/>
  </FORM>
<%
  }
else {
  %>Error: PortletPreferences is null.<%
  }
%>
<% /******** End of sample code *********/ %>


</DIV>
</DIV>