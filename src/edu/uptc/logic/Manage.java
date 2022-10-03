package edu.uptc.logic;

public class Manage {
	private AdministradorData administradorData;
	
	public Manage() {
		administradorData = new AdministradorData();
		
	}
	
	public String createVerifi(String[] data) {
		if (!data[0].equals("") && !data[1].equals("")) {
			if (verifiIfLoginAdmin(data) == true) {
				return "Administrador encontrado";
			} else {
				return "Administrador no encontrado";
			}
		}
			return "Datos vacios";
	}
	
	public boolean verifiIfLoginAdmin(String[] datos) {
		if(datos[0].equals("Admin") && datos[1].equals("jeje")) {
			return true;
		}else {
			return false;
		}
		
	}

}
