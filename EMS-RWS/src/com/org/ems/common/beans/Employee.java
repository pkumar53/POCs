package com.org.ems.common.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is the relation table in DB. This class holds the account and user class
 * together here.
 * 
 * @author pratyush.das
 *
 */
@XmlRootElement(name="employee")
public class Employee {

	private String employeeId;
	private String employeeCode;
	private Account account;
	private UserProfile userProfile;
	private List<Department> departments;
	private List<Practice> practices;
	private List<Role> roles;
	private List<Designation> designations;
	private boolean current;
	private Account managerAccount;
	private List<Project> projects;
	private List<EmploymentHistory> empHistories;

	@XmlElement
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@XmlElement
	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@XmlElement
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@XmlElement
	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@XmlElement
	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@XmlElement
	public List<Practice> getPractices() {
		return practices;
	}

	public void setPractices(List<Practice> practices) {
		this.practices = practices;
	}

	@XmlElement
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@XmlElement
	public List<Designation> getDesignations() {
		return designations;
	}

	public void setDesignations(List<Designation> designations) {
		this.designations = designations;
	}

	@XmlElement
	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	@XmlElement
	public Account getManagerAccount() {
		return managerAccount;
	}

	public void setManagerAccount(Account managerAccount) {
		this.managerAccount = managerAccount;
	}

	@XmlElement
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@XmlElement
	public List<EmploymentHistory> getEmpHistories() {
		return empHistories;
	}

	public void setEmpHistories(List<EmploymentHistory> empHistories) {
		this.empHistories = empHistories;
	}
}
