package com.example.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.model.userModel;

@Repository
public interface userRepository extends JpaRepository<userModel, Integer> {
	
	

}
