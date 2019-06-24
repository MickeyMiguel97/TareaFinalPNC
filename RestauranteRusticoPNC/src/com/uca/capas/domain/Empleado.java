package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(generator = "empleado_pk_codempleado_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "empleado_pk_codempleado_seq", sequenceName = "public.empleado_pk_codempleado_seq", allocationSize = 1)
	@Column(name = "pk_codempleado")
	private Integer pk_codempleado;
		
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "genero")
	private String genero;
	 
	@Column(name = "estado")
	private Boolean estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_sucursal")
	private Sucursal sucursal;
	
	public String getEstadoDelegate() {
		if(this.estado == null) return "";
		else {
			return estado == true ? "Activo":"Inactivo";
		}
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Integer getPk_codempleado() {
		return pk_codempleado;
	}

	public void setPk_codempleado(Integer pk_codempleado) {
		this.pk_codempleado = pk_codempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
}
