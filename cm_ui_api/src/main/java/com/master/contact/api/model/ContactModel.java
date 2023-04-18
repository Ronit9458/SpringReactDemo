package com.master.contact.api.model;

import java.util.Date;
import java.util.Set;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContactModel {
	
	private int id;
	private UserModel user;
	private String name;
	private String homeNo;
	private String email;
	private String address;
	private String image;
	private String descr;
	private Date crtTs;
	private String crtBy;
	private Date updTs;
	private String updBy;
	private	Date delTs;
	private String delBy;

}
