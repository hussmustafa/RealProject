package com.example.CarRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.model.regModel;
@Repository
public interface regRepositry extends JpaRepository<regModel, Integer> {
	

}
