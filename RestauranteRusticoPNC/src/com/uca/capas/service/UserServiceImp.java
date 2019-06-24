package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.User;
import com.uca.capas.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	public UserRepository Userrepo;
	
	@Override
	public List<User> findByNombreAndClave(String username, String password) {
		// TODO Auto-generated method stub
		return Userrepo.findByNombreAndClave(username, password);
	}
}


