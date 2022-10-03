package edu.uptc.view;

import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import edu.uptc.control.Controller;
import edu.uptc.logic.Genero;

public class CreateLibro extends JPanel{
	private JTextField cajaISBN;
	private JLabel textoISBN;
	private JTextField cajaTitulo;
	private JLabel textoTitulo;
	private JTextField cajaAutor;
	private JLabel textoAutor;
	private JComboBox<String> cajaGenero;
	private JLabel textoGenero;
	private JTextField cajaCopias;
	private JLabel textoCopias;
	private JButton buttonEnviarCL;
	private JDateChooser anioPublicacionCL;
	private JLabel textoAniooPublicacionCL;
	private JButton buttonModificarCL;
	private JTextField cajaCalificacionEdadCL;
	private JLabel textoCalificacionEdadCL;
	private JTextField cajaPrecioCL;
	private JLabel textoPrecioCL;
	
	//PRUEBA, dejar sin editar el valor de la multa
	private JLabel textoBusquedaUsuario;
	private JTextField cajaBusquedaUsuario;
	private JButton botonBusquedaUsuario;
	
	private JDateChooser fechaInicioPrestamo;
	private JLabel textoFechaPrestamo;
	private JButton botonCrearPrestamo;
	
	public CreateLibro() {
		setBorder(new TitledBorder("Crear Libro"));
		setLayout(null);
		
		initialize();
		aggregate();
		
	}

	private void aggregate() {
		add(cajaISBN);
		add(textoISBN);
		add(cajaTitulo);
		add(textoTitulo);
		add(cajaAutor);
		add(textoAutor);
		add(cajaGenero);
		add(cajaCopias);
		add(textoGenero);
		add(textoCopias);
		add(textoCalificacionEdadCL);
		add(cajaCalificacionEdadCL);
		add(textoPrecioCL);
		add(cajaPrecioCL);
		add(buttonEnviarCL);
		add(anioPublicacionCL);
		add(textoAniooPublicacionCL);
		add(buttonModificarCL);
		
		//PRUEBA
		
		add(textoBusquedaUsuario);
		add(cajaBusquedaUsuario);
		
		add(botonBusquedaUsuario);
		add(textoFechaPrestamo);
		add(fechaInicioPrestamo);
		add(botonCrearPrestamo);
	}

	private void initialize() {
		textoISBN = new JLabel("ISBN");
		textoISBN.setBounds(80,100,80,30);
		cajaISBN = new JTextField();
		cajaISBN.setBounds(190,100,140,25);
		
		textoTitulo = new JLabel("T�tulo");
		textoTitulo.setBounds(420,100,60,30);
		cajaTitulo = new JTextField();
		cajaTitulo.setBounds(520,100,140,25);
		
		textoAutor = new JLabel("Autor");
		textoAutor.setBounds(420,150,60,30);
		cajaAutor = new JTextField();
		cajaAutor.setBounds(520,150,140,25);
		
		textoGenero = new JLabel("G�nero");
		textoGenero.setBounds(80,205,60,30);
		cajaGenero = new JComboBox<String>(); 
		cajaGenero.setModel(new DefaultComboBoxModel(Genero.values()));
		cajaGenero.setBounds(190,205,140,25);
		
		textoCopias = new JLabel("Copias");
		textoCopias.setBounds(420,205,90,30);
		cajaCopias = new JTextField();
		cajaCopias.setBounds(520,205,100,25);
		
		textoCalificacionEdadCL = new JLabel("Cal. Edad");
		textoCalificacionEdadCL.setBounds(310,250,90,30);
		cajaCalificacionEdadCL = new JTextField();
		cajaCalificacionEdadCL.setBounds(420,250,100,25);
		
		textoPrecioCL = new JLabel("Valor Multa");
		textoPrecioCL.setBounds(80,250,90,30);
		cajaPrecioCL = new JTextField();
		cajaPrecioCL.setBounds(190,250,100,25);
		
		buttonEnviarCL = new JButton("Crear");
		buttonEnviarCL.setBounds(320,300,100,25);
		buttonModificarCL = new JButton("Modificar");
		buttonModificarCL.setBounds(320,300,100,25);
		
		textoAniooPublicacionCL = new JLabel("Fecha Publicaci�n");
		textoAniooPublicacionCL.setBounds(80,150,120,30);
		anioPublicacionCL = new JDateChooser("dd/MM/yyyy","##/##/####", '_' );
		anioPublicacionCL.setBounds(190,150,140,25);
		
		//PRUEBA
		textoBusquedaUsuario = new JLabel("Buscar Usuario");
		textoBusquedaUsuario.setBounds(80,50,120,30);
		cajaBusquedaUsuario = new JTextField();
		cajaBusquedaUsuario.setBounds(190,50,140,25);
		
		botonBusquedaUsuario = new JButton("Buscar");
		botonBusquedaUsuario.setBounds(420,50,100,25);
		
		textoFechaPrestamo = new JLabel("Inicio Prestamo");
		textoFechaPrestamo.setBounds(80,150,120,30);
		
		fechaInicioPrestamo = new JDateChooser("dd/MM/yyyy","##/##/####", '_');
		fechaInicioPrestamo.setBounds(190,150,140,25);
		
		botonCrearPrestamo = new JButton("Crear Pres");
		botonCrearPrestamo.setBounds(320,300,100,25);
	}
	
