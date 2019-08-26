package com.example.secondapp.service;

import com.example.secondapp.entity.Employee;

public interface EmployeeService 
{
public Employee getEmploye(Long id);
public void saveEmploye(Employee emp);
}
