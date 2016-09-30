package com.org.ems.dao;

import com.org.ems.common.beans.Employee;

public interface SecurityDao {

	public Employee validateUserDetail(String userName, String password);

}
