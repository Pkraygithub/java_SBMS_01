package com.spring.service;

import java.util.List;

import com.spring.entity.Student;

public interface StudentService {

	public boolean saveStudent(Student s);

	public List<Student> getAllStudnetDetails();

	public Student getStudnetById(Integer stuid);

	public void deleteById(Integer stuid);

	public Student updateStudnetDetails(Integer stuid, Student ustuId);

}
