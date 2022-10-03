package edu.uptc.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ManagePrestamo {
	private ArrayList<Prestamo> prestamoMP;
	
	public ManagePrestamo() {
		prestamoMP = new ArrayList<Prestamo>();
		loadData();
	}

	private void loadData() {
		Date fechaPrestamo  = new Date();
		String fechaP = "28/08/2020";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			fechaPrestamo = simpleDateFormat.parse(fechaP);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Prestamo prestamoP = new Prestamo("0-495-11243-7", "Alejo", fechaPrestamo);
		prestamoMP.add(prestamoP);
	}
	
	public String createPrestamo(String[] dataPrestamo) {
		System.out.println(dataPrestamo[0] + "0");
		System.out.println(dataPrestamo[1] + "1");
		System.out.println(dataPrestamo[2] + "2");
		
		if (!dataPrestamo[0].equals("") && !dataPrestamo[1].equals("")) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaPrestamoP;
			try {
				fechaPrestamoP = simpleDateFormat.parse(dataPrestamo[2]);
				Prestamo prestamoP = new Prestamo(dataPrestamo[0], dataPrestamo[1], fechaPrestamoP);
				prestamoMP.add(prestamoP);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return "El prestamo ha sido creado";
		} else {
			return "Error, no hay datos";
		}
	}
	
	public String[][] viewDataPrestamo(){
		String[][] dataPrestamo = new String[prestamoMP.size()][4];
		
	/*	VER 8 DIAS DE MAS
	 * if (condition) {
			
		} else {

		}*/
		for (int i = 0; i < dataPrestamo.length; i++) {
			dataPrestamo[i][0] = prestamoMP.get(i).getISBN();
			dataPrestamo[i][1] = prestamoMP.get(i).getUsuarioPrestamo();
			dataPrestamo[i][2] = "" + prestamoMP.get(i).getFechaPrestamo();
		}
		return dataPrestamo;
	}
	
	
}
