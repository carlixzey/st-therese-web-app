package com.optimal.web.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimal.web.api.model.Course;
import com.optimal.web.api.model.Department;
import com.optimal.web.api.repository.DepartmentRepository;

@Service
public class DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public List<Department> getAllDepartments(){
		return departmentRepository.findAll();
	}
	
	public Optional<Department> getDepartmentById(long id) {
		return departmentRepository.findById(id);
	}
	
	public List<Course> getAllCourseByDepartmentId(long id){
		return departmentRepository.getAllCourseByDepartmentId(id);
	}
	
}
