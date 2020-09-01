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
	private String AdminEmeil;
	
	@Column(name = "Pass")
	private String Pass;
	
	@Column(name = "AdminAddreas")
	private String AdminAddreas;
	
	@Column(name = "Money")
	private double Money;
	
	
	
	public AdminModel() {
		
	}
	
	public AdminModel(@JsonProperty("AdminName")String Adminname,@JsonProperty("ِAdminEmeil")String adminemail, @JsonProperty("Pass")String pass ,@JsonProperty("AdminAddreas")String Adminaddreas,@JsonProperty("Money")double money) {
		
		this.AdminName=Adminname;
		this.AdminEmeil = adminemail;
		this.Pass = pass;
		this.AdminAddreas = Adminaddreas;
		this.Money=money;
		
	}

	public AdminModel(int adminId, String adminName, String adminEmeil,String pass, String adminAddreas,Double money) {
		super();
		AdminId = adminId;
		AdminName = adminName;
		AdminEmeil = adminEmeil;
		Pass=pass;
		AdminAddreas = adminAddreas;
		Money = money;
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

	public String getAdminEmeil() {
		return AdminEmeil;
	}

	public void setAdminEmeil(String adminEmeil) {
		AdminEmeil = adminEmeil;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public String getAdminAddreas() {
		return AdminAddreas;
	}

	public void setAdminAddreas(String adminAddreas) {
		AdminAddreas = adminAddreas;
	}

	public double getMoney() {
		return Money;
	}

	public void setMoney(double money) {
		Money = money;
	}

	@Override
	public String toString() {
		return "AdminModel [AdminId=" + AdminId + ", AdminName=" + AdminName + ", AdminEmeil=" + AdminEmeil + ", Pass="
				+ Pass + ", AdminAddreas=" + AdminAddreas + ", Money=" + Money + "]";
	}

	
	
	
	
	
	
	
	
	
	

}
