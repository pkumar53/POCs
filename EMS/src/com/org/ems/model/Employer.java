package com.org.ems.model;

import java.util.Calendar;

public class Employer {

	private String employerId;
	private String employerName;
	private Calendar establishmentDate;
	private Contact contact;

	public String getEmployerId() {
		return employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Calendar getEstablishmentDate() {
		return establishmentDate;
	}

	public void setEstablishmentDate(Calendar establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
