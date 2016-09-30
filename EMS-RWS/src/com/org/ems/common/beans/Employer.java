package com.org.ems.common.beans;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employer")
public class Employer {

	private String employerId;
	private String employerName;
	private Calendar establishmentDate;
	private Contact employerContact;

	@XmlElement
	public String getEmployerId() {
		return employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	@XmlElement
	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	@XmlElement
	public Calendar getEstablishmentDate() {
		return establishmentDate;
	}

	public void setEstablishmentDate(Calendar establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

	@XmlElement
	public Contact getEmployerContact() {
		return employerContact;
	}

	public void setEmployerContact(Contact employerContact) {
		this.employerContact = employerContact;
	}
}
