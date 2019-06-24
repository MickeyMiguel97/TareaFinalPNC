package com.uca.capas.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="sucursal")
public class Sucursal {

	@Id
	@GeneratedValue(generator = "sucursal_pk_codsucursal_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_pk_codsucursal_seq", sequenceName = "public.sucursal_pk_codsucursal_seq", allocationSize = 1)
	@Column(name = "pk_codsucursal")
	private Integer pk_codsucursal;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "gerente")
	private String gerente;
	
	@Column(name = "nmesas")
	private Integer nmesas;
	
	@Column(name = "ubicacion")
	private String ubicacion;
	
	@Column(name = "horarioin")
	private String horarioin;
	
	@Column(name = "horarioout")
	private String horarioout;
	
	@OneToMany(mappedBy = "sucursal", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Empleado> empleados;
	
	public Sucursal() {
		super();
	}

	public Integer getPk_codsucursal() {
		return pk_codsucursal;
	}

	public void setPk_codsucursal(Integer pk_codsucursal) {
		this.pk_codsucursal = pk_codsucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public Integer getNmesas() {
		return nmesas;
	}

	public void setNmesas(Integer nmesas) {
		this.nmesas = nmesas;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getHorarioin() {
		return horarioin;
	}

	public void setHorarioin(String horarioin) {
		this.horarioin = horarioin;
	}

	public String getHorarioout() {
		return horarioout;
	}

	public void setHorarioout(String horarioout) {
		this.horarioout = horarioout;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
