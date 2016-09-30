package com.org.ems.model;

import java.util.Calendar;

public class Project {

	private String projectId;
	private String projectName;
	private Calendar projectStartDate;
	private Calendar projectEndDate;
	private String projectCost;
	private boolean current;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Calendar getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Calendar projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Calendar getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(Calendar projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public String getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(String projectCost) {
		this.projectCost = projectCost;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}
}
