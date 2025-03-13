package com.data.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.jpa.entity.Emp_Entity;
import com.data.jpa.repo.Emp_Entity_Repositery;

@Service
public class Emp_Entity_Service {

	private Emp_Entity_Repositery repo;

	public Emp_Entity_Service(Emp_Entity_Repositery repo) {
		this.repo = repo;
	}

	public void saveEmpEntityDetails() {

		Emp_Entity emp = new Emp_Entity();

		emp.setEid(5);
		emp.setEname("Hankaj Kumar");
		emp.setEsalary(9343.09);
		emp.setEgender("female");
		emp.seteCountery("India");

		repo.save(emp);

		System.out.println("************Records Inserted Successfully************8");
	}

	public void getAllEmpDetails() {

		List<Emp_Entity> allEmpDetails = repo.getAllEmpDetails();
		allEmpDetails.forEach(System.out::println);

	}

	
	public void getAllEmpSql() {

		List<Emp_Entity> allEmpDetails = repo.getEmpsSql();
		allEmpDetails.forEach(System.out::println);

	}
	public void getAllEmpByGender() {

		List<Emp_Entity> allEmpDetails = repo.getAllEmpDetailsByGender("male");
		allEmpDetails.forEach(System.out::println);

	}
}
