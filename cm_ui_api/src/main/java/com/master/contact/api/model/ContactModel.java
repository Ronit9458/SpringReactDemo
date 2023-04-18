package com.master.contact.api.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ContactModel {
	
	Long id;
	Long userId;
	String name;
	String homeNo;
	String email;
	String address;
	String image;
	String descr;
	Date crtTs;
	String crtBy;
	Date updTs;
	String updBy;
	Date delTs;
	String delBy;

}
