package com.example.secondapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.secondapp.entity.Employee;
import com.example.secondapp.service.EmployeeService;
import com.example.secondapp.service.EmployeeServiceImpl;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeServiceImpl empservc;

	
	
	@GetMapping(value = "employee")
	public Employee getEmployee(@RequestParam("id") String id) {
		Employee empl = new Employee();
		/*
		 * empl.setEmpid("123"); empl.setEmpname("jaya"); empl.setEmpdoj("12-06-2018");
		 */
		
		return empservc.getEmploye(new Long(id));
	}
	
	
	
	@GetMapping(value = "employees")
	public String getAllEmployee() {
		return "jaya1";

	}
	
	@PostMapping(value="employee")
	public void saveEmploye(@RequestBody Employee emp)
	{
		empservc.saveEmploye(emp);
	}
	
	

}
