package com.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data.jpa.service.Emp_Entity_Service;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		Emp_Entity_Service bean = run.getBean(Emp_Entity_Service.class);
		//bean.saveEmpEntityDetails();
		//bean.getAllEmpDetails();
		//bean.getAllEmpByGender();
		
		bean.getAllEmpSql();
	}

}
