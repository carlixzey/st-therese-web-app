package com.optimal.web.api.dtos;

import java.io.Serializable;

import com.optimal.web.api.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements Serializable{

	private static final long serialVersionUID = -7142963599843485303L;
	
	private long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private Gender gender;
	//private Date createdDate;
}
