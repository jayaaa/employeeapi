package com.example.secondapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.secondapp.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

}
