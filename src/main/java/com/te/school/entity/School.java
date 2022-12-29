package com.te.school.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Document(collection = "school")
@Data
@JsonInclude(value = Include.NON_NULL)
public class School {

	@Id
	private String schoolId;
	private String schoolName;
	private String schoolAddress;
	private String universityName;
	
	@Transient
	private Object students;
}
