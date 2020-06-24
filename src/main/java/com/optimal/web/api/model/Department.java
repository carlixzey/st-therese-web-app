package com.optimal.web.api.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	
	@Column(name="department_name", nullable = false)
	private String name;


//	
//	@JsonManagedReference
//	@OneToMany(mappedBy="department")
//	private List<Student> students;
//	
//	@JsonBackReference
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,  mappedBy="department")
//	private Set<Course> courses;
	
}