	public void actionCL(Controller controller) {
		buttonEnviarCL.setActionCommand(Action.CREARLIBROVENTANA);
		buttonEnviarCL.addActionListener(controller);
		buttonModificarCL.setActionCommand(Action.MODICIAR_LIBRO);
		buttonModificarCL.addActionListener(controller);
		
		botonBusquedaUsuario.setActionCommand(Action.BUSCARUSUARIOPRESTAMO);
		botonCrearPrestamo.setActionCommand(Action.CREARPRESTAMOUSUARIO);
		botonBusquedaUsuario.addActionListener(controller);
		botonCrearPrestamo.addActionListener(controller);
		
		
	}

	public JTextField getCajaISBN() {
		return cajaISBN;
	}

	public JLabel getTextoISBN() {
		return textoISBN;
	}

	public JTextField getCajaTitulo() {
		return cajaTitulo;
	}

	public JLabel getTextoTitulo() {
		return textoTitulo;
	}

	public JTextField getCajaAutor() {
		return cajaAutor;
	}

	public JLabel getTextoAutor() {
		return textoAutor;
	}

	public JComboBox<String> getCajaGenero() {
		return cajaGenero;
	}

	public JLabel getTextoGenero() {
		return textoGenero;
	}

	public JTextField getCajaCopias() {
		return cajaCopias;
	}

	public JLabel getTextoCopias() {
		return textoCopias;
	}

	public JButton getButtonEnviarCL() {
		return buttonEnviarCL;
	}

	public JDateChooser getanioPublicacionCL() {
		return anioPublicacionCL;
	}

	public JLabel gettextoAniooPublicacionCL() {
		return textoAniooPublicacionCL;
	}

	public JButton getButtonModificarCL() {
		return buttonModificarCL;
	}

	public JTextField getCajaCalificacionEdadCL() {
		return cajaCalificacionEdadCL;
	}

	public JLabel getTextoCalificacionEdadCL() {
		return textoCalificacionEdadCL;
	}

	public JTextField getCajaPrecioCL() {
		return cajaPrecioCL;
	}

	public JLabel getTextoPrecioCL() {
		return textoPrecioCL;
	}

	public JLabel getTextoBusquedaUsuario() {
		return textoBusquedaUsuario;
	}

	public JTextField getCajaBusquedaUsuario() {
		return cajaBusquedaUsuario;
	}

	public JButton getBotonBusquedaUsuario() {
		return botonBusquedaUsuario;
	}

	public JDateChooser getFechaInicioPrestamo() {
		return fechaInicioPrestamo;
	}

	public JLabel getTextoFechaPrestamo() {
		return textoFechaPrestamo;
	}

	public JButton getBotonCrearPrestamo() {
		return botonCrearPrestamo;
	}

	

	
	
}


