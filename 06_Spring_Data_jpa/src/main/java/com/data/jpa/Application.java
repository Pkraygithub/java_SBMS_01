package com.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data.jpa.service.Emp_DetailsService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
			Emp_DetailsService bean = run.getBean(Emp_DetailsService.class);
			//bean.saveEmpDetails();
			//bean.getAllEmps();
			//bean.getEmpDetailsByCountery();
			//bean.getEmpDetailsByGender();
		//	bean.getByEgenderAndECounter();
			bean.getByEsalaryGreateThan();
		
	
	}

}
