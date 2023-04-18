package com.master.contact.api.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "USR")
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USR_GEN")
	@SequenceGenerator(name = "SEQ_USR_GEN", sequenceName = "SEQ_USR", allocationSize = 1)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "REF_ID")
	private String refId;
	
	@Column(name = "PSWD")
	private String pswd;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "USR_ROLE")
	private String userRole;
	
	@Column(name = "CNTCT_NUMBER")
	private	String cntctNumber;
	
	@Column(name = "IS_ACTIVE")
	private String isActive;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "CRT_BY")
	private String crtBy = "SYSTEM";
	
	@Column(name = "CRT_TS")
	private Date crtTs = new Date();
	
	@Column(name = "UPD_BY")
	private	String updBy;
	
	@Column(name = "UPD_TS")
	private	Date updTs = new Date();
	
	@OneToMany(cascade=CascadeType.ALL ,mappedBy = "userId")
	private Set<Contact> contact ;
	
	
	

}
