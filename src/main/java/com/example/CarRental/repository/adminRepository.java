package com.example.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.model.AdminModel;
@Repository
public interface adminRepository extends JpaRepository<AdminModel,Integer > {

	
	
}
