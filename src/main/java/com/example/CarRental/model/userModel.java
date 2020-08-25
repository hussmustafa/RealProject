package com.example.CarRental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

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
	
	@Column(name = "UserAddreas")
	private String UserAddreas;
	
	@Column(name = "Cash")
	private int Cash ;
	
	public userModel() {
		
	}
	
	public userModel(@JsonProperty("UserName") String  userName, @JsonProperty("UserEmeil") String userEmeil,@JsonProperty("UserAddreas") String userAddreas, @JsonProperty("Cash") int cash) {
		
		this.UserName =userName;
		this.UserEmeil = userEmeil;
		this.UserAddreas = userEmeil;
		this.Cash = cash;
	}

	public userModel(int userId, String userName, String userEmeil, String userAddreas, int cash) {
		super();
		UserId = userId;
		UserName = userName;
		UserEmeil = userEmeil;
		UserAddreas = userAddreas;
		Cash = cash;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserEmeil() {
		return UserEmeil;
	}

	public void setUserEmeil(String userEmeil) {
		UserEmeil = userEmeil;
	}

	public String getUserAddreas() {
		return UserAddreas;
	}

	public void setUserAddreas(String userAddreas) {
		UserAddreas = userAddreas;
	}

	public int getCash() {
		return Cash;
	}

	public void setCash(int cash) {
		Cash = cash;
	}

	@Override
	public String toString() {
		return "userModel [UserId=" + UserId + ", UserName=" + UserName + ", UserEmeil=" + UserEmeil + ", UserAddreas="
				+ UserAddreas + ", Cash=" + Cash + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
   
	
	
	
 
}
