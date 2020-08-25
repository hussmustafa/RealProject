package com.example.CarRental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.model.CarModel;

@Repository
public interface CarRepository extends  JpaRepository<CarModel, Integer> {

//	List<String> getCarById(int carId);
//
//	CarModel findByCarId(int id);
//
////	String addCar(CarModel car);
//	
////   CarModel findByCarName(String CarName);
//

}
