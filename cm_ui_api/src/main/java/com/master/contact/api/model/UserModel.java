package com.master.contact.api.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel {
	
	Long id;
	String refId;
	String pswd;
	String email;
	String userRole;
	String cntctNumber;
	String isActive;
	String address;
	String crtBy;
	Date crtTs;
	String updBy;
	Date updTc;
	
	

}
