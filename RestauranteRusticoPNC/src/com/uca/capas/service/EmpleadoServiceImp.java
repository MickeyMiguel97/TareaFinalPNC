package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.repository.EmpleadoRepository;


@Service
public class EmpleadoServiceImp implements EmpleadoService {

	@Autowired
	public EmpleadoRepository employeerepository;
	
	@Override
	public List<Empleado> findAll() {
		return employeerepository.findAll();
	}

	@Override
	public Empleado findOne(Integer id) {
		return employeerepository.getOne(id);
	}

	@Override
	public void delete(int id) {
		employeerepository.deleteById(id);
		
	}

	@Override
	public void insert(Empleado s) {
		employeerepository.save(s);
	}

}