package edu.uptc.logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado {
	private String nombresE;
	private String apellidosE;
	private String telefonoE;
	private Date fechaNacimientoE;
	private String usuarioE;
	private String contrasenaE;
	
	
	public Empleado(String nombresE, String apellidosE, String telefonoE, Date fechaNacimientoE, String usuarioE, String contrasenaE) {
		this.nombresE = nombresE;
		this.apellidosE = apellidosE;
		this.telefonoE = telefonoE;
		this.fechaNacimientoE = fechaNacimientoE;
		this.usuarioE = usuarioE;
		this.contrasenaE = contrasenaE;
	}
	
	public String verificarDataEm(String[] datos) {
		if (!datos[0].equals(getUsuarioE()) && !datos[1].equals(getContrasenaE())) {
			if (verifiLoginEm(getUsuarioE(), getContrasenaE()) == true) {
				return "Empleado no encontrado";
			} else {
				return "Empleado no encontrado";
			}
		} else {
			return "Empleado encontrado";
		}
	}
	
	public boolean verifiLoginEm(String usuario, String contrasena) {
		if (usuario.equals(getUsuarioE()) && contrasena.equals(getContrasenaE())) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "Empleado [nombresE=" + nombresE + ", apellidosE=" + apellidosE + ", telefonoE=" + telefonoE
				+ ", fechaNacimientoE=" + fechaNacimientoE + ", usuarioE=" + usuarioE + ", contrasenaE=" + contrasenaE
				+ "]";
	}


	public String getNombresE() {
		return nombresE;
	}


	public void setNombresE(String nombresE) {
		this.nombresE = nombresE;
	}


	public String getApellidosE() {
		return apellidosE;
	}


	public void setApellidosE(String apellidosE) {
		this.apellidosE = apellidosE;
	}


	public String getTelefonoE() {
		return telefonoE;
	}


	public void setTelefonoE(String telefonoE) {
		this.telefonoE = telefonoE;
	}

	public String getUsuarioE() {
		return usuarioE;
	}


	public void setUsuarioE(String usuarioE) {
		this.usuarioE = usuarioE;
	}


	public String getContrasenaE() {
		return contrasenaE;
	}


	public void setContrasenaE(String contrasenaE) {
		this.contrasenaE = contrasenaE;
	}


	public String getFechaNacimientoE() {
		String convertioner = "MM/dd/yyyy";
		DateFormat dateFormat = new SimpleDateFormat(convertioner);
		String fechaNacimientoR = dateFormat.format(fechaNacimientoE);
		return fechaNacimientoR;
	}


	public void setFechaNacimientoE(Date fechaNacimientoE) {
		this.fechaNacimientoE = fechaNacimientoE;
	}
	
	
	
}
