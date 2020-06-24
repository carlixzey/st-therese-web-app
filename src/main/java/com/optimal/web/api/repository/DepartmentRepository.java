package com.optimal.web.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.optimal.web.api.model.Course;
import com.optimal.web.api.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

//	@Query("FROM Course WHERE department.id = ?1 ORDER BY name ASC")
//	public List<Course> getAllCourseByDepartmentId(long id);
}
