package com.spring.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Student;

public interface StudentRepositery extends JpaRepository<Student, Integer>{
	
	

}
