package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestService {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8080/EMS-RWS/ems/securityService/validateAccount");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			OutputStream outputStream = connection.getOutputStream();
			outputStream.write("{\"userName\":\"pratydas\",\"password\":\"password@123\"}".getBytes());
			outputStream.flush();
			System.out.println(connection.getResponseCode());
			
			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(
						(connection.getInputStream())));

					String output;
					System.out.println("Output from Server .... \n");
					while ((output = br.readLine()) != null) {
						System.out.println(output);
					}
					connection.disconnect();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		try {
//
//			URL url = new URL("http://localhost:8080/EMS-RWS/ems/securityService/validateAccount");
//			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//			conn.setDoOutput(true);
//			conn.setRequestMethod("POST");
//			conn.setRequestProperty("Content-Type", "application/json");
//
//			String input = "{\"userName\":\"pratydas\",\"password\":\"password@123\"}";
//
//			OutputStream os = conn.getOutputStream();
//			os.write(input.getBytes());
//			os.flush();
//
//			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
//				throw new RuntimeException("Failed : HTTP error code : "
//					+ conn.getResponseCode());
//			}
//
//			BufferedReader br = new BufferedReader(new InputStreamReader(
//					(conn.getInputStream())));
//
//			String output;
//			System.out.println("Output from Server .... \n");
//			while ((output = br.readLine()) != null) {
//				System.out.println(output);
//			}
//
//			conn.disconnect();
//
//		  } catch (MalformedURLException e) {
//
//			e.printStackTrace();
//
//		  } catch (IOException e) {
//
//			e.printStackTrace();
//
//		 }
//	}
}
