package com.example.CarRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.model.AdminModel;
import com.example.CarRental.model.userModel;
import com.example.CarRental.repository.userRepository;
import com.example.CarRental.services.userService;


@RestController
@RequestMapping("/carrental/users")
public class userController  {
	@Autowired
	private userService userSer;
	
	@Autowired
	userRepository userRepo;
	
	 @GetMapping("/allUsers")
	    public List<String> getAllNames() {
	        return this.userSer.getAllUserNames();
	 }
	 
//	 @PostMapping("/addUser")
//		userModel addUser(@RequestBody userModel newuser, @PathVariable int Id) {
//
//		    return userRepo.findById(Id)
//		      .map(user -> {
//		    	  user.setUserName(newuser.getUserName());
//		    	  user.setUserEmeil(newuser.getUserEmeil());
//		    	  user.setUserAddreas(newuser.getUserAddreas());
//		    	  user.setCash(newuser.getCash());
//
//
//		        return userRepo.save(user);
//		      })
//		      .orElseGet(() -> {
//		    	  newuser.setUserId(Id);
//		        return userRepo.save(newuser);
//		      });
//		  }
//		
//		@DeleteMapping("/Delete")
//		  void deleteUser(@PathVariable int id) {
//			userRepo.deleteById(id);
//		  }
//		
		
//		@PutMapping("/users/{id}")
//		ResponseEntity<?> replaceEmployee(@RequestBody userModel usres, @PathVariable int id) {
//
//			userModel udateUser= userRepo.getOne(id)
//		      .map(user -> {
//		    	  user.setUserName(newuser.getUserName());
//		    	  user.setUserEmeil(newuser.getUserEmeil());
//		    	  user.setUserAddreas(newuser.getUserAddreas());
//		    	  user.setCash(newuser.getCash());
//		        return repository.save(user);
//		      }) 
//		      .orElseGet(() -> {
//		        newEmployee.setId(id);
//		        return repository.save(newEmployee);
//		      });
//
//		  EntityModel<Employee> entityModel = assembler.toModel(updatedEmployee);
//
//		  return ResponseEntity //
//		      .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
//		      .body(entityModel);
//		}
//	
	
	

}
