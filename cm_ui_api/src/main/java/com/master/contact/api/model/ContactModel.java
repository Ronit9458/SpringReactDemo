package com.master.contact.api.model;

import java.util.Date;

import com.master.contact.api.entities.User;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class ContactModel {
	
	private int id;
	private UserModel userId;
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
