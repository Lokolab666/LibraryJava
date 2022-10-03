package edu.uptc.logic;

import java.util.Date;

public class Libro {
	private String ISBN;
	private String nombreL;
	private String autorL;
	private Genero tipoGenero;
	private Date fechaPublicacionL;
	private int copiasL;
	private int calificacionEdadL;
	private double precioMultaL;
	
	public Libro(String ISBN, String nombreL, String autorL, Genero tipoGenero, Date fechaPublicacion, int copiasL, int calificacionEdadL, double precioMulta) {
		this.ISBN = ISBN;
		this.nombreL = nombreL;
		this.autorL = autorL;
		this.tipoGenero = tipoGenero;
		this.fechaPublicacionL = fechaPublicacion;
		this.copiasL = copiasL;
		this.calificacionEdadL = calificacionEdadL;
		this.precioMultaL = precioMulta;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", nombreL=" + nombreL + ", autorL=" + autorL + ", tipoGenero=" + tipoGenero
				+ ", fechaPublicacionL=" + fechaPublicacionL + ", copiasL=" + copiasL + ", calificacionEdadL="
				+ calificacionEdadL + ", precioMultaL=" + precioMultaL + "]";
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNombreL() {
		return nombreL;
	}

	public void setNombreL(String nombreL) {
		this.nombreL = nombreL;
	}

	public String getAutorL() {
		return autorL;
	}

	public void setAutorL(String autorL) {
		this.autorL = autorL;
	}

	public Genero getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(Genero tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	public Date getFechaPublicacionL() {
		return fechaPublicacionL;
	}

	public void setFechaPublicacionL(Date fechaPublicacionL) {
		this.fechaPublicacionL = fechaPublicacionL;
	}

	public int getCopiasL() {
		return copiasL;
	}

	public void setCopiasL(int copiasL) {
		this.copiasL = copiasL;
	}

	public int getCalificacionEdadL() {
		return calificacionEdadL;
	}

	public void setCalificacionEdadL(int calificacionEdadL) {
		this.calificacionEdadL = calificacionEdadL;
	}

	public double getPrecioMultaL() {
		return precioMultaL;
	}

	public void setPrecioMultaL(double precioMultaL) {
		this.precioMultaL = precioMultaL;
	}
	
	
}
