package edu.uptc.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Controller;

public class EmpleadoWindowAdmin extends JPanel{
	private JButton buttonCrearEmpleadoEWA;
	private JButton buttonVerEmpleadoEWA;
	
	public EmpleadoWindowAdmin() {
		setBorder(new TitledBorder("Empleado"));
		setLayout(null);
		setBackground(new Color(6,136,47));
		
		initialize();
		style();
		aggregate();
	}

	private void aggregate() {
		add(buttonCrearEmpleadoEWA);
		add(buttonVerEmpleadoEWA);
		
		
	}

	private void style() {
		buttonCrearEmpleadoEWA.setFont(new Font("Arsenal", Font.BOLD,14));
		buttonCrearEmpleadoEWA.setForeground(Color.WHITE);
		buttonCrearEmpleadoEWA.setBackground(new Color(6,136,47));
		
		buttonVerEmpleadoEWA.setFont(new Font("Arsenal", Font.BOLD,14));
		buttonVerEmpleadoEWA.setForeground(Color.WHITE);
		buttonVerEmpleadoEWA.setBackground(new Color(6,136,47));
	}

	private void initialize() {
		buttonCrearEmpleadoEWA = new JButton("Nuevo");
		buttonCrearEmpleadoEWA.setBounds(20,40,120,50);
		
		buttonVerEmpleadoEWA = new JButton("Ver");
		buttonVerEmpleadoEWA.setBounds(20,100,120,50);
		
	}
	
	public void actionsEWA(Controller controller) {
		buttonCrearEmpleadoEWA.setActionCommand(Action.CREAREMPLEADO);
		buttonVerEmpleadoEWA.setActionCommand(Action.VEREMPLEADO);
		buttonCrearEmpleadoEWA.addActionListener(controller);
		buttonVerEmpleadoEWA.addActionListener(controller);
	}

	public JButton getButtonCrearEmpleadoEWA() {
		return buttonCrearEmpleadoEWA;
	}

	public JButton getButtonVerEmpleadoEWA() {
		return buttonVerEmpleadoEWA;
	}
	
	
	
}
