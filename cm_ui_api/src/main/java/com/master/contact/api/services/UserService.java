package com.master.contact.api.services;

import java.util.List;

import com.master.contact.api.model.UserModel;

public interface UserService {
	
	UserModel createUser(UserModel userModel);
	UserModel updateUser(UserModel userModel,Integer userId);
	List<UserModel> getAllList();
	UserModel getListById(Integer userId);
	public void deleteById(Integer userId);
	

}
