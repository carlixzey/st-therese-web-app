package com.optimal.web.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.optimal.web.api.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
