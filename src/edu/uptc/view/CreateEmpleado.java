package edu.uptc.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import edu.uptc.control.Controller;
import edu.uptc.logic.Ciudad;
import edu.uptc.logic.Departamento;

public class CreateEmpleado extends JPanel{
	private JTextField cajaNombres;
	private JLabel textoNombres;
	private JTextField cajaApellidos;
	private JLabel textoApellidos;
	private JTextField cajaTelefono;
	private JLabel textoTelefono;
	private JTextField cajaUsuarioCE;
	private JLabel textoUsuarioCE;
	private JPasswordField cajaPasswordCE;
	private JLabel textoPasswordCE;
	private JButton buttonEnviarCE;
	private JDateChooser calendarioCE;
	private JLabel textoCalendarioCE;
	private JButton buttonModificarCE;
	
	//Prueba
	private JLabel textoDepartamento;
	private JComboBox<String> cajaDepartamento;
	private JLabel textoCiudad;
	private JComboBox<String> cajaCiudad;
	private JButton botonEnviarUsuario;
	private JButton botonModificarUsuario;
	public CreateEmpleado() {
		setBorder(new TitledBorder("Crear Empleado"));
		setLayout(null);
		
		initialize();
		aggregate();
	}

	private void aggregate() {
		add(cajaNombres);
		add(textoNombres);
		add(cajaApellidos);
		add(textoApellidos);
		add(cajaTelefono);
		add(textoTelefono);
		add(cajaUsuarioCE);
		add(textoUsuarioCE);
		add(buttonEnviarCE);
		add(cajaPasswordCE);
		add(textoPasswordCE);
		add(calendarioCE);
		add(textoCalendarioCE);
		add(buttonModificarCE);
		
		
		add(textoDepartamento);
		add(cajaDepartamento);
		add(textoCiudad);
		add(cajaCiudad);
		add(botonEnviarUsuario);
		add(botonModificarUsuario);
	}

	private void initialize() {
		textoNombres = new JLabel("Nombres");
		textoNombres.setBounds(80,50,80,30);
		cajaNombres = new JTextField();
		cajaNombres.setBounds(190,50,140,25);
		
		textoApellidos = new JLabel("Apellidos");
		textoApellidos.setBounds(420,50,60,30);
		cajaApellidos = new JTextField();
		cajaApellidos.setBounds(520,50,140,25);
		
		textoTelefono = new JLabel("Teléfono");
		textoTelefono.setBounds(420,100,60,30);
		cajaTelefono = new JTextField();
		cajaTelefono.setBounds(520,100,140,25);
		
		textoUsuarioCE = new JLabel("Usuario");
		textoUsuarioCE.setBounds(80,155,60,30);
		cajaUsuarioCE = new JTextField();
		cajaUsuarioCE.setBounds(190,155,140,25);
		
		textoPasswordCE = new JLabel("Contraseña");
		textoPasswordCE.setBounds(420,155,90,30);
		cajaPasswordCE = new JPasswordField();
		cajaPasswordCE.setBounds(520,155,140,25);
		
		buttonEnviarCE = new JButton("Crear");
		buttonEnviarCE.setBounds(320,250,100,25);
		buttonModificarCE = new JButton("Modificar");
		buttonModificarCE.setBounds(320,250,100,25);
		
		textoCalendarioCE = new JLabel("Fecha Nacimiento");
		textoCalendarioCE.setBounds(80,100,120,30);
		calendarioCE = new JDateChooser("dd/MM/yyyy","##/##/####", '_' );
		calendarioCE.setBounds(190,100,140,25);
		
		
		textoDepartamento = new JLabel("Departamento");
		textoDepartamento.setBounds(80,210,100,30);
		cajaDepartamento = new JComboBox<String>();
		cajaDepartamento.setModel(new DefaultComboBoxModel(Departamento.values()));
		cajaDepartamento.setBounds(190,210,140,25);
		
		textoCiudad = new JLabel("Ciudad");
		textoCiudad.setBounds(420,210,60,30);
		cajaCiudad = new JComboBox<String>();
		cajaCiudad.setModel(new DefaultComboBoxModel(Ciudad.values()));
		cajaCiudad.setBounds(520,210,140,25);
		
		botonEnviarUsuario = new JButton("Crear Usuario");
		botonEnviarUsuario.setBounds(320,250,100,25);
		botonModificarUsuario = new JButton("Modificar");
		botonModificarUsuario.setBounds(320,250,100,25);
	}
	
	public void actionsCE(Controller controller) {
		buttonEnviarCE.setActionCommand(Action.CREAREMPLEADOCE);
		buttonEnviarCE.addActionListener(controller);
		buttonModificarCE.setActionCommand(Action.MODIFICAR_EMPLEADO);
		buttonModificarCE.addActionListener(controller);
		
		//Prueba
		botonEnviarUsuario.setActionCommand(Action.CREARUSUARIOCE);
		botonEnviarUsuario.addActionListener(controller);
		botonModificarUsuario.setActionCommand(Action.MODIFICARUSUARIOICE);
		botonModificarUsuario.addActionListener(controller);
		
	}

	public JTextField getCajaNombres() {
		return cajaNombres;
	}

	public JTextField getCajaApellidos() {
		return cajaApellidos;
	}

	public JTextField getCajaTelefono() {
		return cajaTelefono;
	}
	
	public JTextField getCajaUsuarioCE() {
		return cajaUsuarioCE;
	}

	public JPasswordField getCajaPasswordCE() {
		return cajaPasswordCE;
	}

	public JButton getButtonEnviarCE() {
		return buttonEnviarCE;
	}
	
	public JDateChooser getCalendarioCE() {
		return calendarioCE;
	}

	public JButton getButtonModificarCE() {
		return buttonModificarCE;
	}
	// PRUEBA
	public JLabel getTextoDepartamento() {
		return textoDepartamento;
	}

	public JLabel getTextoCiudad() {
		return textoCiudad;
	}

	public JButton getBotonEnviarUsuario() {
		return botonEnviarUsuario;
	}

	public JButton getBotonModificarUsuario() {
		return botonModificarUsuario;
	}

	public JComboBox<String> getCajaDepartamento() {
		return cajaDepartamento;
	}

	public JComboBox<String> getCajaCiudad() {
		return cajaCiudad;
	}
	
	
	
}
