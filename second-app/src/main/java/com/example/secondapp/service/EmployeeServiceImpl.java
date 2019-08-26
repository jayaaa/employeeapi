package com.example.secondapp.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.secondapp.entity.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{

	@PersistenceContext
	EntityManager repo;
	
	@Override
	public Employee getEmploye(Long id) {
		Employee employee =  repo.find(Employee.class, id);
		System.out.println(employee.toString());
		return employee;
	}

	@Override
	public void saveEmploye(Employee emp) {
		repo.persist(emp);
	   
	}

}
