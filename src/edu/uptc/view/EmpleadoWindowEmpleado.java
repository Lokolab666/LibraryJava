package edu.uptc.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Controller;

public class EmpleadoWindowEmpleado extends JPanel{
	private JButton botonCrearUsuarioEWE;
	private JButton botonVerUsuarioEWE;
	
	//Prueba
	private JButton botonCrearPrestamoEWE;
	private JButton botonVerPrestamoEWE;
	
	public EmpleadoWindowEmpleado() {
		setBorder(new TitledBorder("Usuario"));
		setLayout(null);
		setBackground(new Color(218,18,26));
		
		initialize();
		style();
		aggregate();
	}

	private void aggregate() {
		add(botonCrearUsuarioEWE);
		add(botonVerUsuarioEWE);
		
		//PRUEBA
		add(botonCrearPrestamoEWE);
		add(botonVerPrestamoEWE);
	}

	private void style() {
		botonCrearUsuarioEWE.setFont(new Font("Arsenal", Font.BOLD,14));
		botonCrearUsuarioEWE.setForeground(Color.WHITE);
		botonCrearUsuarioEWE.setBackground(new Color(218,18,26));
		
		botonVerUsuarioEWE.setFont(new Font("Arsenal", Font.BOLD,14));
		botonVerUsuarioEWE.setForeground(Color.WHITE);
		botonVerUsuarioEWE.setBackground(new Color(218,18,26));
		
		//PRUEBA
		botonCrearPrestamoEWE.setFont(new Font("Arsenal", Font.BOLD,14));
		botonCrearPrestamoEWE.setForeground(Color.WHITE);
		botonCrearPrestamoEWE.setBackground(new Color(218,18,26));
		
		botonVerPrestamoEWE.setFont(new Font("Arsenal", Font.BOLD,14));
		botonVerPrestamoEWE.setForeground(Color.WHITE);
		botonVerPrestamoEWE.setBackground(new Color(218,18,26));
		
		
	}

	private void initialize() {
		botonCrearUsuarioEWE = new JButton("Nuevo");
		botonCrearUsuarioEWE.setBounds(20,40,120,50);
		
		botonVerUsuarioEWE = new JButton("Ver");
		botonVerUsuarioEWE.setBounds(20,100,120,50);
		
		//PRUEBA
		
		botonCrearPrestamoEWE = new JButton("Nuevo P");
		botonCrearPrestamoEWE.setBounds(20,40,120,50);
		
		botonVerPrestamoEWE = new JButton("Ver P");
		botonVerPrestamoEWE.setBounds(20,100,120,50);
		
	}
	
	public void actionsEWE(Controller controller) {
		botonCrearUsuarioEWE.setActionCommand(Action.CREARUSUARIO);
		botonVerUsuarioEWE.setActionCommand(Action.VERUSUARIO);
		botonCrearUsuarioEWE.addActionListener(controller);
		botonVerUsuarioEWE.addActionListener(controller);
		
		//PRUEBA
		botonCrearPrestamoEWE.setActionCommand(Action.CREARPRESTAMO);
		botonVerPrestamoEWE.setActionCommand(Action.VERPRESTAMO);
		botonCrearPrestamoEWE.addActionListener(controller);
		botonVerPrestamoEWE.addActionListener(controller);
	}

	public JButton getBotonCrearUsuarioEWE() {
		return botonCrearUsuarioEWE;
	}

	public JButton getBotonVerUsuarioEWE() {
		return botonVerUsuarioEWE;
	}

	public JButton getBotonCrearPrestamoEWE() {
		return botonCrearPrestamoEWE;
	}

	public JButton getBotonVerPrestamoEWE() {
		return botonVerPrestamoEWE;
	}
	
	
}
