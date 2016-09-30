package com.org.ems.dao.impl;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class TestDaoImpl extends BaseDaoImpl {

	public static void main(String[] args) {
		new TestDaoImpl().testDaoMethod();
		
	}

	private void testDaoMethod() {
		String validateUserQuery = "{CALL ems.sp_validateUser(?,?,?)}";
		try {
			System.out.println("coi");
			CallableStatement validateUserStmt = getConnection().prepareCall(validateUserQuery);
			System.out.println("connection ");
			validateUserStmt.setString(1, "pratydas");
			validateUserStmt.setString(2, "password@123");
			validateUserStmt.registerOutParameter(3, Types.INTEGER);
			boolean hadResults = validateUserStmt.execute();
			System.out.println(hadResults);
			System.out.println(validateUserStmt.getBoolean(3));
			
			final ResultSet resultSet = validateUserStmt.getResultSet();
			resultSet.next();
			System.out.println(resultSet.getString(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getString(6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
