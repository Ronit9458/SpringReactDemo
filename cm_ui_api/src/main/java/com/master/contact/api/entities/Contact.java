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
import lombok.Setter;

@Entity
@Table(name = "CONTACT")
@Setter
@Getter
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTACT_GEN")
	@SequenceGenerator(name = "SEQ_CONTACT_GEN", sequenceName = "SEQ_CONTACT", allocationSize = 1)
	@Column(name = "ID")
	Long id;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USR_ID")
	Long userId;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "PHONE_NO")
	String phoneNo;
	
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "ADDRESS")
	String address;
	
	@Column(name = "IMAGES")
	String image;
	
	
	@Column(name = "DESCR")
	String descr;
	
	
	@Column(name = "CRT_TS")
	Date crtTc;
	
	
	@Column(name = "CRT_BY")
	String crtTs;
	
	
	@Column(name = "UPD_TS")
	Date upsTc;
	
	@Column(name = "UPD_BY")
	String updBy;
	
	@Column(name = "DEL_TS")
	Date detTs;
	
	@Column(name = "DEL_BY")
	String delBy;
	

}
