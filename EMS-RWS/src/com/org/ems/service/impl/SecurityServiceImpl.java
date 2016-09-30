package com.org.ems.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.ems.common.beans.Employee;
import com.org.ems.dao.SecurityDao;
import com.org.ems.dao.impl.SecurityDaoImpl;
import com.org.ems.service.SecurityService;
import com.org.ems.service.constants.Status;
import com.org.ems.service.request.ValidAccountReq;
import com.org.ems.service.response.ValidAccountRes;

@Path("/securityService")
public class SecurityServiceImpl implements SecurityService {

	private SecurityDao secServDao = new SecurityDaoImpl();
	
	@POST
	@Path("/validateAccount")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public ValidAccountRes validAccount(ValidAccountReq validAccReq) {
		System.out.println("entered validAccount service");
		ValidAccountRes res = null;
		if (validAccReq != null) {
			final String userName = validAccReq.getUserName();
			final String password = validAccReq.getPassword();
			Employee employee = secServDao.validateUserDetail(userName,password);
			System.out.println(employee);
			
			if (employee == null) {
				res = new ValidAccountRes();
				res.setStatus(Status.FAILURE);
				res.setMessage("Invalid User");
			} else {
				res = new ValidAccountRes();
				res.setEmployee(employee);
				res.setStatus(Status.SUCCESS);
				res.setMessage("Valid User");
			}
		}
		return res;
	}
}
