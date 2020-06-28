package com.optimal.web.api.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
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
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","subjects"})
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

	@Column(name="created_at", updatable= false)
	@JsonFormat(pattern="MM/dd/yyyy HH:mm:ss", timezone="Asia/Manila")
	private LocalDateTime createdDate;

	@Column(name="updated_at", updatable=true)
	@JsonFormat(pattern="MM/dd/yyyy", timezone="Asia/Manila")
	private LocalDate updatedAt;	
	
	@ManyToMany
	@JoinTable(name = "student_subject", 
	joinColumns = { @JoinColumn(name = "student_id") },
	inverseJoinColumns = {@JoinColumn(name = "subject_id") })
	private Set<Subject> subjects = new HashSet<>();

	
//	@OneToMany(mappedBy = "student")
//	private Set<StudentSubject> studentSubject = new HashSet<>();
	
	
//	@JsonManagedReference
//	@ManyToOne
//	@JoinColumn(name="course_id_fk")
//	private Course course;
	
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
		subject.getStudents().add(this);
	}
	
	public void removeSubject(Subject subject) {
		this.subjects.remove(subject);
		subject.getStudents().remove(this);
	}

	//@PrePersist

	//@PreUpdate

}
