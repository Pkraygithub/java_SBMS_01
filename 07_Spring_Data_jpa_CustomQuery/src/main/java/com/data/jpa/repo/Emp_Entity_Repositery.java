package com.data.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.data.jpa.entity.Emp_Entity;

public interface Emp_Entity_Repositery extends CrudRepository<Emp_Entity, Integer>{
	
	
	@Query(value="Select * from emp_entity",nativeQuery = true) //SQL
	public List<Emp_Entity> getEmpsSql();
	
	
	@Query("from Emp_Entity") // HQL
	public List<Emp_Entity> getAllEmpDetails();
	
	
	@Query("from Emp_Entity  WHERE egender=:gender")  // HQL
	public List<Emp_Entity> getAllEmpDetailsByGender(String gender);

}
