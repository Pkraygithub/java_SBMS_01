package com.data.jpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data.jpa.entity.Employees;
import com.data.jpa.repositery.EmployeesRepositery;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeesRepositery repo = context.getBean(EmployeesRepositery.class);

		// findById
		Optional<Employees> byId = repo.findById(4);
		if (byId.isPresent()) {

			System.out.println(byId.get());
		}

		Employees emp = new Employees();
		
		emp.setEid(5);
		emp.setEname("Deepak Kumar");
		emp.setEsalary(82533.90);
		emp.setEgender("Male");
		emp.seteCountery("China");

		// Save Entity Class Only
		// repo.save(emp);

		Employees emp1 = new Employees();
		
		emp1.setEid(6);
		emp1.setEname("Geeta Kumar");
		emp1.setEsalary(82533.90);
		emp1.setEgender("Female");
		emp1.seteCountery("Nepal");

		Employees emp2 = new Employees();
		
		emp2.setEid(7);
		emp2.setEname("Ragha Kumar");
		emp2.setEsalary(82533.90);
		emp2.setEgender("Male");
		emp2.seteCountery("Goa");

		Employees emp3 = new Employees();
		
		emp3.setEid(8);
		emp3.setEname("Deepa Kumar");
		emp3.setEsalary(82533.90);
		emp3.setEgender("Male");
		emp3.seteCountery("Canada");

		List<Employees> list = Arrays.asList(emp, emp1, emp2, emp3);

		// Save Collection of Entity Class
		// repo.saveAll(list);
		
		
			List<Employees> byEmpSalaryGreaterThan = repo.findByEmpSalaryGreaterThan(4000.0);
			System.out.println(byEmpSalaryGreaterThan);
			byEmpSalaryGreaterThan.forEach(System.out::println);
		

		System.out.println("*********************Data Inserted**************");
	}

}
