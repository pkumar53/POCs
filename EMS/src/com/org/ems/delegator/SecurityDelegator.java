package com.org.ems.delegator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import com.org.ems.model.Employee;
import com.org.ems.model.EmsAccount;

public class SecurityDelegator extends BaseDelegator {

	private static final String SECURITY_SERV = "securityService/";
	
	public Employee validateUser(EmsAccount account) {
		Employee employee = null;
		if (account != null) {
			
			final String uri = SECURITY_SERV+"validateAccount";
			HttpURLConnection conn = openConnection(uri, POST);
			try {
				OutputStream outputStream = conn.getOutputStream();
				final String jsonParams = "{\"userName\":\""+account.getUserName()+"\",\"password\":\""+account.getPassword()+"\"}";
				outputStream.write(jsonParams.getBytes());
				System.out.println("response code "+conn.getResponseCode());
				
				if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String output;
					System.out.println("output is ");
					while ((output = br.readLine()) != null) {
						System.out.println(output);
					}
				}
				System.out.println(conn.getResponseMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return employee;
	}
}
