package ec.edu.ups.EvaluacionU2Vasquez_B.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_Libro")
public class Libro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "lib_codigo")
	private int codigo;
	@Column(name = "lib_nombre")
	private String nombreLibro;
	@Column(name = "lib_autor")
	private String autor;
	@Column(name = "lib_editorial")
	private String editorial;
	@Column(name = "lib_paginas")
	private int numeropag;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombreLibro() {
		return nombreLibro;
	}
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getNumeropag() {
		return numeropag;
	}
	public void setNumeropag(int numeropag) {
		this.numeropag = numeropag;
	}
	
	
	
	
}
