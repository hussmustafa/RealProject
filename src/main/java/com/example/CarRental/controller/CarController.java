package com.example.CarRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.model.CarModel;
import com.example.CarRental.services.CarService;

@RestController
@RequestMapping("/carrental/cars")
public class CarController {
	
	@Autowired
	private CarService carService ;
	
	@GetMapping("/{carname}")
	public String getCarByName(@PathVariable("carname") String carname) {
		
		//Cars car = this.carService.findByCarName(carname);
		return null;
				
		
	}
	
	 @GetMapping("/allCars")
	    public List<String> getAllNames() {
	        return this.carService.getAllCarName();
	 }
	 
	 @PostMapping("/load")
	 public List<CarModel> persist(@RequestBody final CarModel car){
		 
		 carService.save(car);
		return carService.findAll();
	 }
	
	

}
