package com.bg.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bg.rest.processor.EmployeeProcessor;
import com.bg.rest.vo.EmployeeVO;

@RestController
public class EmployeeController {

	public static final Logger LOGGER=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired(required=true)
	EmployeeProcessor employeeProcessor;
	
	@RequestMapping(path="/add", method=RequestMethod.PUT)
	public String addEmployee(@RequestParam(name="person") String eName,
			@RequestParam(name="person") long eId,
			@RequestParam(name="person") String eDept,
			@RequestParam(name="person") String eMob) {
		
		EmployeeVO emp=new EmployeeVO(eName,eId,eDept,eMob);
		if(employeeProcessor.processEmployee(emp)) {
			return "<font color='green'>Request Processed successfully</font>";
		}else {
			return "<font color='red'>Request processing failed</font>";
		}
	}
	
}
