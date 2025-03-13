package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.entity.Student;
import com.spring.repositery.StudentRepositery;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepositery repo;
	
	private EmailService emailService;

	

	public StudentServiceImpl(StudentRepositery repo, EmailService emailService) {
		this.repo = repo;
		this.emailService = emailService;
	}

	@Override
	public boolean saveStudent(Student s) {

		Student saveStudent = repo.save(s);
		
		String subject="Student Registration";
		String body="<h1>Your Acounts created to Learn Spring Mvc</h1><br> <h2>Welcome to Learn the Spring MVC</h2>";
		
		emailService.sendEmail1(subject, body, s.getEmail());
		return saveStudent.getSid() != null;
	}

	@Override
	public List<Student> getAllStudnetDetails() {
		return repo.findAll();
	}

	@Override
	public Student getStudnetById(Integer stuid) {
		
		Optional<Student> byId = repo.findById(stuid);

		if (byId.isPresent()) {

			Student student = byId.get();
			return student;
		}else {
			
		}
		return null;
	}

	@Override
	public void deleteById(Integer stuid) {
	
		 repo.deleteById(stuid);
	}

	@Override
	public Student updateStudnetDetails(Integer stuid, Student ustuId) {
		// TODO Auto-generated method stub
		return null;
	}

}
