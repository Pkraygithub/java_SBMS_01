package com.data.jpa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.data.jpa.entity.EmpData;
import com.data.jpa.repo.EmpDataRepositery;

@Service
public class EmpDataService {

	private static final int pageSize = 2;

	private EmpDataRepositery repo;

	public EmpDataService(EmpDataRepositery repo) {
		super();
		this.repo = repo;
	}

	public void saveEmpData() {
		EmpData emp = new EmpData();

		emp.setEid(6);
		emp.setEname("Kankaj Kumar");
		emp.setEsalary(74332.90);
		emp.setEgender("male");
		emp.seteCountery("USA");
		repo.save(emp);

		System.out.println("🥰🥰🥰😎 Data Inserted Successfully 💼💼💼");
	}

	public void getAllEmp(int pageNum) {

		PageRequest page = PageRequest.of(pageNum - 1, pageSize);

		// List<EmpData> empall = repo.findAll(Sort.by("esalary").ascending());
		
		Page<EmpData> emps = repo.findAll(page);
		emps.forEach(System.out::println);

	}

}
