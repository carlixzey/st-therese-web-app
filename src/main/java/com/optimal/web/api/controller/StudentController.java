package com.optimal.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optimal.web.api.model.Student;
import com.optimal.web.api.service.StudentService;

@RestController
@RequestMapping("/student-api/v1")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String isUp() {
		System.out.println("Hello");
		return "isOk";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return  studentService.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable long id) {
		return studentService.getStudentById(id).orElse(null);
	}
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/save")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentService.deleteStudent(id);
	}
}
