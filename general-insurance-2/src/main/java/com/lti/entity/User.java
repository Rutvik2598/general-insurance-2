package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	
	private int userId;
	private String userName;
	private String email;
	private LocalDate dateOfBirth;
	private long phoneNo;
	private String password;
	
	private Address address;
	
}
