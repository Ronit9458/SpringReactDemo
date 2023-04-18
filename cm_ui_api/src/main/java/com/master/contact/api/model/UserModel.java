package com.master.contact.api.model;

import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	
	private int id;
	private String refId;
	private String name;
	private String pswd;
	private String email;
	private String userRole;
	private String cntctNumber;
	private String isActive;
	private String address;
	private String crtBy;
	private Date crtTs;
	private String updBy;
	private Date updTs;
	private Set<ContactModel> contact;
	
	

}
