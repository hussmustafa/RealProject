package com.example.CarRental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "carrental")

public class userModel {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int UserId;
	
	@Column(name="UserName")
	private String UserName;
	
	@Column(name = "UserEmeil")
	private String UserEmeil;
	
	
   
	
	
	
 
}
