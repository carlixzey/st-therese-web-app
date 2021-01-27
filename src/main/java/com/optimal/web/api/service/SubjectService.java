package com.optimal.web.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimal.web.api.model.Subject;
import com.optimal.web.api.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	public Subject saveSubject(Subject subject) {
		return subjectRepository.save(subject);
	}
	
	public List<Subject> getAllSubjects(){
		return subjectRepository.findAll();
	}
	
	public Optional<Subject> getSubjectById(long id) {
		return subjectRepository.findById(id);
	}
	
	public Subject findSubjectById(long id) {
		return subjectRepository.findSubjectById(id);
	}
}
