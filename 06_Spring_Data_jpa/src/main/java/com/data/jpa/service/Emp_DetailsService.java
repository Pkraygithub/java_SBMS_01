package com.data.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.jpa.entity.Emp_Details;
import com.data.jpa.repo.Emp_DetailsRepositery;

@Service
public class Emp_DetailsService {

	private Emp_DetailsRepositery repo;

	public Emp_DetailsService(Emp_DetailsRepositery repo) {

		this.repo = repo;
	}

	public void saveEmpDetails() {

		Emp_Details emp = new Emp_Details();

		emp.setEid(4);
		emp.setEname("Sarita Kumari");
		emp.setEsalary(40098.0);
		emp.setEgender("female");
		emp.seteCountery("USA");
		repo.save(emp);

		System.out.println("************Record Inserted**************");

	}

	public void getAllEmps() {

		Iterable<Emp_Details> allemp = repo.findAll();

		// allemp.forEach(e-> {System.out.println(e);});
		allemp.forEach(System.out::println);

	}

	public void getEmpDetailsByCountery() {

		List<Emp_Details> byeCountery = repo.findByECountery("India");
		byeCountery.forEach(System.out::println);
	}

	public void getEmpDetailsByGender() {

		List<Emp_Details> byeGender = repo.findByEgender("female");
		byeGender.forEach(System.out::println);
	}
	
	
	public void getByEgenderAndECounter() {
		List<Emp_Details> byEgenderAndECounter = repo.findByEgenderAndECountery("male","India");
		byEgenderAndECounter.forEach(System.out::println);

	}
	
	
	public void getByEsalaryGreateThan() {
		List<Emp_Details> byEsalary= repo.findByEsalaryGreaterThanEqual(40098.0);
		byEsalary.forEach(System.out::println);

	}
}
