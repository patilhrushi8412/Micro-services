package com.te.school.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.te.school.controller.StudentFeign;
import com.te.school.customexception.CustomException;
import com.te.school.dto.SchoolDto;
import com.te.school.entity.School;
import com.te.school.repo.SchoolRepo;
import com.te.school.response.FeignResponse;

@Service
public class ServiceImpl implements Services {

	@Autowired
	private SchoolRepo repo;

	@Autowired
	private StudentFeign feign;

	@Override
	public School addSchool(SchoolDto schoolDto) {
		try {
			Optional<School> school = repo.findBySchoolId(schoolDto.getSchoolId());
			if (school.isPresent()) {
				throw new CustomException("School Id is Allready Present");
			} else {
				School sch = new School();
				BeanUtils.copyProperties(schoolDto, sch);
				School save = repo.save(sch);
				return save;
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public School getSchool(String id) {
		try {
			Optional<School> school = repo.findBySchoolId(id);
			if (!school.isPresent()) {
				throw new CustomException("School Is Not Present");
			} else {
				ResponseEntity<FeignResponse> allBySchoolId = feign.getAllBySchoolId(school.get().getSchoolId());
				school.get().setStudents(allBySchoolId.getBody().getData());
				return school.get();
			}
		} catch (Exception e) { 
			throw e;
		}
	}

	@Override
	public List<School> getAllSchool() {
		try {
			List<School> schoolList = repo.findAll();
			if (schoolList.isEmpty()) {
				throw new CustomException("No Any School Is Present At The Moment");
			} else {
				return schoolList;
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void deleteSchool(String id) {
		try {
			Optional<School> school = repo.findBySchoolId(id);
			if (!school.isPresent()) {
				throw new CustomException("School Is Not Present");
			} else {
				repo.delete(school.get());
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public School updateSchool(SchoolDto schoolDto) {
		try {
			Optional<School> school = repo.findBySchoolId(schoolDto.getSchoolId());
			if (!school.isPresent()) {
				throw new CustomException("School Is Not Present");
			} else {
				BeanUtils.copyProperties(schoolDto, school.get());
				School save = repo.save(school.get());
				return save;
			}
		} catch (Exception e) {
			throw e;
		}
	}

}
