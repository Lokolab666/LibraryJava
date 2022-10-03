package edu.uptc.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ManageUsuario {
	private ArrayList<Usuario> usuarioMU;
	
	public ManageUsuario() {
		usuarioMU = new ArrayList<Usuario>();
		loadData();
	}

	private void loadData() {
		Date fechaNacimientoAlejandro = new Date();
		String fecha = "26/02/2000";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			fechaNacimientoAlejandro = simpleDateFormat.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Usuario usuarioU = new Usuario("Alejandro", "Mesa", "3006396052", fechaNacimientoAlejandro, Ciudad.Restrepo, Departamento.Meta, "Alejo", "0000");
		usuarioMU.add(usuarioU);
		usuarioU = new Usuario("Valentina", "Martinez", "3204160712", fechaNacimientoAlejandro, Ciudad.Acacias, Departamento.Cundinamarca, "Nico", "Nica");
		usuarioMU.add(usuarioU);
	}
	
	public String createUsuario(String[] dataU) {
		if (!dataU[0].equals("") && !dataU[1].equals("") && !dataU[2].equals("") && !dataU[6].equals("") && !dataU[7].equals("")) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaNacimientoUsuario;
			try {
				fechaNacimientoUsuario = simpleDateFormat.parse(dataU[3]);
				Usuario usuarioU = new Usuario(dataU[0], dataU[1], dataU[2], fechaNacimientoUsuario, Ciudad.valueOf(dataU[4]), Departamento.valueOf(dataU[5]), 
						dataU[6], dataU[7]);
				usuarioMU.add(usuarioU);
			}catch (ParseException e) {
				e.printStackTrace();
			}
			return "El usuario ha sido guardado";
		} else {
			return "Error, hay datos sin llenar";
		}
	}
	
	public String[][] viewDataU(){
		String[][] dataU = new String[usuarioMU.size()][8];
		for (int i = 0; i < usuarioMU.size(); i++) {
			dataU[i][0] = usuarioMU.get(i).getNombresU();
			dataU[i][1] = usuarioMU.get(i).getApellidosU();
			dataU[i][2] = usuarioMU.get(i).getTelefonoU();
			dataU[i][3] = usuarioMU.get(i).getFechaNacimientoU();
			dataU[i][4] = "" + usuarioMU.get(i).getCiudadU();
			dataU[i][5] = "" + usuarioMU.get(i).getDepartamentoU();
			dataU[i][6] = usuarioMU.get(i).getUsuarioU();
			dataU[i][7] = usuarioMU.get(i).getContrasenaU();
		}
		return dataU;
	}
	
	public String deleteUsuario(String posicionEliminar) {
		if (Integer.parseInt(posicionEliminar) >= usuarioMU.size()) {
			return "El usuario no existe";
		} else {
			usuarioMU.remove(Integer.parseInt(posicionEliminar));
			return "El usuario ha sido eliminado";
		}
	}
	
	public String modifyUsuario(String[] entryUsuario) {
		int position = buscarPosition(entryUsuario[6]);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		if (position != -1) {
			try {
			usuarioMU.get(position).setNombresU(entryUsuario[0]);
			usuarioMU.get(position).setApellidosU(entryUsuario[1]);
			usuarioMU.get(position).setTelefonoU(entryUsuario[2]);
			usuarioMU.get(position).setFechaNacimientoU(simpleDateFormat.parse(entryUsuario[3]));
			usuarioMU.get(position).setCiudadU(Ciudad.valueOf(entryUsuario[4]));
			usuarioMU.get(position).setDepartamentoU(Departamento.valueOf(entryUsuario[5]));
			usuarioMU.get(position).setUsuarioU(entryUsuario[6]);
			usuarioMU.get(position).setContrasenaU(entryUsuario[7]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return "El usuario ha sido modificado";
		} else {
			return "Error, no se ha logrado modificar";
		}
	}

	public int buscarPosition(String string) {
		for (int i = 0; i < usuarioMU.size(); i++) {
			if (usuarioMU.get(i).getUsuarioU().equals(string)) {
				return i;
			}
		}
		return -1;
	}
	
	public String buscarUsuarioPrestamo(String[] usuarioPrestamo) {
		if (!usuarioPrestamo[0].equals("")) {
			if (verificarUsuario(usuarioPrestamo) == true) {
				return "Usuario encontrado";
			}
		} else {
			return "No ha escrito nada";
		}
		return "Usuario no encontrado";
	}
	
	
	public boolean verificarUsuario(String[] datos) {
		for (int i = 0; i < usuarioMU.size(); i++) {
			if (datos[0].equals(usuarioMU.get(i).getUsuarioU())) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Usuario> getUsuarioMU() {
		return usuarioMU;
	}	
	
}
