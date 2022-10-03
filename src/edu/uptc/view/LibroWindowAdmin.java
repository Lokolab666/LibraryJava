package edu.uptc.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Controller;

public class LibroWindowAdmin extends JPanel{
	private JButton buttonCrearLibroLWA;
	private JButton buttonVerLibroLWA;
	
	public LibroWindowAdmin() {
		setBorder(new TitledBorder("Libro"));
		setLayout(null);
		setBackground(new Color(6,136,47));
		
		initialize();
		style();
		aggregate();
	}
	
	private void aggregate() {
		add(buttonCrearLibroLWA);
		add(buttonVerLibroLWA);
		
		
	}

	private void style() {
		buttonCrearLibroLWA.setFont(new Font("Arsenal", Font.BOLD,14));
		buttonCrearLibroLWA.setForeground(Color.WHITE);
		buttonCrearLibroLWA.setBackground(new Color(6,136,47));
		
		buttonVerLibroLWA.setFont(new Font("Arsenal", Font.BOLD,14));
		buttonVerLibroLWA.setForeground(Color.WHITE);
		buttonVerLibroLWA.setBackground(new Color(6,136,47));
	}

	private void initialize() {
		buttonCrearLibroLWA = new JButton("Nuevo");
		buttonCrearLibroLWA.setBounds(20,40,120,50);
		
		buttonVerLibroLWA = new JButton("Ver");
		buttonVerLibroLWA.setBounds(20,100,120,50);
		
	}
	
	public void actionsLWA(Controller controller) {
		buttonCrearLibroLWA.setActionCommand(Action.CREARLIBRO);
		buttonVerLibroLWA.setActionCommand(Action.VERLIBRO);
		buttonCrearLibroLWA.addActionListener(controller);
		buttonVerLibroLWA.addActionListener(controller);
	}

	public JButton getButtonCrearLibroLWA() {
		return buttonCrearLibroLWA;
	}

	public JButton getButtonVerLibroLWA() {
		return buttonVerLibroLWA;
	}
	
	
}
