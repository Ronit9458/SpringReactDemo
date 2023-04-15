package com.master.contact.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.master.contact.api.entities.Contact;

public interface ContactDao extends JpaRepository<Contact, Integer> {

}
