package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.User;
import com.uca.capas.repository.UserRepository;

public class UserServiceImp {
	
	@Autowired
	public UserRepository usuariorepository;
	
	@Override
	public List<User> findByUsuarioAndClave(String username, String password) {
		// TODO Auto-generated method stub
		return usuariorepository.findByUsuarioAndClave(username, password);
	}
}
