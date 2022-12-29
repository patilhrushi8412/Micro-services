package com.te.school.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.school.response.FeignResponse;
import com.te.school.response.Response;

@FeignClient(name = "STUDENT-SERVICE", url = "http://localhost:8686/student")
public interface StudentFeign {

	@GetMapping("/getAllBySchoolId")
	public ResponseEntity<FeignResponse> getAllBySchoolId(@RequestParam String schoolId);
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Response> getSchool(@PathVariable String id);
}
