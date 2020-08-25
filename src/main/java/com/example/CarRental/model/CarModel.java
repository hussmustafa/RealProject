package com.example.CarRental.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name = "cars", schema = "carrental")
public class CarModel {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int CarId;
    @Column(name="CarName")
	private String CarName;
   
    @Column(name="CarModel")
    private String CarModel;

    @Column(name="CarType")
    private String CarType;
    
    @Column(name="Price")
    private String Price; 
    
    @Column(name="isAvalble")
    private int isAvalble;
    
    
public CarModel() {
		
		
	}
    
	
	public CarModel(@JsonProperty("CarName") String Carname,@JsonProperty("CarModel") String Carmodel ,@JsonProperty("CarType") String Cartype , @JsonProperty("Price") String price ,@JsonProperty("isAvalble") int isavalble) {
		
        this.CarName = Carname;
        this.CarModel=Carmodel;
        this.CarType = Cartype;
        this.Price = price;
        this.isAvalble = isavalble;
//        
//        
//        
//		
//		
//		
	}
	

	
	public CarModel( String carName, String carModel, String carType, String price) {
		super();
		
		CarName = carName;
		CarModel = carModel;
		CarType = carType;
		Price = price;
	}

	
	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public String getCarType() {
		return CarType;
	}

	public void setCarType(String carType) {
		CarType = carType;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public int getIsAvalble() {
		return isAvalble;
	}

	public void setIsAvalble(int isAvalble) {
		this.isAvalble = isAvalble;
	}


	@Override
	public String toString() {
		return "Cars [CarId=" + CarId + ", CarName=" + CarName + ", CarModel=" + CarModel + ", CarType=" + CarType
				+ ", Price=" + Price + ", isAvalble=" + isAvalble + "]";
	}
	
	
	
	
	
	
	

	
	

}