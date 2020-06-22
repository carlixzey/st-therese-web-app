package com.optimal.web.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.optimal.web.api.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class Student  implements Serializable{
	
	private static final long serialVersionUID = -1838858651249224771L;
	
	@Id
	@Column(name = "student_id_pk", updatable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@Column(name="middle_name")
	private String middleName;
	
//	@ManyToOne
//	@JoinColumn(name="department_id_fk")
//	private Department department;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(nullable=false)
	private Gender gender;
	
	@ManyToOne
	@JoinColumn(name="course_id_fk")
	private Course course;
}
