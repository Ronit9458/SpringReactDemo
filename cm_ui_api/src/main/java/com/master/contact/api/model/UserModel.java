package com.master.contact.api.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserModel {
	
	private int id;
	private String refId;
	private String pswd;
	private String email;
	private String userRole;
	private String cntctNumber;
	private String isActive;
	private String address;
	private String crtBy;
	private Date crtTs;
	private String updBy;
	private Date updTc;
	private Set<ContactModel> contact;
	
	

}
