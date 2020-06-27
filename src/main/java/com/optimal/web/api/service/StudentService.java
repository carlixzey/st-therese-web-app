package com.optimal.web.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimal.web.api.dtos.responses.StudentResponseDTO;
import com.optimal.web.api.model.Student;
import com.optimal.web.api.repository.StudentRepository;
import com.optimal.web.api.service.converter.ConverterService;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ConverterService converterService;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<StudentResponseDTO> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students.stream().map(converterService::convertToDTO).collect(Collectors.toList());
	}

	public StudentResponseDTO getStudentById(long id) {
		Student student = studentRepository.getOne(id);
		return this.converterService.convertToDTO(student);
	}

	public List<Student> getAllStudentsByFirstName(String firstName) {
		return studentRepository.findAllStudentsByFirstName(firstName);
	}

	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);	
	}

//	public Optional<StudentResponseDTO> getStudentDTOById(long id){
//		return studentRepository.getStudentDTOById(id);
//	}
}
