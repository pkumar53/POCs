package com.org.ems.service;

import com.org.ems.service.request.ValidAccountReq;
import com.org.ems.service.response.ValidAccountRes;

public interface SecurityService {

	public ValidAccountRes validAccount(ValidAccountReq validAccReq);
}
