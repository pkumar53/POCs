package com.org.ems.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.ems.adapter.DashboardAdapter;
import com.org.ems.model.Employee;

/**
 * Servlet implementation class DashboardController
 */
public class EmployeeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DashboardAdapter adapter;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		adapter = new DashboardAdapter();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeListController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get method entered");
		final List<Employee> employees = adapter.fetchAllEmployees();
		request.setAttribute("empList", employees);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/employeeList.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
