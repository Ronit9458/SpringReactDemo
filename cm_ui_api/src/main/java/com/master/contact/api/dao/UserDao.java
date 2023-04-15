package com.master.contact.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.master.contact.api.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
