package com.example.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.model.CarModel;

@Repository
public interface CarRepository extends  JpaRepository<CarModel, Integer> {
	
//   CarModel findByCarName(String CarName);


}
