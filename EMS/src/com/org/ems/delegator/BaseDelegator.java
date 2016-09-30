
package com.org.ems.delegator;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseDelegator {
	//http://localhost:8080/EMS-RWS/ems/securityService/validateAccount
	private static final String URL = "http://localhost:8080/EMS-RWS/ems/";
	protected static final String GET = "GET";
	protected static final String POST = "POST";
	private HttpURLConnection conn;
	
	protected HttpURLConnection openConnection(String uri, String requestType) {
		try {
			conn = (HttpURLConnection) getURL(uri).openConnection();
			conn.setRequestMethod(requestType);
			if (requestType.equals(GET)) {
				conn.setRequestProperty("Accept", "application/json");
			} else if (requestType.equals(POST)) {
				conn.setDoOutput(true);
				conn.setRequestProperty("Content-Type", "application/json");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}

	protected void closeConnection(HttpURLConnection conn) {
		// TODO Auto-generated method stub
		
	}

	private URL getURL(String uri) {
		URL url = null;
		try {
			url = new URL(URL+uri);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return url;
	}

}
