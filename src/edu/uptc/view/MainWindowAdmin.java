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

public class MainWindowAdmin extends JPanel{
	private JLabel cabecera;
	private JButton buttonEmpleadoAdmin;
	private JButton buttonLibroAdmin;
	
	public MainWindowAdmin() {
		setBorder(new TitledBorder("Inicio"));
		setLayout(null);
		
		initialize();
		style();
		aggregate();
	}

	private void style() {
		buttonEmpleadoAdmin.setFont(new Font("Arsenal", Font.BOLD,14));
		buttonEmpleadoAdmin.setForeground(Color.WHITE);
		buttonEmpleadoAdmin.setBackground(new Color(6,136,47));
		
		buttonLibroAdmin.setFont(new Font("Arsenal", Font.BOLD,14));
		buttonLibroAdmin.setForeground(Color.WHITE);
		buttonLibroAdmin.setBackground(new Color(6,136,47));
	}

	private void aggregate() {
		add(buttonEmpleadoAdmin);
		add(buttonLibroAdmin);
		add(cabecera);
		
	}

	private void initialize() {
		cabecera = new JLabel("");
		Image plantilla = new ImageIcon(getClass().getResource("/cabecera2.png")).getImage();
		cabecera.setIcon(new ImageIcon(plantilla));
		cabecera.setBounds(0,20,1200,50);
		
		buttonEmpleadoAdmin = new JButton("Empleados");
		buttonEmpleadoAdmin.setBounds(900,19,120,50);
				
		buttonLibroAdmin = new JButton("Libros");
		buttonLibroAdmin.setBounds(1020,19,120,50);
	}
	
	public void actionsMWA(Controller controller) {
		buttonEmpleadoAdmin.setActionCommand(Action.EMPLEADOSMWA);
		buttonLibroAdmin.setActionCommand(Action.LIBROSMWA);
		buttonEmpleadoAdmin.addActionListener(controller);
		buttonLibroAdmin.addActionListener(controller);
	}

	public JButton getButtonEmpleadoAdmin() {
		return buttonEmpleadoAdmin;
	}

	public JButton getButtonLibroAdmin() {
		return buttonLibroAdmin;
	}
	
	
}
