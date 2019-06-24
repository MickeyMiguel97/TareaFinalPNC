package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repository.SucursalRepository;


@Service
public class SucursalServiceImp implements SucursalService {
		
	@Autowired
	public SucursalRepository Sucrepo;

	@Override
	public List<Sucursal> findAll() {
		return Sucrepo.findAll();
	}

	@Transactional
	@Override
	public void delete(int id) {
		Sucrepo.deleteById(id);
	}

	@Override
	public Sucursal findOne(Integer id) {
		return Sucrepo.getOne(id);
	}

	@Transactional
	@Override
	public void insert(Sucursal s) {
		Sucrepo.save(s);
	}

}
