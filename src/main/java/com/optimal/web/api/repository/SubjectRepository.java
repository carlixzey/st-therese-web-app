package com.optimal.web.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.optimal.web.api.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

	public Subject findSubjectById(long id);
}
