package com.optimal.web.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

	public Page<StudentResponseDTO> getAllStudents(int page, int pageSize) {
		Pageable pageable = PageRequest.of(page-1, pageSize);
		Page<Student> students = studentRepository.findAll(pageable);
		List<StudentResponseDTO> studentResponseDTO = students.getContent().stream().map(converterService::convertToDTO)
				.collect(Collectors.toList());
		return new PageImpl<StudentResponseDTO>(studentResponseDTO, pageable, students.getTotalPages());
	}

	public StudentResponseDTO getStudentById(long id) {
		Student student = studentRepository.getOne(id);
		return this.converterService.convertToDTO(student);
	}

	public List<Student> getAllStudentsByFirstName(String firstName, Pageable pageable) {
		return studentRepository.findAllStudentsByFirstName(firstName, pageable);
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
