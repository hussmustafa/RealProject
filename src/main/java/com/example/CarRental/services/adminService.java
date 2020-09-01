package com.example.CarRental.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.CarRental.model.AdminModel;
import com.example.CarRental.model.CarModel;
import com.example.CarRental.model.regModel;
import com.example.CarRental.repository.CarRepository;
import com.example.CarRental.repository.adminRepository;
import com.example.CarRental.repository.regRepositry;
@Service
public class adminService implements adminRepository {

	@Autowired
	adminRepository adminRepo;
	@Autowired
	CarRepository carRepo;
	
	@Autowired
    regRepositry regRepo;	
	
	
	
	public CarModel addcar(CarModel car) {
		return  carRepo.save(car); 
		
	}
	
	public void deleteCar( int id) {
		carRepo.deleteById(id);
		
	}
	
	public String seeReg(){
		return regRepo.findAll().toString();
	}
	
	
	
	public void Accebt(regModel reg) {
		reg.setAccebted(true);
	}
	
	
	
	
	
	

	@Override
	public List<AdminModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminModel> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends AdminModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<AdminModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdminModel getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<AdminModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminModel> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<AdminModel> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(AdminModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends AdminModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends AdminModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends AdminModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
