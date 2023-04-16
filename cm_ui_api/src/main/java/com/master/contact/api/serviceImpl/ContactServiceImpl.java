package com.master.contact.api.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.contact.api.dao.ContactDao;
import com.master.contact.api.entities.Contact;
import com.master.contact.api.exception.ResourceNotFoundException;
import com.master.contact.api.model.ContactModel;
import com.master.contact.api.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDao contactDao;
	
	@Override
	public ContactModel createUser(ContactModel contactModel) {
		Contact contact = this.modelToEntity(contactModel);
		Contact saveContact = this.contactDao.save(contact);
		return entityToModel(saveContact);
	}

	
	@Override
	public ContactModel updateUser(ContactModel contactModel, Integer cId) {
		Contact contactEntity = this.contactDao.findById(cId).orElseThrow(()-> new ResourceNotFoundException("Contact","id",cId));
		//here we are going to set data from model to entity
		
		Contact save = this.contactDao.save(contactEntity);
		ContactModel model = this.entityToModel(save);
		return model;
	}

	@Override
	public List<ContactModel> getAllList(ContactModel contactModel) {
		List<Contact> allList = this.contactDao.findAll();
		List<ContactModel> model = allList.stream().map(contacts-> this.entityToModel(contacts)).collect(Collectors.toList());
		
		return model;
	}

	@Override
	public ContactModel getListById(Integer cId) {
		Contact contactEntity = this.contactDao.findById(cId).orElseThrow(()-> new ResourceNotFoundException("Contact","id",cId));
		ContactModel model = this.entityToModel(contactEntity);
		return model;
	}

	@Override
	public void deleteById(Integer cId) {
		Contact contactEntity = this.contactDao.findById(cId).orElseThrow(()-> new ResourceNotFoundException("Contact","id",cId));
		this.contactDao.delete(contactEntity);
	}
	
	
	
	public Contact modelToEntity(ContactModel contactModel)
	{
		Contact contactEntity=new Contact();
		//contactEntity.setId(contactModel.getId());
		return contactEntity;
		
	}
	
	public ContactModel entityToModel(Contact contact)
	{
		ContactModel contactModel=new ContactModel();
//		contactModel.setId(contact.getId());
		
		
		return contactModel;
		
	}

}
