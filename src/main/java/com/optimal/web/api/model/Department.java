package com.optimal.web.api.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="department")
public class Department implements Serializable{

	private static final long serialVersionUID = 8356472576879494971L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="department_id_pk")
	private long id;
	
	@Column(name="department_name")
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy="department")
	private Set<Course> courses;	
	
	@JsonIgnore
	@OneToMany(mappedBy="department")
	private List<Student> students;

}
