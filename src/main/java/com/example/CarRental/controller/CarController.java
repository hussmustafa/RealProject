package com.example.CarRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.model.CarModel;
import com.example.CarRental.repository.CarRepository;
import com.example.CarRental.services.CarService;

@RestController
@RequestMapping("/carrental/cars")
public class CarController {
	
	@Autowired
	private CarService carService ;
	
	@Autowired
	private CarRepository carRepo;
	

	@PostMapping("/AddCar")
	CarModel addCar(@RequestBody CarModel newCar, @PathVariable int Id) {

	    return carRepo.findById(Id)
	      .map(car -> {
	    	  car.setCarName(newCar.getCarName());
	    	  car.setCarModel(newCar.getCarModel());
	    	  car.setCarType(newCar.getCarType());
	    	  car.setPrice(newCar.getPrice());


	        return carRepo.save(car);
	      })
	      .orElseGet(() -> {
	    	  newCar.setCarId(Id);
	        return carRepo.save(newCar);
	      });
	  }
	
	@DeleteMapping("/Delete")
	  void deleteCar(@PathVariable int id) {
		carRepo.deleteById(id);
	  }
//	
//	@GetMapping("/{carname}")
//	public String getCarByName(@PathVariable("carname") String carname) {
//		
//		//Cars car = this.carService.findByCarName(carname);
//		return null;
//				
//		
//	}
//	
//	 @GetMapping("/allCars")
//	    public List<String> getAllNames() {
//	        return this.carService.getAllCarName();
//	 }
//	 
//	 @PostMapping("/load")
//	 public List<CarModel> persist(@RequestBody final CarModel car){
//		 
//		 carService.save(car);
//		return carService.findAll();
//	 }
	 @PostMapping("/add")
		public String addCar(@RequestParam String carName, @RequestParam String carModel,@RequestParam String carType ,@RequestParam String price) {
		 CarModel car = new CarModel();
			car.setCarName(carName);
			car.setCarModel(carModel);
			car.setCarType(carType);
			car.setPrice(price);
			
			carService.addCar(car);
			return "Done";
	 }

	
	

}
