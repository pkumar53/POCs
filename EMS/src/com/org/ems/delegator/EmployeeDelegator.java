package com.org.ems.delegator;

import java.util.ArrayList;
import java.util.List;

import com.org.ems.model.Designation;
import com.org.ems.model.Employee;
import com.org.ems.model.UserProfile;

public class EmployeeDelegator extends BaseDelegator {

//	private static final String EMP_SRV = "employeeService/";

	public List<Employee> fetchAllEmployees() {
		List<Employee> employees = null;
		
//		HttpURLConnection connection = openConnection(EMP_SRV+"/allemployees");
//		
//		try {
//			System.out.println(connection.getResponseCode());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		closeConnection(connection);
		
		
		employees = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setEmployeeId("1");
		employee.setEmployeeCode("142666");
		UserProfile profile = new UserProfile();
		profile.setFirstName("firstName");
		profile.setMiddleName("middleName");
		profile.setLastName("lastName");
		profile.setGender("gender");
		employee.setProfile(profile);
		List<Designation> designations = new ArrayList<Designation>();
		Designation designation = new Designation();
		designation.setDesignationName("designationName");
		designations.add(designation );
		employee.setDesignations(designations);
		employees.add(employee);

		Employee employee2 = new Employee();
		employee2.setEmployeeId("1");
		employee2.setEmployeeCode("142666");
		UserProfile profile2 = new UserProfile();
		profile2.setFirstName("firstName");
		profile2.setMiddleName("middleName");
		profile2.setLastName("lastName");
		profile2.setGender("gender");
		
		employee2.setProfile(profile2);
		employees.add(employee2);
		return employees;
	}
}
