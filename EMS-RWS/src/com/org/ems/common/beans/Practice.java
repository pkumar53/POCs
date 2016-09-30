package com.org.ems.common.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="practice")
public class Practice {

	private String practiceId;
	private String practiceName;
	private String practiceDesc;
	private boolean current;

	@XmlElement
	public String getPracticeId() {
		return practiceId;
	}

	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	@XmlElement
	public String getPracticeName() {
		return practiceName;
	}

	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

	@XmlElement
	public String getPracticeDesc() {
		return practiceDesc;
	}

	public void setPracticeDesc(String practiceDesc) {
		this.practiceDesc = practiceDesc;
	}

	@XmlElement
	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}
}
