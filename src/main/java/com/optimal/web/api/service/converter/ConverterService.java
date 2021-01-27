package com.optimal.web.api.service.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.optimal.web.api.dtos.responses.StudentResponseDTO;
import com.optimal.web.api.model.Student;

@Component
public class ConverterService {

	@Autowired
	private ModelMapper modelMapper;
	
	public StudentResponseDTO convertToDTO(Student student) {
		return modelMapper.map(student, StudentResponseDTO.class);
	}
	
	public Student convertToEntity(StudentResponseDTO studentDTO) {
		return modelMapper.map(studentDTO, Student.class);
	}
	
}
