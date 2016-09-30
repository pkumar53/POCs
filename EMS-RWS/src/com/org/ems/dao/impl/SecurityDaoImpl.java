package com.org.ems.dao.impl;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.org.ems.common.beans.Account;
import com.org.ems.common.beans.Employee;
import com.org.ems.common.beans.UserProfile;
import com.org.ems.dao.SecurityDao;

public class SecurityDaoImpl extends  BaseDaoImpl implements SecurityDao {

	@Override
	public Employee validateUserDetail(String userName, String password) {
		Employee employee = null;
		System.out.println("entered validateUserDetail dao method");
		String validateUserQuery = "{CALL ems.sp_validateUser(?,?,?)}";
		try {
			CallableStatement validateUserStmt = getConnection().prepareCall(validateUserQuery);
			validateUserStmt.setString(1, userName);
			validateUserStmt.setString(2, password);
			validateUserStmt.registerOutParameter(3, Types.INTEGER);
			boolean hadResults = validateUserStmt.execute();
			if (hadResults) {
				employee = new Employee();
				ResultSet resultSet = validateUserStmt.getResultSet();
				resultSet.next();
				employee.setEmployeeCode(resultSet.getString("employeeCode"));
				employee.setEmployeeId(resultSet.getString("employeeId"));
				UserProfile userProfile = new UserProfile();
				userProfile.setFirstName(resultSet.getString("firstName"));
				userProfile.setMiddleName(resultSet.getString("middleName"));
				userProfile.setLastName(resultSet.getString("lastName"));
				employee.setUserProfile(userProfile);
				Account account = new Account();
				account.setAccountId(resultSet.getString("accountId"));
				account.setAdmin(resultSet.getBoolean("is_admin"));
				employee.setAccount(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

}
