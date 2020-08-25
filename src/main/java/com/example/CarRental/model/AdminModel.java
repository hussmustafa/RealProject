package com.example.CarRental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.GenerationType;
@Entity
@Table(name ="admins",schema = " carrental")
public class AdminModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int AdminId;
	@Column (name="AdminName")
	private String AdminName;
	
	@Column(name="AdminEmeil")
	private String AdminEmil;
	
	@Column(name = "AdminAddreas")
	private String AdminAddreas;
	
	public AdminModel() {
		
	}
	
	public AdminModel(@JsonProperty("AdminName")String Adminname,@JsonProperty("ِAdminEmeil")String adminemail,@JsonProperty("AdminAddreas")String Adminaddreas) {
		
		this.AdminName=Adminname;
		this.AdminEmil = adminemail;
		this.AdminAddreas = Adminaddreas;
		
	}

	public AdminModel(int adminId, String adminName, String adminEmil, String adminAddreas) {
		super();
		AdminId = adminId;
		AdminName = adminName;
		AdminEmil = adminEmil;
		AdminAddreas = adminAddreas;
	}

	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	public String getAdminEmil() {
		return AdminEmil;
	}

	public void setAdminEmil(String adminEmil) {
		AdminEmil = adminEmil;
	}

	public String getAdminAddreas() {
		return AdminAddreas;
	}

	public void setAdminAddreas(String adminAddreas) {
		AdminAddreas = adminAddreas;
	}

	@Override
	public String toString() {
		return "AdminModel [AdminId=" + AdminId + ", AdminName=" + AdminName + ", AdminEmil=" + AdminEmil
				+ ", AdminAddreas=" + AdminAddreas + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
