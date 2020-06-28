package com.optimal.web.api.dtos.responses;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.optimal.web.api.enums.Gender;

import lombok.Data;

@Data
public class StudentResponseDTO{

	@JsonProperty(value="id")
	private  long id;

	@JsonProperty(value="firstName")
	private  String firstName;

	@JsonProperty(value="lastName")
	private  String lastName;

	@JsonProperty(value="middleName")
	private  String middleName;

	@JsonProperty(value="gender")
	private Gender gender;

	@JsonProperty(value="createdDate")
	private LocalDateTime createdDate;

	@JsonProperty(value="updatedAt")
	private LocalDate updatedAt;
}