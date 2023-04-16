package com.master.contact.api.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.master.contact.api.dao.UserDao;
import com.master.contact.api.entities.User;
import com.master.contact.api.exception.ResourceNotFoundException;
import com.master.contact.api.model.UserModel;
import com.master.contact.api.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ModelMapper modelMaper;
	
	// Method to create records
	@Override
	public UserModel createUser(UserModel userModel) {
		User userEntity=this.modelToEntity(userModel);
		     User saveUser = userDao.save(userEntity);
		     UserModel model=this.entityToModel(saveUser);
		return model;
	}
	
	

	
	//Method to update record
	@Override
	public UserModel updateUser(UserModel userModel, Integer userId) {
		User userEntity=this.userDao.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","id",userId));
		//here we are going to set data from model to entity
		
		
		User save =this.userDao.save(userEntity);
		UserModel model=this.entityToModel(save);
		return model;
	}
	
	
	
//this method is used to get all the list
	@Override
	public List<UserModel> getAllList() {
		List<User> allList = this.userDao.findAll();
		List<UserModel> model = allList.stream().map(users-> this.entityToModel(users)).collect(Collectors.toList());
		return model;
	}
	
	
	
	
//this method is used to get list by id
	@Override
	public UserModel getListById(Integer userId) {
		User userEntity = this.userDao.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","id",userId));
		return entityToModel(userEntity);
	}

	
	
	//this is method is used to delete record based on particular id
	@Override
	public void deleteById(Integer userId) {
		User userEntity = this.userDao.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","id",userId));	
		this.userDao.delete(userEntity);
	}
	
	
	
	
	// this method is used to convert model to entity
	public User modelToEntity(UserModel userModel)
	{
		User userEntity=this.modelMaper.map(userModel, User.class);
		//User userEntity=new User();
		//userEntity.setId(userModel.getId());
		
		return userEntity;
		
	}
	
	
	// this method is used to convert entity to model
	public UserModel entityToModel(User user)
	{
		UserModel userModel=this.modelMaper.map(user, UserModel.class);
		//UserModel userModel=new UserModel();
	//	userModel.setId(user.getId());
		
		return userModel;
		
	}

}
