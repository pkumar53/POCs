package com.org.ems.common.beans;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="project")
public class Project {

	private String projectId;
	private String projectName;
	private Calendar projectStartDate;
	private Calendar projectEndDate;
	private float projectCost;
	private boolean current;

	@XmlElement
	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@XmlElement
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@XmlElement
	public Calendar getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Calendar projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	@XmlElement
	public Calendar getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(Calendar projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	@XmlElement
	public float getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(float projectCost) {
		this.projectCost = projectCost;
	}

	@XmlElement
	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}
}
