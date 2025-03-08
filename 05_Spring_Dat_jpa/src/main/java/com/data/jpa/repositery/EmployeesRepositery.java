package com.data.jpa.repositery;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.data.jpa.entity.Employees;

public interface EmployeesRepositery  extends CrudRepository<Employees, Integer>{

	
	public List<Employees> findByEmpSalaryGreaterThan(Double esalary);
}
