package com.optimal.web.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.optimal.web.api.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findAllStudentsByFirstName(String firstName);

	@Query(value=" SELECT s FROM Student s   WHERE 1=1 ")
	public List<Student> getALlStudents();
}
