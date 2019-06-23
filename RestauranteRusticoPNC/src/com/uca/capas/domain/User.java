package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema= "public", name = "usuario")
public class User {
	
	@Id
	@GeneratedValue(generator = "usuario_pk_usuario_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "usuario_pk_usuario_seq", sequenceName = "public.usuario_pk_usuario_seq", allocationSize = 1)
	@Column(name = "pk_usuario")
	private String usuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "clave")
	private String clave;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}