package com.te.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDto {

	private String schoolId;
	private String schoolName;
	private String schoolAddress;
	private String universityName;
}
