package com.org.ems.adapter;

import com.org.ems.delegator.SecurityDelegator;
import com.org.ems.model.EmsAccount;

public class AuthAdapter {

	private SecurityDelegator delegator;
	
	public AuthAdapter() {
		delegator = new SecurityDelegator();
	}
	
	public boolean validateUser(String userName, String password) {
		EmsAccount account = new EmsAccount();
		account.setUserName(userName);
		account.setPassword(password);
		delegator.validateUser(account);
		return true;
	}
}
