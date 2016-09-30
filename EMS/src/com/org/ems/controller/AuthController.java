package com.org.ems.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.ems.adapter.AuthAdapter;
import com.org.ems.constant.EMSConstants;
import com.org.ems.model.ErrorBean;

/**
 * Servlet implementation class LoginController
 */
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AuthAdapter adapter;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthController() {
        super();
        adapter = new AuthAdapter();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String requestType = request.getParameter(EMSConstants.LOGIN);
		final String userName = request.getParameter(EMSConstants.USERNAME);
		final String password = request.getParameter(EMSConstants.PASSWORD);
		
		if (requestType != null && requestType.equals(EMSConstants.LOGIN)) {
			if (userName != null && password != null) {
				//code here for login
				boolean success = adapter.validateUser(userName, password);
				if (success) {
					request.getSession().setAttribute(EMSConstants.USERTOKEN, userName);
					RequestDispatcher rd = request.getRequestDispatcher("/jsp/home.jsp");
					rd.forward(request, response);
				} else {
					ErrorBean bean = new ErrorBean();
					List<String> messages = new ArrayList<String>();
					String message = "Invalid Login";
					messages.add(message);
					bean.setErrorMessage(messages);
					request.setAttribute("error", bean);
					RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
					rd.forward(request, response);
				}
			}
		} else {
			request.getSession().removeAttribute(EMSConstants.USERTOKEN);
		}
	}

}
