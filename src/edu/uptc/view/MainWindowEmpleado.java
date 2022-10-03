package edu.uptc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Controller;

public class MainWindowEmpleado extends JPanel{

	private JLabel cabecera;
	private JButton botonUsuarioAdmin;
	private JButton botonPrestamo;
	
	public MainWindowEmpleado() {
		setBorder(new TitledBorder("Inicio"));
		setLayout(null);
		
		initialize();
		style();
		aggregate();
	}

	private void aggregate() {
		add(botonUsuarioAdmin);
		add(botonPrestamo);
		add(cabecera);
	}

	private void style() {
		botonUsuarioAdmin.setFont(new Font("Arsenal", Font.BOLD,14));
		botonUsuarioAdmin.setForeground(Color.WHITE);
		botonUsuarioAdmin.setBackground(new Color(218,18,26));
		
		botonPrestamo.setFont(new Font("Arsenal", Font.BOLD,14));
		botonPrestamo.setForeground(Color.WHITE);
		botonPrestamo.setBackground(new Color(218,18,26));
		
	}

	private void initialize() {
		cabecera = new JLabel("");
		Image plantilla = new ImageIcon(getClass().getResource("/cabecera3.png")).getImage();
		cabecera.setIcon(new ImageIcon(plantilla));
		cabecera.setBounds(0,20,1200,50);
		
		botonUsuarioAdmin = new JButton("Empleados");
		botonUsuarioAdmin.setBounds(900,19,120,50);
				
		botonPrestamo = new JButton("Prestamos");
		botonPrestamo.setBounds(1020,19,120,50);
		
	}
	
	public void actionsMWE(Controller controller) {
		botonUsuarioAdmin.setActionCommand(Action.USUARIOMWE);
		botonPrestamo.setActionCommand(Action.PRESTAMOWE);
		botonUsuarioAdmin.addActionListener(controller);
		botonPrestamo.addActionListener(controller);
		
	}

	public JButton getBotonUsuarioAdmin() {
		return botonUsuarioAdmin;
	}

	public JButton getBotonPrestamo() {
		return botonPrestamo;
	}
	
}
