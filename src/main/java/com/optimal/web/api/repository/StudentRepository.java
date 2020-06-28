package com.optimal.web.api.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.optimal.web.api.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//	public List<Student> findAllStudentGenderMale();
//	public List<Student> findAllStudentGenderFemale();

//	@Query(value="select NEW com.optimal.web.api.test.StudentProfileResult( s.id, s.firstName, s.lastName , s.middleName, s.gender)  FROM Student s ")
//	public List<StudentProfileResult> getAllStudents();
	
//	@Query(value="select NEW com.optimal.web.api.test.StudentProfileResult( s.id, s.firstName, s.lastName , s.middleName, s.gender)  FROM Student s WHERE s.id= :id ")
//	public Optional<StudentProfileResult> getStudentById(@Param("id")long id);
	
//	@Query(value="SELECT s.firstName, s.lastName, s.middleName, s.gender FROM Student s WHERE s.id = :id ")
//	public Optional<StudentResponseDTO> getStudentDTOById(@Param("id")long id);
		
//	@Query(value="select s from Student s ")
//	List<Student> findAllStudents();

	public List<Student> findAllStudentsByFirstName(String firstName, Pageable pageable);
	
	public Page<Student> findAll(Pageable pageable);
	
}
