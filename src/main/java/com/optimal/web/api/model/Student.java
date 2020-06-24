package com.optimal.web.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.optimal.web.api.enums.Gender;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = -1838858651249224771L;

	@Id
	@Column(name = "student_id_pk", updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Column(name = "first_name")
	private String firstName;

	@NotNull
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "middle_name")
	private String middleName;

	@Enumerated(EnumType.ORDINAL)
	@NotNull
	private Gender gender;

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
	
	
	@ManyToMany
	@JoinTable(name = "student_subject", 
	joinColumns = { @JoinColumn(name = "student_id") },
	inverseJoinColumns = {@JoinColumn(name = "subject_id") })
	private Set<Subject> subjects = new HashSet<>();

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="course_id_fk")
	private Course course;
	
//	@JsonBackReference
//	@ManyToOne
//	@JoinColumn(name="department_id_fk")
//	private Department department;
}
