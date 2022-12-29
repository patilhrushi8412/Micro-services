package com.te.school.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.te.school.entity.School;

@Repository
public interface SchoolRepo extends MongoRepository<School, String>{

	Optional<School> findBySchoolId(String schoolId);

}
