package com.master.contact.api.controllers;

import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.master.contact.api.model.APIResponse;
import com.master.contact.api.model.UserModel;
import com.master.contact.api.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public ResponseEntity<List<UserModel>> getUser()
	{
		
		return ResponseEntity.ok(this.userService.getAllList());
		
	}
	
	@GetMapping("/listById")
	public ResponseEntity<UserModel> getSingleUser(@RequestParam(required = false) Integer id)
	{
		
		return ResponseEntity.ok(this.userService.getListById(id));
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<UserModel> createUser(@Valid @RequestBody UserModel model)
	{
		UserModel userModel = this.userService.createUser(model);
		ResponseEntity<UserModel> response = new ResponseEntity<>(userModel,HttpStatus.CREATED);
		return response;
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<UserModel> updateUser(@Valid @RequestBody UserModel model,@PathVariable Integer id)
	{
		UserModel userModel = this.userService.updateUser(model, id);
		
		return ResponseEntity.ok(userModel);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<APIResponse> deleteUser(@PathVariable Integer id)
	{
		this.userService.deleteById(id);
		return  new ResponseEntity<APIResponse>(new APIResponse("User deleted successfully",true),HttpStatus.OK);
		
	}

}
