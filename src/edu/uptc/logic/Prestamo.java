package edu.uptc.logic;

import java.util.Date;

	public class Prestamo {
	private String ISBN;
	private String usuarioPrestamo;
	private Date fechaPrestamo;
	
	public Prestamo(String ISBN, String usuarioPrestamo, Date fechaPrestamo) {
		this.ISBN = ISBN;
		this.usuarioPrestamo = usuarioPrestamo;
		this.fechaPrestamo = fechaPrestamo;
	}
	
	@Override
	public String toString() {
		return "Prestamo [ISBN=" + ISBN + ", usuarioPrestamo=" + usuarioPrestamo + ", fechaPrestamo=" + fechaPrestamo
				+ ", precioMultaP=" +  "]";
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String getUsuarioPrestamo() {
		return usuarioPrestamo;
	}
	
	public void setUsuarioPrestamo(String usuarioPrestamo) {
		this.usuarioPrestamo = usuarioPrestamo;
	}
	
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	
	
	}
