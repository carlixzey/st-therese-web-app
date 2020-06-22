package com.optimal.web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
}
