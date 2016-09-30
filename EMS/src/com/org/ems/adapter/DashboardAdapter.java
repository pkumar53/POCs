package com.org.ems.adapter;

import java.util.List;

import com.org.ems.delegator.AddressDelegator;
import com.org.ems.delegator.EmployeeDelegator;
import com.org.ems.model.Employee;

public class DashboardAdapter {

	private AddressDelegator addressDelegator;
	private EmployeeDelegator employeeDelegator;

	public DashboardAdapter() {
		addressDelegator = new AddressDelegator();
		employeeDelegator = new EmployeeDelegator();
	}

	public void fetchAddressList() {
		addressDelegator.fetchAddresses();
	}

	public List<Employee> fetchAllEmployees() {
		return employeeDelegator.fetchAllEmployees();
	}
}
