package com.org.ems.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class BaseDaoImpl {

	private static final String EMS_JNDI_NAME = "java:comp/env/jdbc/ems";
	private Connection conn;
	private DataSource dataSource;
	private boolean flag = true;
	
	protected Connection getConnection() {
		try {
			if (conn == null)
				conn = getDataSource().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(conn);
		return conn;
	}

	private DataSource getDataSource() {
		try {
			if (dataSource == null) {
				if (flag) {
					MysqlDataSource ds = new MysqlDataSource();
					ds.setUser("root");
					ds.setPassword("");
					ds.setServerName("localhost");
					ds.setPort(3306);
					ds.setDatabaseName("ems");
					 dataSource = ds;
				} else {
					Context context = new InitialContext();
					dataSource = (DataSource) context.lookup(EMS_JNDI_NAME);
				}
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return dataSource;
	}
}
