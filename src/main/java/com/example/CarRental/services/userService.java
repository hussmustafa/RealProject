package com.example.CarRental.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.CarRental.model.CarModel;
import com.example.CarRental.model.regModel;
import com.example.CarRental.model.userModel;
import com.example.CarRental.repository.CarRepository;
import com.example.CarRental.repository.userRepository;
@Service
public class userService implements userRepository {
	

	@Autowired
	 userRepository userRepo;
	

public	regService regg;
	@Autowired
	CarRepository carRepo;
	
	public boolean CheakIDs(int carid , int userId) {
		 List<userModel> users = userRepo.findAll();
		 List<CarModel> cars = carRepo.findAll();
		 
		 for(int i =0; i < users.size(); i++) {
			 if(users.stream().map(p -> p.getUserId()==userId )!= null && cars.stream().map(p -> p.getCarId()==carid) != null)
				 return true;
		 }
		 
		 return false;

		
	}
	public boolean RentCar(int carId, int userId, Date date) {
		 List<userModel> users = userRepo.findAll();
		 List<CarModel> cars = carRepo.findAll();
		 
		 regModel reg = null;
		 reg.setCarId(carId);
		 reg.setUserId(userId);
		 reg.setDateofReg(date);
		 reg.setAccebted(false);
		 
		 for(int i =0 ; i < cars.size();i++) {
			if( cars.stream().map(p -> p.getCarId()==carId) != null) {
				if(cars.stream().map(p-> p.getIsAvalble()==1) != null)
					regg.save(reg);
						return true;
			
			
				
			 }
			return false;
			 
		 }
		 
	
		 
		 
		 return false;
		 
		 	
		
	}
	

	
	public List <String> getAllUserNames()
	{
		 List<userModel> users = userRepo.findAll();
	        return users.stream().map(p -> p.getUserName()).sorted().collect(Collectors.toList());

		
	}
	

	@Override
	public List<userModel> findAll() {
		
		return userRepo.findAll();
	}

	
	public boolean findEmailAndPass(String emeil,String pass) {
		
		 List<userModel> users = userRepo.findAll();
		 if(users.stream().map(p-> p.getUserEmeil().compareToIgnoreCase(emeil)==0) != null && users.stream().map(p-> p.getPass().compareTo(pass)==0) != null)
	
		 return true;
		 else
			 return false;

	}

	public boolean SignIn(String emeil, String pass) {
		
	return findEmailAndPass(emeil, pass);
	
	}

	
	public userModel SignUp(userModel user) {
		return userRepo.save(user);
	}
	
	

	@Override
	public <S extends userModel> List<S> saveAll(Iterable<S> entities) {

		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends userModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<userModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public userModel getOne(Integer id) {
		// TODO Auto-generated method stub
		return userRepo.getOne(id);
	}

	@Override
	public <S extends userModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends userModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<userModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends userModel> S save(S entity) {

		
		return userRepo.save(entity);
	}

	@Override
	public Optional<userModel> findById(Integer id) {
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
	public void delete(userModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends userModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends userModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends userModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends userModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends userModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<userModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<userModel> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<userModel> findById( int id) {
		// TODO Auto-generated method stub
		return (List<userModel>) userRepo.getOne(id);
	}

}
