package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.domain.User;
import com.uca.capas.service.SucursalService;
import com.uca.capas.service.SucursalServiceImp;
import com.uca.capas.service.UserService;
import com.uca.capas.service.UserServiceImp;

@Controller
public class MainController {

	@Autowired
	public UserService usuarioService;
	@Autowired
	public SucursalService sucursalService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		mav.addObject("usuario",user);
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView validarLogin(@Valid @ModelAttribute User user, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("login");
		}else{
			List<User> results = null;
			
			try {
				results = usuarioService.findByUsuarioAndClave(user.getUsuario(), user.getClave());
			}catch (Exception e){
				
			}
			
			if(results.size()==1) {
				List<Sucursal> sucursales = null;
				try {
					sucursales = sucursalService.findAll();
				}catch(Exception e) {}
				mav.addObject("sucursales", sucursales);
				mav.setViewName("sucursales");
			}else {
				mav.addObject("mal","Invalid Credentials");
				mav.setViewName("login");
			}
		}
		return mav;
	}
	
}