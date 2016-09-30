package com.org.ems.model;

public class Practice {

	private String practiceId;
	private String practiceName;
	private String practiceDesc;
	private boolean current;

	public String getPracticeId() {
		return practiceId;
	}

	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	public String getPracticeName() {
		return practiceName;
	}

	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

	public String getPracticeDesc() {
		return practiceDesc;
	}

	public void setPracticeDesc(String practiceDesc) {
		this.practiceDesc = practiceDesc;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}
}
