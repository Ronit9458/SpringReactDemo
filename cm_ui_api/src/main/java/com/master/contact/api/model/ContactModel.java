package com.master.contact.api.model;

import java.util.Date;
import java.util.Set;

import com.master.contact.api.entities.User;

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
	private String name;
	private String homeNo;
	private String email;
	private String address;
	private String image;
	private String descr;
	private String crtTs;
	private String crtBy;
	private String updTs;
	private String updBy;
	private	String delTs;
	private String delBy;
	//private User user;

}
