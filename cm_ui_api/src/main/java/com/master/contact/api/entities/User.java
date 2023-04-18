package com.master.contact.api.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "USR")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USR_GEN")
	@SequenceGenerator(name = "SEQ_USR_GEN", sequenceName = "SEQ_USR", allocationSize = 1)
	@Column(name = "ID")
	Long id;
	
	@Column(name = "REF_ID")
	String refId;
	
	@Column(name = "PSWD")
	String pswd;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "USR_ROLE")
	String userRole;
	
	@Column(name = "CNTCT_NUMBER")
	String cntctNumber;
	
	@Column(name = "IS_ACTIVE")
	String isActive;
	
	@Column(name = "ADDRESS")
	String address;
	
	@Column(name = "CRT_BY")
	String crtBy = "SYSTEM";
	
	@Column(name = "CRT_TS")
	Date crtTs = new Date();
	
	@Column(name = "UPD_BY")
	String updBy;
	
	@Column(name = "UPD_TS")
	Date updTs = new Date();
	
	
	

}
