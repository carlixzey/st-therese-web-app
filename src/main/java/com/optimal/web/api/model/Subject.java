package com.optimal.web.api.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="subject")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","students"})
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

//	@Temporal(TemporalType.TIMESTAMP)
//	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Manila")
//	@Column(name="created_date", updatable=false)
//	@CreationTimestamp
//	private Date createdDate;

//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="updated_at", updatable = true)
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Manila")
//	@UpdateTimestamp
//	private Date updatedAt;

	@Column(name="created_at", updatable=false)
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Manila")
	private LocalDate createdDate;

	@Column(name="updated_at", updatable=true)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Manila")
	private LocalDateTime updatedAt;

	@ManyToMany(mappedBy="subjects")
	private Set<Student> students = new HashSet<>();

//	@OneToMany(mappedBy = "subject")
//	private Set<StudentSubject> studentSubject = new HashSet<>();

	public void addStudent(Student student) {
		this.students.add(student);
		student.getSubjects().add(this);
	}
}