package com.org.ems.delegator;

import java.io.IOException;
import java.net.HttpURLConnection;

public class AddressDelegator extends BaseDelegator {
	
	private static final String ADDR_SRV = "addressService/";
	
	public void fetchAddresses() {
		final String url = ADDR_SRV+"addresses/xml";
		HttpURLConnection connection = openConnection(url, GET);
		try {
			System.out.println(connection.getResponseCode());
		} catch (IOException e) {
			e.printStackTrace();
		}
		closeConnection(connection);
	}
	
}