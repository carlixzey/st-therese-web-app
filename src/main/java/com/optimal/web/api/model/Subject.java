package com.optimal.web.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="subject")
public class Subject implements Serializable {

	private static final long serialVersionUID = 1363081994093134728L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subject_id_pk")
	private long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Manila")
	@Column(name="created_date", updatable=false)
	@CreationTimestamp
	private Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at", updatable = true)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Manila")
	@UpdateTimestamp
	private Date updatedAt;
	
	@ManyToMany(mappedBy="subjects", fetch = FetchType.LAZY)
	private Set<Student> students = new HashSet<>();

//	@OneToMany(mappedBy = "subject")
//	private Set<StudentSubject> studentSubject = new HashSet<>();

	public void addStudent(Student student) {
		this.students.add(student);
		student.getSubjects().add(this);
	}



}