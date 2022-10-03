package edu.uptc.logic;

public class AdministradorData {
	private String usuario;
	private String contrasena;
	
	
	public AdministradorData() {
		this.usuario = "Admin";
		this.contrasena = "jeje";
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}
