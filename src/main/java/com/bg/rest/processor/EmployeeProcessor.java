package com.bg.rest.processor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bg.rest.vo.EmployeeVO;

@Service
public class EmployeeProcessor {
	
	public static final Logger LOGGER=LoggerFactory.getLogger(EmployeeProcessor.class);

	public boolean processEmployee(EmployeeVO emp) {
		/*
		 * 1. Validate Incoming request
		 */
		
		validateEmpRequest(emp);
		
		/*
		 * 2. Create Api call
		 */
		createEmpApiAddReq(emp);
		return true;
	}
	
	public boolean validateEmpRequest(EmployeeVO emp) {
		return emp.geteName().matches("[a-z]");
	}
	
	public boolean createEmpApiAddReq(EmployeeVO emp) {
		String apiReq=emp.toString();
		/*
		 * Create API call
		 * */
		LOGGER.info("apiCall %s",apiReq);
		return true;
	}
}
