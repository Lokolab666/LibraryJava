package edu.uptc.logic;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ManageLibro {
	private ArrayList<Libro> libroML;
	
	public ManageLibro(){
		libroML = new ArrayList<Libro>();
		loadDataLibro();
	}
	
	private void loadDataLibro(){
		Libro libroL = new Libro("0-495-11243-7", "Fisica para Ciencias e Ingenier�a", "Raymond A. Serwey", Genero.Ingenieria , new Date(), 
				4, 15, 2040);
		libroML.add(libroL);
		libroL = new Libro("9706866523", "Calculo de Varias Variables: Trascendentes Tempranas", "James Stewart", Genero.Aventura , new Date(), 
				6, 12, 1500);
		libroML.add(libroL);
	}
	
	public String createLibro(String[] dataL) {
		if (!dataL[0].equals("") && !dataL[1].equals("") && !dataL[2].equals("") && !dataL[5].equals("") && !dataL[6].equals("")
				&& !dataL[7].equals("")) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaPublicacion;
			try {
				fechaPublicacion = simpleDateFormat.parse(dataL[4]);
				Libro libro = new Libro(dataL[0], dataL[1], dataL[2], Genero.valueOf(dataL[3]), fechaPublicacion, Integer.parseInt(dataL[5]), 
						Integer.parseInt(dataL[6]), Double.parseDouble(dataL[7]));
				libroML.add(libro);
			}catch (ParseException e) {
				e.printStackTrace();
			}
			return "El libro ha sido guardado";
		} else {
			return "Error, hay datos sin llenar";
		}
	}
	
	public String[][] viewDataL(){
		String[][] dataL = new String[libroML.size()][8];
		for (int i = 0; i < libroML.size(); i++) {
			dataL[i][0] = libroML.get(i).getISBN();
			dataL[i][1] = libroML.get(i).getNombreL();
			dataL[i][2] = libroML.get(i).getAutorL();
			dataL[i][3] = "" + libroML.get(i).getTipoGenero();
			dataL[i][4] = "" + libroML.get(i).getFechaPublicacionL();
			dataL[i][5] = "" + libroML.get(i).getCopiasL();
			dataL[i][6] = "" + libroML.get(i).getCalificacionEdadL();
			dataL[i][7] = "" + libroML.get(i).getPrecioMultaL();
			
		}
		return dataL;
	}
	
	public String deleteLibro(String posicionEliminar) {
		if (Integer.parseInt(posicionEliminar) >= libroML.size()) {
			return "El libro no existe";
		} else {
			libroML.remove(Integer.parseInt(posicionEliminar));
			return "El libro ha sido eliminado";
		}
	}
	
	public String modifyLibro(String[] entryLibro) {
		System.out.println(entryLibro[1] + "posicion 1");
		System.out.println(entryLibro[2] + "posicion 2");
		System.out.println(entryLibro[3] + "posicion 3");
		System.out.println(entryLibro[4] + "posicion 4");
		System.out.println(entryLibro[5] + "posicion 5");
		System.out.println(entryLibro[6] + "posicion 6");
		//System.out.println(entryLibro[7] + "posicion 7");
		
		int position = buscarPosition(entryLibro[0]);
		if (position != -1) {
			libroML.get(position).setNombreL(entryLibro[1]);
			libroML.get(position).setAutorL(entryLibro[2]);
			libroML.get(position).setTipoGenero(Genero.valueOf(entryLibro[3]));
			libroML.get(position).setCopiasL(Integer.parseInt(entryLibro[5]));
			libroML.get(position).setCalificacionEdadL(Integer.parseInt(entryLibro[6]));
			libroML.get(position).setPrecioMultaL(Double.parseDouble(entryLibro[7]));
			return "Libro modificado correctamente";
		} else {
			return "Error al modificar el libro";
		}
		
	}

	public int buscarPosition(String ISBN) {
		for (int i = 0; i < libroML.size(); i++) {
			if (libroML.get(i).getISBN().equals(ISBN)) {
				return i;
			}
		}
		return -1;
	}
	
	public ArrayList<Libro> getLibroML(){
		return libroML;
	}
	
	public String buscarLibroPrestamo(String[] buscarLibroISBN) {
		if (!buscarLibroISBN[0].equals("")) {
			if (verificarLibroISBN(buscarLibroISBN) == true) {
				return "Libro encontrado, generando prestamo";
			}
		} else {
			return "Hay espacios vacios";
		}
		return "Ha ocurrido un error";
	}

	public boolean verificarLibroISBN(String[] buscarLibroISBN) {
		for (int i = 0; i < libroML.size(); i++) {
			if (buscarLibroISBN[0].equals(libroML.get(i).getISBN())) {
				return true;
			}
		}
		return false;
	}
	








}
