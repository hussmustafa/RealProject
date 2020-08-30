package com.example.CarRental.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

@Entity
@Table(name = "reg", schema = "carrental")
public class regModel {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int CarId;
	 

	    @Column(name = "UserId")
	    private int UserId;

	    @NotNull
	   // @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "CarId", referencedColumnName = "UserId")
	    @OnDelete(action = OnDeleteAction.CASCADE)
	
   
    @Column(name="DateofReg")
    private Date DateofReg;
	    
	    
	    public regModel() {
	    	
	    	
	    }

		public regModel(@JsonProperty("UserId") int userId, @JsonProperty("DateofReg") Date DateOfReg ) {
			
	       this.UserId=userId;
	       this.DateofReg=DateOfReg;
	        }

		public regModel(int carId, int userId, Date dateofReg) {
			super();
			CarId = carId;
			UserId = userId;
			DateofReg = dateofReg;
		}

		public int getCarId() {
			return CarId;
		}

		public void setCarId(int carId) {
			CarId = carId;
		}

		public int getUserId() {
			return UserId;
		}

		public void setUserId(int userId) {
			UserId = userId;
		}

		public Date getDateofReg() {
			return DateofReg;
		}

		public void setDateofReg(Date dateofReg) {
			DateofReg = dateofReg;
		}

		@Override
		public String toString() {
			return "regModel [CarId=" + CarId + ", UserId=" + UserId + ", DateofReg=" + DateofReg + "]";
		}
		
		
		
		
		

}
