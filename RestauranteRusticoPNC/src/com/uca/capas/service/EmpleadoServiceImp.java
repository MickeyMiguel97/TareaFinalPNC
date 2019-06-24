package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.repository.EmpleadoRepository;


@Service
public class EmpleadoServiceImp implements EmpleadoService {

	@Autowired
	public EmpleadoRepository Emprepo;
	
	@Override
	public List<Empleado> findAll() {
		return Emprepo.findAll();
	}

	@Override
	public Empleado findOne(Integer id) {
		return Emprepo.getOne(id);
	}

	@Override
	public void delete(int id) {
		Emprepo.deleteById(id);
		
	}

	@Override
	public void insert(Empleado s) {
		Emprepo.save(s);
	}

}