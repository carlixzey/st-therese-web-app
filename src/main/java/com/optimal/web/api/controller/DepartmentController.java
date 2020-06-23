package com.optimal.web.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optimal.web.api.model.Course;
import com.optimal.web.api.model.Department;
import com.optimal.web.api.service.DepartmentService;

@RestController
@RequestMapping("/department-api/v1")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	@PutMapping("/save")
	public Department updateDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/department/{id}")
	public Optional<Department> getDepartmentById(@PathVariable long id){
		return departmentService.getDepartmentById(id);
	}
	
	@GetMapping("/department/{id}/courses")
	public List<Course> getAllCourseByDepartmentId(@PathVariable long id){
		return departmentService.getAllCourseByDepartmentId(id);
	}
	
	
	
}
