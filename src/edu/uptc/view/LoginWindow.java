package edu.uptc.view;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import edu.uptc.control.Controller;

public class LoginWindow extends JPanel{
	private JLabel textUsser;
	private JTextField cajaUsuario;
	private JLabel textoPassword;
	private JPasswordField cajaPassword;
	private JButton buttonSend;
	private JButton buttonCancel;
	
	public LoginWindow() {

		setBorder(new TitledBorder("Iniciar Sesión"));
		setLayout(null);
		
		initialize();
		aggregate();
	}

	private void aggregate() {
		add(textUsser);
		add(cajaUsuario);
		add(textoPassword);
		add(cajaPassword);
		add(buttonSend);
		add(buttonCancel);
	}

	private void initialize() {
		textUsser = new JLabel("Usuario");
		textUsser.setBounds(40,40,60,30);
		cajaUsuario = new JTextField();
		cajaUsuario.setBounds(140,40,120,25);
		
		textoPassword = new JLabel("Contraseña");
		textoPassword.setBounds(40,80,100,30);
		cajaPassword = new JPasswordField();
		cajaPassword.setBounds(140,80,120,25);
		
		buttonSend = new JButton("Enviar");
		buttonSend.setBounds(80,120,100,25);
		buttonCancel = new JButton("Cancelar");
		buttonCancel.setBounds(200,120,100,25);
	}
	
	public void actions(Controller controller) {
		buttonSend.setActionCommand(Action.INICIARSESION);
		buttonCancel.setActionCommand(Action.CANCELARSESION);
		buttonCancel.addActionListener(controller);
		buttonSend.addActionListener(controller);
	}
	
	public JTextField getCajaUsuario() {
		return cajaUsuario;
	}
	
	public JTextField getCajaPassword() {
		return cajaPassword;
	}
	
	public JButton getButtonSend() {
		return buttonSend;
	}
	
	public JButton getButtonCancel() {
		return buttonCancel;
	}
	
}
