package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.service.EmpleadoService;
import com.uca.capas.service.SucursalService;



@Controller
public class EmpleadoController {
	@Autowired
	public EmpleadoService employeeService;
	@Autowired
	public SucursalService sucursalService;
	
	
	@RequestMapping("/ne")
	public ModelAndView add(@ModelAttribute Empleado em, BindingResult result,@RequestParam("cbr") Integer cbr) {
		ModelAndView mav = new ModelAndView();
		Sucursal sucursal = null;
		try {
			sucursal = sucursalService.findOne(cbr);
		}catch(Exception e) {}
		mav.addObject("sucursal",sucursal);
		mav.setViewName("agregare");
		return mav;
	}
	
	@RequestMapping("/newE")
	public ModelAndView setNew(@Valid @ModelAttribute Empleado s, BindingResult result,@RequestParam("cbr") Integer cbr) {
		ModelAndView mav = new ModelAndView();
		Sucursal sucursal = null;
		if(result.hasErrors()) {
			mav.setViewName("agregare");
		}else{
			try {
			sucursal = sucursalService.findOne(cbr);
			s.setSucursal(sucursal);
			employeeService.insert(s);
			}catch(Exception e){}
			List<Empleado> empleados = null;
			try {
				empleados = sucursal.getEmpleados();
			}catch(Exception e) {}
			mav.addObject("sucursal", sucursal);
			mav.addObject("empleados", empleados);
			mav.setViewName("profile");
		}
		return mav;
	}
	
	@RequestMapping("/ee")
	public ModelAndView edit(@ModelAttribute Empleado s, BindingResult result,@RequestParam("cbr") Integer code,@RequestParam("cb") Integer suc) {
			ModelAndView mav = new ModelAndView();
			Empleado empleado = null;
			Sucursal sucursal = null;
			try {
				sucursal = sucursalService.findOne(suc);
				empleado = employeeService.findOne(code);
			}catch(Exception e) {}
			mav.addObject("sucursal",sucursal);
			mav.addObject("empleado",empleado);
			mav.setViewName("edite");
			return mav;
	}
	
	@RequestMapping("/editar")
	public ModelAndView editar(@Valid @ModelAttribute Empleado s, BindingResult result,@RequestParam("cbr") Integer cbr) {
		ModelAndView mav = new ModelAndView();
		Sucursal sucursal = null;
		try {
			sucursal = sucursalService.findOne(cbr);
		}catch(Exception e) {}
		if(result.hasErrors()) {
			mav.addObject("sucursal", sucursal);
			mav.setViewName("edite");
		}else{
			try {
			employeeService.insert(s);
			}catch(Exception e){}
			List<Empleado> empleados = null;
			try {
				empleados = employeeService.findAll();
			}catch(Exception e) {}
			mav.addObject("sucursal", sucursal);
			mav.addObject("empleados", empleados);
			mav.setViewName("profile");
		}
		return mav;
	}
	
	@RequestMapping("/dele")
	public ModelAndView del(@RequestParam("cbr") Integer code,@RequestParam("cb") Integer suc ) {
		try {
			employeeService.delete(code);
		}catch(Exception e) {}
		ModelAndView mav = new ModelAndView();
		List<Empleado> empleados = null;
		Sucursal sucursal=null;
		try {
			sucursal = sucursalService.findOne(suc);
			empleados = employeeService.findAll();
		}catch(Exception e) {}
		mav.addObject("sucursal", sucursal);
		mav.addObject("empleados", empleados);
		mav.setViewName("profile");
		return mav;
	}
	
	
}