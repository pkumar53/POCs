package com.ibm.portletsessionpoc;

import java.io.*;

import javax.portlet.*;

import com.portlet.session.poc.beans.StudentBean;

/**
 * A sample portlet
 */
public class PortletSessionAppScopePOCPortlet extends javax.portlet.GenericPortlet {
	private static final String STUDENT_BEAN = "appScopeStudentBean";



	/**
	 * @see javax.portlet.Portlet#init()
	 */
	public void init() throws PortletException{
		super.init();
	}

	/**
	 * Serve up the <code>view</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doView(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	public void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		response.setContentType(request.getResponseContentType());

		// Invoke the JSP to render, replace with the actual jsp name
		final PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher("/jsp/html/PortletSessionAppScopePOCPortletView.jsp");
		rd.include(request,response);
	}

	/**
	 * Serve up the <code>edit</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doEdit(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	public void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		response.setContentType(request.getResponseContentType());
		final PortletSession session = request.getPortletSession();
		if (session == null) {
			//error page
		}
		StudentBean bean = (StudentBean) session.getAttribute(STUDENT_BEAN, PortletSession.APPLICATION_SCOPE);
		if (bean == null) {
			bean = new StudentBean();
			session.setAttribute(STUDENT_BEAN, bean, PortletSession.APPLICATION_SCOPE);
		}
		final PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher("/jsp/html/PortletSessionAppScopePOCPortletEdit.jsp");
		rd.include(request, response);
	}

	/**
	 * Serve up the <code>help</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doHelp(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	protected void doHelp(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		// TODO: auto-generated method stub
	}

	/**
	 * Process an action request.
	 * 
	 * @see javax.portlet.Portlet#processAction(javax.portlet.ActionRequest, javax.portlet.ActionResponse)
	 */
	public void processAction(ActionRequest request, ActionResponse response) throws PortletException, java.io.IOException {
		final PortletSession session = request.getPortletSession();
		if (session == null) {
			//error page
		}
		StudentBean bean = (StudentBean) session.getAttribute(STUDENT_BEAN, PortletSession.APPLICATION_SCOPE);
		if (bean != null) {
			final String firstName = request.getParameter("firstName");
			final String lastName = request.getParameter("lastName");
			final String middleName = request.getParameter("middleName");
			final String rollNumber = request.getParameter("rollNumber");
			final String className = request.getParameter("className");
			final String sectionName = request.getParameter("sectionName");
			bean.setFirstName(firstName);
			bean.setMiddleName(middleName);
			bean.setLastName(lastName);
			bean.setRollNumber(rollNumber != null?Integer.parseInt(rollNumber):0);
			bean.setClassName(className);
			bean.setSectionName(sectionName);
		}
	}
	
	
	
	/**
	 * Process a serve Resource request.
	 * 
	 * @see javax.portlet.Portlet#serveResource(javax.portlet.ResourceRequest, javax.portlet.ResourceResponse)
	 */
	public void serveResource(ResourceRequest request, ResourceResponse response) throws PortletException, java.io.IOException {
		String resourceID = request.getResourceID();
		if (resourceID.equals("resourceID")) {
			// Insert code for serving the resource 
		}
	}

}
