package com.optimal.web.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="course")
public class Course implements Serializable {
	 
	private static final long serialVersionUID = 8602347236799170909L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="course_id_pk")
	private long id;
	
	@Column(name="course_name", nullable = false)
	private String name;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="department_id_fk")
	private Department department;
	
	@JsonIgnore
	@OneToMany(mappedBy="course")
	private List<Student> students;
}
