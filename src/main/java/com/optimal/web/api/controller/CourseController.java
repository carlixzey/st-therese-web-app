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

import com.optimal.web.api.model.Course;
import com.optimal.web.api.service.CourseService;

@RestController
@RequestMapping("/course-api/v1")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/save")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	@PutMapping("/save")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return courseService.getAllCourse();
	}
	
	@GetMapping("/course/{id}")
	public Optional<Course> getCourseById(@PathVariable long id) {
		return courseService.getCourseById(id);
	}
	
}
