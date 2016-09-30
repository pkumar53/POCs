package com.org.ems.model;

import java.util.Calendar;

public class EmploymentHistory {

	private String historyId;
	private Employer employer;
	private Calendar employedFrom;
	private Calendar employedTo;
	private String roleName;
	private boolean current;

	public String getHistoryId() {
		return historyId;
	}

	public void setHistoryId(String historyId) {
		this.historyId = historyId;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public Calendar getEmployedFrom() {
		return employedFrom;
	}

	public void setEmployedFrom(Calendar employedFrom) {
		this.employedFrom = employedFrom;
	}

	public Calendar getEmployedTo() {
		return employedTo;
	}

	public void setEmployedTo(Calendar employedTo) {
		this.employedTo = employedTo;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}
}
