package com.example.CarRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.services.userService;


@RestController
@RequestMapping("/carrental/users")
public class userController  {
	@Autowired
	private userService userSer;
	
	 @GetMapping("/allUsers")
	    public List<String> getAllNames() {
	        return this.userSer.getAllUserNames();
	 }
	
	
	

}
