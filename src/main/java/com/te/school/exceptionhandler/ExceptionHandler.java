package com.te.school.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.school.customexception.CustomException;
import com.te.school.response.Response;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(CustomException.class)
	public ResponseEntity<Response> customExceptionHandler(CustomException exceptio) {
		return new ResponseEntity<Response>(new Response(true, exceptio.getMessage(), null), HttpStatus.BAD_REQUEST);
	}

}
