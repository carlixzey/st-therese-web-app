package com.optimal.web.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.optimal.web.api.dtos.responses.StudentResponseDTO;
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
	public Page<StudentResponseDTO> getAllStudents(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "page_size", defaultValue = "8") int pageSize, HttpServletRequest request,
			HttpServletResponse response) {

		return studentService.getAllStudents(page, pageSize);
	}

	@GetMapping("/student/{id}")
	public StudentResponseDTO getStudentById(@PathVariable long id) {
		return studentService.getStudentById(id);
	}

	@GetMapping("/student?firstName")
	public Page<StudentResponseDTO> getStudentByFirstName(@RequestParam(value="firstName") String firstName,
			@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "page_size", defaultValue = "8") int pageSize) {
		return studentService.getAllStudentsByFirstName(firstName,page,pageSize);
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
