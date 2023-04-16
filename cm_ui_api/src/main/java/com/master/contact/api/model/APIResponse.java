package com.master.contact.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor 
public class APIResponse {
	
	private String message;
	private boolean success;

}
