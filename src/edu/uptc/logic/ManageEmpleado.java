package edu.uptc.logic;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;

public class ManageEmpleado {
	private ArrayList<Empleado> empleadoME;
	
	public ManageEmpleado() {
		empleadoME = new ArrayList<Empleado>();
		loadData();
	}

	private void loadData() {
		Date fechaNacimientoCristian = new Date();
		String fecha = "24/09/1999";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			fechaNacimientoCristian = simpleDateFormat.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Empleado empleadoMe = new Empleado("Cristian", "Fandiño", "3204160870", fechaNacimientoCristian, "CristianF", "1234");
		empleadoME.add(empleadoMe);
	}
	
	public String createEmpleado(String[] dataME) {
		if (!dataME[0].equals("") && !dataME[1].equals("") && !dataME[2].equals("") && !dataME[4].equals("") && !dataME[5].equals("") ) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaNacimiento;
			try {
				fechaNacimiento = simpleDateFormat.parse(dataME[3]);
				Empleado empleadoMe = new Empleado(dataME[0], dataME[1], dataME[2], fechaNacimiento, dataME[4], dataME[5]);
				int edad = Period.between(fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()).getYears();
				if (edad < 18) {
					return "El empleado es menor de edad";
				} else {
					empleadoME.add(empleadoMe);
					return "El empleado ha sido creado";
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return "Hubo un problema al registrar";
		} else {
			return "Error, existen datos sin llenar";
		}
	}
	
	public String[][] viewData(){
		String[][] dataME = new String[empleadoME.size()][6];
		for (int i = 0; i < empleadoME.size(); i++) {
			dataME[i][0] = empleadoME.get(i).getNombresE();
			dataME[i][1] = empleadoME.get(i).getApellidosE();
			dataME[i][2] = empleadoME.get(i).getTelefonoE();
			dataME[i][3] = empleadoME.get(i).getFechaNacimientoE();
			dataME[i][4] = empleadoME.get(i).getUsuarioE();
			dataME[i][5] = empleadoME.get(i).getContrasenaE();
		}
		return dataME;
	}
	
	public String deleteEmpleado(String posicionEmpleado) {
		if (Integer.parseInt(posicionEmpleado) >= empleadoME.size()) {
			return "El empleado no existe";
		} else {
			empleadoME.remove(Integer.parseInt(posicionEmpleado));
			return "El empleado se ha eliminado";
		}
	}
	
	public String modifyEmpleado(String[] entry) {
		int posicionEntry = searchP(entry[0]);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		if (posicionEntry != -1) {
			try {
				empleadoME.get(posicionEntry).setNombresE(entry[0]);
				empleadoME.get(posicionEntry).setApellidosE(entry[1]);
				empleadoME.get(posicionEntry).setTelefonoE(entry[2]);
				empleadoME.get(posicionEntry).setFechaNacimientoE(simpleDateFormat.parse(entry[3]));
				empleadoME.get(posicionEntry).setUsuarioE(entry[4]);
				empleadoME.get(posicionEntry).setContrasenaE(entry[5]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return "El empleado ha sido modificado";
			
		} else {
			return "Error, no se ha logrado modificar";
		}
	}

	public int searchP(String nombre) {
		for (int i = 0; i < empleadoME.size(); i++) {
			if (empleadoME.get(i).getNombresE().equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
	
	public void verifyData() {
		for (int i = 0; i < empleadoME.size(); i++) {
			System.out.println(empleadoME.get(i).toString());
		}
	}
	
	public ArrayList<Empleado> getEmpleadoME(){
		return empleadoME;
	}
	
	public String buscarUserCon(String[] datosLl) {
			if (!datosLl[0].equals("") && !datosLl[1].equals("")) {
				if (verificarDatosAdmin(datosLl) == true) {
					return "Empleado encontrado";
				}
			} 	else {
				return "Datos vacios";
			}
		return "Empleado no encontrado";
	}

	public boolean verificarDatosAdmin(String[] datos) {
		for (int i = 0; i < empleadoME.size(); i++) {
			if (datos[0].equals(empleadoME.get(i).getUsuarioE()) && datos[1].equals(empleadoME.get(i).getContrasenaE())) {
				return true;
			}
		}
		return false;
	}
	
	
}
