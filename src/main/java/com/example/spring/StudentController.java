package com.example.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	private IStudentRepository stu;
	
	@GetMapping("/getstudent")
	public List <Student> getAllStudentCrud(){
		  
				List<Student> StudentList =stu.findAll();
		return StudentList;
	}
	
	
}
