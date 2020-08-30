package com.example.CarRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.model.AdminModel;
import com.example.CarRental.model.CarModel;
import com.example.CarRental.model.userModel;
import com.example.CarRental.repository.adminRepository;
import com.example.CarRental.repository.userRepository;
import com.example.CarRental.services.adminService;
import com.example.CarRental.services.userService;

@RestController
@RequestMapping("/carrental/admins")
public class adminController {
	
	@Autowired 
	private adminRepository adminRe;
	
	private  userService userSer;
	
	
	 
	 @GetMapping("/getUsers")
	 List<userModel> getAllUsers(){
		 return userSer.findAll();
	 }
	 
	 @GetMapping("/getUser/{id}")
	 public userModel GetUserById(int id) {
		 return (userModel) userSer.findById(id);
	 }
	 
	 
	 @PostMapping("/addAdmin")
		AdminModel addAdmin(@RequestBody AdminModel newadmin, @PathVariable int Id) {

		    return adminRe.findById(Id)
		      .map(admin -> {
		    	  admin.setAdminName(newadmin.getAdminName());
		    	  admin.setAdminEmil(newadmin.getAdminEmil());
		    	  admin.setAdminAddreas(newadmin.getAdminAddreas());


		        return adminRe.save(admin);
		      })
		      .orElseGet(() -> {
		    	  newadmin.setAdminId(Id);
		        return adminRe.save(newadmin);
		      });
		  }
		
		@DeleteMapping("/Delete")
		  void deleteAdmin(@PathVariable int id) {
			adminRe.deleteById(id);;
		  }

	
	
	

}
