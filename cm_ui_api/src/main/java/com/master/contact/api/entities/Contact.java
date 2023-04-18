package com.master.contact.api.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CONTACT")
@NoArgsConstructor
@Setter
@Getter
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTACT_GEN")
	@SequenceGenerator(name = "SEQ_CONTACT_GEN", sequenceName = "SEQ_CONTACT", allocationSize = 1)
	@Column(name = "ID")
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name = "USR_ID")
	private User userId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "PHONE_NO")
	private String phoneNo;
	
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ADDRESS")
	private	String address;
	
	@Column(name = "IMAGES")
	private String image;
	
	
	@Column(name = "DESCR")
	private	String descr;
	
	
	@Column(name = "CRT_TS")
	private Date crtTc;
	
	
	@Column(name = "CRT_BY")
	private String crtTs;
	
	
	@Column(name = "UPD_TS")
	private Date upsTc;
	
	@Column(name = "UPD_BY")
	private String updBy;
	
	@Column(name = "DEL_TS")
	private Date detTs;
	
	@Column(name = "DEL_BY")
	private String delBy;
	

}
