package com.master.contact.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.contact.api.model.UserModel;
import com.master.contact.api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<UserModel> createUser(@RequestBody UserModel model)
	{
		UserModel userModel = this.userService.createUser(model);
		ResponseEntity<UserModel> response = new ResponseEntity<>(userModel,HttpStatus.CREATED);
		return response;
		
	}

}
