package com.example.CarRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.repository.adminRepository;
import com.example.CarRental.services.adminService;

@RestController
@RequestMapping("/carrental/admins")
public class adminController {
	
	private adminService adminServ;
	
	 @GetMapping("/allAdmins")
	    public List<String> getAllNames() {
	        return this.adminServ.getAllAdminName();
	 }
	
	
	

}
