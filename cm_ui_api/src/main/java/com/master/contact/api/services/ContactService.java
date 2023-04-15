package com.master.contact.api.services;

import java.util.List;

import com.master.contact.api.model.ContactModel;

public interface ContactService {

	ContactModel createUser(ContactModel contactModel);
	ContactModel updateUser(ContactModel contactModel,Integer cId);
	List<ContactModel> getAllList(ContactModel contactModel);
	ContactModel getListById(Integer cId);
	public void deleteById(Integer cId);
}
