package com.master.contact.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.master.contact.api.model.APIResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponse> resourceNotFoundExceptionHanlder(ResourceNotFoundException ex)
	{
	String message=ex.getMessage();	
	APIResponse aPIResponse = new APIResponse(message,false);
	return new ResponseEntity<APIResponse>(aPIResponse,HttpStatus.NOT_FOUND);
	}
}
