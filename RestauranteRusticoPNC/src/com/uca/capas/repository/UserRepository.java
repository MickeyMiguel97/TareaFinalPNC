package com.uca.capas.repository;
import com.uca.capas.domain.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByNombreAndClave(String username, String password);
	

}