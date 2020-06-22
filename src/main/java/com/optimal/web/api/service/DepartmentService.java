package com.optimal.web.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimal.web.api.model.Department;
import com.optimal.web.api.repository.DepartmentRepository;

@Service
public class DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
}
