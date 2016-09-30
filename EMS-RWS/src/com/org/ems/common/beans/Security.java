package com.org.ems.common.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="security")
public class Security {

	private String securityId;
	private String securityQuestionOne;
	private String securityQuestionTwo;
	private String securityQuestionThree;
	private String securityAnswerOne;
	private String securityAnswerTwo;
	private String securityAnswerThree;

	@XmlElement
	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	@XmlElement
	public String getSecurityQuestionOne() {
		return securityQuestionOne;
	}

	public void setSecurityQuestionOne(String securityQuestionOne) {
		this.securityQuestionOne = securityQuestionOne;
	}

	@XmlElement
	public String getSecurityQuestionTwo() {
		return securityQuestionTwo;
	}

	public void setSecurityQuestionTwo(String securityQuestionTwo) {
		this.securityQuestionTwo = securityQuestionTwo;
	}

	@XmlElement
	public String getSecurityQuestionThree() {
		return securityQuestionThree;
	}

	public void setSecurityQuestionThree(String securityQuestionThree) {
		this.securityQuestionThree = securityQuestionThree;
	}

	@XmlElement
	public String getSecurityAnswerOne() {
		return securityAnswerOne;
	}

	public void setSecurityAnswerOne(String securityAnswerOne) {
		this.securityAnswerOne = securityAnswerOne;
	}

	@XmlElement
	public String getSecurityAnswerTwo() {
		return securityAnswerTwo;
	}

	public void setSecurityAnswerTwo(String securityAnswerTwo) {
		this.securityAnswerTwo = securityAnswerTwo;
	}

	@XmlElement
	public String getSecurityAnswerThree() {
		return securityAnswerThree;
	}

	public void setSecurityAnswerThree(String securityAnswerThree) {
		this.securityAnswerThree = securityAnswerThree;
	}
}
