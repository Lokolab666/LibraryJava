package edu.uptc.logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
	private String nombresU;
	private String apellidosU;
	private String telefonoU;
	private Date fechaNacimientoU;
	private Ciudad ciudadU;
	private Departamento departamentoU;
	private String usuarioU;
	private String contrasenaU;

	public Usuario(String nombresU, String apellidosU, String telefonoU, Date fechaNacimientoU, Ciudad ciudadU, Departamento departamentoU, String usuarioU, 
			String contrasenaU) {
		this.nombresU = nombresU;
		this.apellidosU = apellidosU;
		this.telefonoU = telefonoU;
		this.fechaNacimientoU = fechaNacimientoU;
		this.ciudadU = ciudadU;
		this.departamentoU = departamentoU;
		this.usuarioU = usuarioU;
		this.contrasenaU = contrasenaU;
	}

	public String getNombresU() {
		return nombresU;
	}

	public void setNombresU(String nombresU) {
		this.nombresU = nombresU;
	}

	public String getApellidosU() {
		return apellidosU;
	}

	public void setApellidosU(String apellidosU) {
		this.apellidosU = apellidosU;
	}

	public String getTelefonoU() {
		return telefonoU;
	}

	public void setTelefonoU(String telefonoU) {
		this.telefonoU = telefonoU;
	}

	public String getFechaNacimientoU() {
		String convertioner = "MM/dd/yyyy";
		DateFormat dateFormat = new SimpleDateFormat(convertioner);
		String fechaNacimientoR = dateFormat.format(fechaNacimientoU);
		return fechaNacimientoR;
	}

	public void setFechaNacimientoU(Date fechaNacimientoU) {
		this.fechaNacimientoU = fechaNacimientoU;
	}

	public Ciudad getCiudadU() {
		return ciudadU;
	}

	public void setCiudadU(Ciudad ciudadU) {
		this.ciudadU = ciudadU;
	}

	public Departamento getDepartamentoU() {
		return departamentoU;
	}

	public void setDepartamentoU(Departamento departamentoU) {
		this.departamentoU = departamentoU;
	}

	public String getUsuarioU() {
		return usuarioU;
	}

	public void setUsuarioU(String usuarioU) {
		this.usuarioU = usuarioU;
	}

	public String getContrasenaU() {
		return contrasenaU;
	}

	public void setContrasenaU(String contrasenaU) {
		this.contrasenaU = contrasenaU;
	}

	@Override
	public String toString() {
		return "Usuario [nombresU=" + nombresU + ", apellidosU=" + apellidosU + ", telefonoU=" + telefonoU
				+ ", fechaNacimientoU=" + fechaNacimientoU + ", ciudadU=" + ciudadU + ", departamentoU=" + departamentoU
				+ ", usuarioU=" + usuarioU + ", contrasenaU=" + contrasenaU + "]";
	}
	
	





}
