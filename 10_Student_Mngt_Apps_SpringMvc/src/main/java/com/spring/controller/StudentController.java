package com.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.Student;
import com.spring.service.StudentServiceImpl;

@Controller
public class StudentController {

	private StudentServiceImpl service;

	public StudentController(StudentServiceImpl service) {
		this.service = service;
	}

	// method to display Empty Form
	
	
	@GetMapping("/student")
	public String loadModeForm(Model model) {
		
		return "index";
	}

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mev = new ModelAndView();
		mev.setViewName("index");
		return mev;
	}

	// method to save Student Form
	@GetMapping("/saveStudent")
	public ModelAndView saveStudnetDetails(Student s) {

		ModelAndView mev = new ModelAndView();
		boolean isSaveStudent = service.saveStudent(s);

		if (isSaveStudent) {
			mev.addObject("smsg", "Sudent Details Saved Sucessfully");
		} else {
			mev.addObject("esmsg", "failed to Save Studnet Details");
		}
		mev.setViewName("index");
		return mev;
	}

	// method to get All student data
	@GetMapping("/getData")
	public ModelAndView getAllStudent() {

		List<Student> allList = service.getAllStudnetDetails();

		ModelAndView mev = new ModelAndView();
		mev.addObject("allstudnt", allList);
		mev.setViewName("studentData");
		return mev;

	}
	@GetMapping("/delete")
	public ModelAndView deleteRecords(@RequestParam ("stuid") Integer stuid) {
		service.deleteById(stuid);
		
		List<Student> allList = service.getAllStudnetDetails();
		
		Student stu =new Student();

		ModelAndView mev = new ModelAndView();
		mev.addObject("allstudnt", allList);
		mev.addObject("delmsg", "Records is Deleted Successfully"+stu.getSid());
		mev.setViewName("studentData");
		return mev;
		
		
	}
	
	

}
