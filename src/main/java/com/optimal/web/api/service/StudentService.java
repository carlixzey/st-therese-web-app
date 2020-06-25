package com.optimal.web.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimal.web.api.model.Student;
import com.optimal.web.api.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllStudents() {
		return studentRepository.getALlStudents();
	}

	public List<Student> getAllStudentsByFirstName(String firstName) {
		return studentRepository.findAllStudentsByFirstName(firstName);
	}

	public Optional<Student> getStudentById(long id) {
		return studentRepository.findById(id);
	}

	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	//public List<Student> getAllStudent

//	public List<Student> getAllFemaleStudents() {
//		return studentRepository.findAllFemaleStudents();
//	}
//	
//	public List<Student> getAllMaleStudents(){
//		return studentRepository.findAllMaleStudents();
//	}
}
