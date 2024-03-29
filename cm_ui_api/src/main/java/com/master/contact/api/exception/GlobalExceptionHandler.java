package com.master.contact.api.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

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
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex)
	{
		Map<String, String> resp=new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error)-> {
		String field = ((FieldError)error).getField();	
		String message = error.getDefaultMessage();
		resp.put(field, message);
		});
		
		return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<APIResponse> handleException(DataIntegrityViolationException ex, WebRequest request) {
	  
	    
	    String message = ex.getMostSpecificCause().getMessage();

	    if (message != null) {
	        message = message.split("for")[0];
	    } 
	    APIResponse aPIResponse = new APIResponse(message,false);

	    return new ResponseEntity<>(aPIResponse, HttpStatus.BAD_REQUEST);
	}
	
//	@ExceptionHandler(value = Exception.class)
//	public ResponseEntity<?> handleException(Exception e) {
//	    UserResponse response = null;
//
//	    if(e instanceof DataIntegrityViolationException){
//	        DataIntegrityViolationException ex = (DataIntegrityViolationException) e;
//	        response = new UserResponse(ErrorCodes.DuplicateMobNo, "This mobile no is already Registered!");
//	        return new ResponseEntity<UserResponse>(response, HttpStatus.CONFLICT);
//	    }
}

