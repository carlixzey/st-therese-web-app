package com.optimal.web.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimal.web.api.model.Course;
import com.optimal.web.api.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course saveCourse(Course course){
		return courseRepository.save(course);
	}
	
	public List<Course> getAllCourse(){
		return courseRepository.findAll();
	}
	
	public Optional<Course> getCourseById(long id){
		return courseRepository.findById(id);
	}
	
}
