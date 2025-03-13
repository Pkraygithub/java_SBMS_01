package com.data.jpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.data.jpa.entity.Emp_Details;

public interface Emp_DetailsRepositery extends CrudRepository<Emp_Details, Integer>{
	

	//select * from Emp_Details where emp_counter='india';	
	public List<Emp_Details> findByECountery(String countery);
	
	//select * from Emp_Details where emp_gender='male';
	public List<Emp_Details> findByEgender(String gender);
	
	//select * from Emp_Details where egender='male' and e_Countery='india';
	public List<Emp_Details> findByEgenderAndECountery(String gender,String countery);
	
	
	//select * from Emp_Details where eSalary>=4000;
	public List<Emp_Details> findByEsalaryGreaterThanEqual(Double salary);

	
	

	


}
