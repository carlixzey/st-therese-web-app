package com.optimal.web.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.optimal.web.api.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findAllStudentsByFirstName(String firstName);
	
	public List<Student> findAllFemaleStudents();
	
	public List<Student> findAllMaleStudents();
}
