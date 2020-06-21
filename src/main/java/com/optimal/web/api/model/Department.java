package com.optimal.web.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department")
public class Department {

	@Id
	@Column(name="department_id_pk")
	private long id;
	
	@Column(name="department_name")
	private String name;
}
