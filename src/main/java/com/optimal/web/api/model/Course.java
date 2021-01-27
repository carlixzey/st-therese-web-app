package com.optimal.web.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name="created_date", updatable = false)
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Manila")
	private Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name="updated_at", updatable = true)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Manila")
	private Date updatedAt;
	
//	@JsonBackReference
//	@OneToMany(mappedBy="course")
//	private List<Student> students;
}
