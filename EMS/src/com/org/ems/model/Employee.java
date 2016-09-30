package com.org.ems.model;

import java.util.List;

public class Employee {

	private String employeeId;
	private String employeeCode;
	private EmsAccount account;
	private UserProfile profile;
	private List<Department> departments;
	private List<Practice> practices;
	private List<Role> roles;
	private List<Designation> designations;
	private boolean current;
	private EmsAccount managerAccount;
	private List<Project> projects;
	private List<EmploymentHistory> empHistories;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public EmsAccount getAccount() {
		return account;
	}

	public void setAccount(EmsAccount account) {
		this.account = account;
	}

	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<Practice> getPractices() {
		return practices;
	}

	public void setPractices(List<Practice> practices) {
		this.practices = practices;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Designation> getDesignations() {
		return designations;
	}

	public void setDesignations(List<Designation> designations) {
		this.designations = designations;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	public EmsAccount getManagerAccount() {
		return managerAccount;
	}

	public void setManagerAccount(EmsAccount managerAccount) {
		this.managerAccount = managerAccount;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<EmploymentHistory> getEmpHistories() {
		return empHistories;
	}

	public void setEmpHistories(List<EmploymentHistory> empHistories) {
		this.empHistories = empHistories;
	}
}
