package com.org.ems.common.beans;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employmentHistory")
public class EmploymentHistory {

	private String employmentHistoryId;
	private Employer employer;
	private Calendar employedFrom;
	private Calendar employedTo;
	private boolean current;
	private String roleName;

	@XmlElement
	public String getEmploymentHistoryId() {
		return employmentHistoryId;
	}

	public void setEmploymentHistoryId(String employmentHistoryId) {
		this.employmentHistoryId = employmentHistoryId;
	}

	@XmlElement
	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	@XmlElement
	public Calendar getEmployedFrom() {
		return employedFrom;
	}

	public void setEmployedFrom(Calendar employedFrom) {
		this.employedFrom = employedFrom;
	}

	@XmlElement
	public Calendar getEmployedTo() {
		return employedTo;
	}

	public void setEmployedTo(Calendar employedTo) {
		this.employedTo = employedTo;
	}

	@XmlElement
	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	@XmlElement
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
