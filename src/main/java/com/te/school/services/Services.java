package com.te.school.services;

import java.util.List;

import com.te.school.dto.SchoolDto;
import com.te.school.entity.School;

public interface Services {

	School addSchool(SchoolDto schoolDto);

	School getSchool(String id);

	List<School> getAllSchool();

	void deleteSchool(String id);

	School updateSchool(SchoolDto schoolDto);

}
