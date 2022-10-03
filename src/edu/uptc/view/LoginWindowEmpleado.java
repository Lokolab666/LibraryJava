package edu.uptc.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Controller;

public class LoginWindowEmpleado extends JPanel{
	private JLabel textoUsuario;
	private JTextField cajaUsuarioL;
	private JLabel textoContrasena;
	private JPasswordField cajaContrasena;
	private JButton botonEnviar;
	private JButton botonCancelar;
	
	public LoginWindowEmpleado(){
		setBorder(new TitledBorder("Iniciar Sesión"));
		setLayout(null);
		
		initialize();
		aggregate();
	}

	private void aggregate() {
		add(textoUsuario);
		add(cajaUsuarioL);
		add(textoContrasena);
		add(cajaContrasena);
		add(botonEnviar);
		add(botonCancelar);
		
	}

	private void initialize() {
		textoUsuario = new JLabel("Usuario");
		textoUsuario.setBounds(40,40,60,30);
		cajaUsuarioL = new JTextField();
		cajaUsuarioL.setBounds(140,40,120,25);
		
		textoContrasena = new JLabel("Contraseña");
		textoContrasena.setBounds(40,80,100,30);
		cajaContrasena = new JPasswordField();
		cajaContrasena.setBounds(140,80,120,25);
		
		botonEnviar = new JButton("Enviar");
		botonEnviar.setBounds(80,120,100,25);
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(200,120,100,25);
		
	}
	
	public void actionsLWE(Controller controller) {
		botonEnviar.setActionCommand(Action.INICIARSESIONEMPLEADO);
		botonCancelar.setActionCommand(Action.CANCELARSESIONEMPLEADO);
		botonCancelar.addActionListener(controller);
		botonEnviar.addActionListener(controller);
	}

	public JTextField getCajaUsuarioL() {
		return cajaUsuarioL;
	}

	public JPasswordField getCajaContrasena() {
		return cajaContrasena;
	}

	public JButton getBotonEnviar() {
		return botonEnviar;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}
	
	
}
