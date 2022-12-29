package com.te.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.school.dto.SchoolDto;
import com.te.school.entity.School;
import com.te.school.response.Response;
import com.te.school.services.Services;

@RestController
@RequestMapping("/school")
public class Controller {

	@Autowired
	private Services service;

	@PostMapping("/add")
	public ResponseEntity<Response> addSchool(@RequestBody SchoolDto schoolDto) {
		School school = service.addSchool(schoolDto);
		return new ResponseEntity<Response>(new Response(false, "Added School Succesfully", school), HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Response> getSchool(@PathVariable String id) {
		School school = service.getSchool(id);
		return new ResponseEntity<Response>(new Response(false, "Featching School Succesfully", school), HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<Response> getAllSchool() {
		List<School> school = service.getAllSchool();
		return new ResponseEntity<Response>(new Response(false, "Featching All School Details Succesfully", school),
				HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Response> deleteSchool(@PathVariable String id) {
		service.deleteSchool(id);
		return new ResponseEntity<Response>(new Response(false, "Deleting School Succesfully", null), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Response> updateSchool(@RequestBody SchoolDto schoolDto) {
		School school = service.updateSchool(schoolDto);
		return new ResponseEntity<Response>(new Response(false, "Update School Succesfully", school), HttpStatus.OK);
	}
}
