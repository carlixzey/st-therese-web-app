package com.optimal.web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
