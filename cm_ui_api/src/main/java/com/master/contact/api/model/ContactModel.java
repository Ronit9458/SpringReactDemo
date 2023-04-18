package com.master.contact.api.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ContactModel {
	
	private int id;
	private int userId;
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
