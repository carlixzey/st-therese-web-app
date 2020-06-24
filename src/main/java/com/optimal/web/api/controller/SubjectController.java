package com.optimal.web.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optimal.web.api.model.Subject;
import com.optimal.web.api.service.SubjectService;

@RestController
@RequestMapping("/subject-api/v1")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@GetMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
	}
	
	@PostMapping("/save")
	public Subject saveSubject(@RequestBody Subject subject) {
		return subjectService.saveSubject(subject);
	}
	
	@GetMapping("/subject/{id}")
	public Optional<Subject> getSubjectById(@PathVariable long id) {
		return subjectService.getSubjectById(id);
	}
	
	@PutMapping("/save")
	public Subject updateSubject(@RequestBody Subject subject) {
		return subjectService.saveSubject(subject);
	}

}
