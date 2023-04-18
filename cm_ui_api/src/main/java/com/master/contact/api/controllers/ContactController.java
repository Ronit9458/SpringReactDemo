package com.master.contact.api.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.master.contact.api.model.APIResponse;
import com.master.contact.api.model.ContactModel;
import com.master.contact.api.services.ContactService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/list")
	public ResponseEntity<List<ContactModel>> getUser()
	{
		
		return ResponseEntity.ok(this.contactService.getAllList());
		
	}
	
	@GetMapping("/listById")
	public ResponseEntity<ContactModel> getSingleUser(@RequestParam(required = false) Integer id)
	{
		
		return ResponseEntity.ok(this.contactService.getListById(id));
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<ContactModel> createUser(@Valid @RequestBody ContactModel model)
	{
		ContactModel userModel = this.contactService.createUser(model);
		ResponseEntity<ContactModel> response = new ResponseEntity<>(userModel,HttpStatus.CREATED);
		return response;
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ContactModel> updateUser(@Valid @RequestBody ContactModel model,@PathVariable Integer id)
	{
		ContactModel userModel = this.contactService.updateUser(model, id);
		
		return ResponseEntity.ok(userModel);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<APIResponse> deleteUser(@PathVariable Integer id)
	{
		this.contactService.deleteById(id);
		return  new ResponseEntity<APIResponse>(new APIResponse("User deleted successfully",true),HttpStatus.OK);
		
	}


}
