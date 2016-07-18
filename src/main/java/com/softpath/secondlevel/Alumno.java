package com.softpath.secondlevel;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="ALUMNO")
//con esto le decimos que queremos usar el segundo nivel de cache y le ponemos la estrategia
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alumno {
	@Id @GeneratedValue
	private int idAlumno;
	private String nombreAlumno;
	private String salonAlumno;
	
	
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getSalonAlumno() {
		return salonAlumno;
	}
	public void setSalonAlumno(String salonAlumno) {
		this.salonAlumno = salonAlumno;
	}
	
	
	
}
