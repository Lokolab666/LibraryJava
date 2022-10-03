package edu.uptc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Controller;

public class SelectRol extends JPanel{

	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	
	
	
	public SelectRol() {
		setLayout(new GridLayout(1,3));
		setBorder(new TitledBorder("Seleccione su rol"));
		
		initialize();
		aggregate();
		style();
		
	}

	private void initialize() {
		Image jImageAdmin = new ImageIcon(getClass().getResource("/admin.png")).getImage();
		Image jImageEmployer = new ImageIcon(getClass().getResource("/empleado.png")).getImage();
		Image jImageUser = new ImageIcon(getClass().getResource("/user.png")).getImage();
		
		jButton1 = new JButton(new ImageIcon(jImageAdmin));
		jButton2  = new JButton(new ImageIcon(jImageEmployer));
		jButton3 = new JButton(new ImageIcon(jImageUser));
		
	}

	public void actionsR(Controller controller) {
		jButton1.setActionCommand(Action.INICIARADMINISTRADOR);
		jButton1.addActionListener(controller);
		
		jButton2.setActionCommand(Action.INICIAREMPLEADO);
		jButton2.addActionListener(controller);
		
		jButton3.setActionCommand(Action.INICIARUSUARIO);
		jButton3.addActionListener(controller);
	}
	
	private void style() {
		jButton1.setFont(new Font("Arsenal",Font.BOLD, 23));
		jButton1.setForeground(Color.BLACK);
		jButton1.setBackground(Color.WHITE);
		
		jButton2.setFont(new Font("Arsenal",Font.BOLD, 23));
		jButton2.setForeground(Color.BLACK);
		jButton2.setBackground(Color.WHITE);
		
		jButton3.setFont(new Font("Arsenal",Font.BOLD, 23));
		jButton3.setForeground(Color.BLACK);
		jButton3.setBackground(Color.WHITE);
	}
	
	
	private void aggregate() {
		add(jButton1);
		add(jButton2);
		add(jButton3);
	}

	public JButton getjButton1() {
		return jButton1;
	}

	public JButton getjButton2() {
		return jButton2;
	}

	public JButton getjButton3() {
		return jButton3;
	}

	
	
	
	
}
