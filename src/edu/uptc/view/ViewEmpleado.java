package edu.uptc.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class ViewEmpleado extends JPanel{
	private JScrollPane jscrollPane;
	private DefaultTableModel defaultTableModel;
	private JTable jTableEmpleados;
	private JButton butttonEdite;
	private JButton buttonDelete;
	
	//PRUEBA
	private DefaultTableModel defaultTableModelUsuario;
	private JTable jTableUsuario;
	private JScrollPane jscrollPaneUsuario;
	private JButton botonUsuarioEdite;
	private JButton botonUsuarioDelete;
	
	public ViewEmpleado() {
		
		setBorder(new TitledBorder("Ver empleado"));
		setLayout(null);
		
		initialize();
		aggregate();
	}

	private void initialize() {
		String[] tablaEmployer = {"Nombres","Apellidos", "Teléfono", "Fecha Nacimiento", "Usuario", "Contraseña"};
		String[] tablaUser = {"Nombres","Apellidos", "Teléfono", "Fecha Nacimiento", "Ciudad", "Departamento",  "Usuario", "Contraseña"};
		
		defaultTableModel = new DefaultTableModel();
		defaultTableModel.setColumnIdentifiers(tablaEmployer);
		defaultTableModelUsuario = new DefaultTableModel();
		defaultTableModelUsuario.setColumnIdentifiers(tablaUser);
		
		jTableEmpleados = new JTable(defaultTableModel);
		jTableEmpleados.setRowSelectionAllowed(true);
		jTableUsuario = new JTable(defaultTableModelUsuario);
		jTableUsuario.setRowSelectionAllowed(true);
		
		jscrollPane = new JScrollPane(jTableEmpleados);
		jscrollPane.setBounds(10,20,720,300);
		
		jscrollPaneUsuario = new JScrollPane(jTableUsuario);
		jscrollPaneUsuario.setBounds(10,20,720,300);
		
		buttonDelete = new JButton("Eliminar E");
		buttonDelete.setBounds(380,350,100,25);
		
		butttonEdite = new JButton("Editar E");
		butttonEdite.setBounds(250,350,100,25);
		
		botonUsuarioDelete = new JButton("Eliminar U");
		botonUsuarioDelete.setBounds(380,350,100,25);
		
		botonUsuarioEdite = new JButton("Editar U");
		botonUsuarioEdite.setBounds(250,350,100,25);
	}

	private void aggregate() {
		add(jscrollPane);
		add(jscrollPaneUsuario);
		add(buttonDelete);
		add(butttonEdite);
		add(botonUsuarioDelete);
		add(botonUsuarioEdite);
	}

	
	
	public JTable getjTableUsuario() {
		return jTableUsuario;
	}

	public DefaultTableModel getDefaultTableModelUsuario() {
		return defaultTableModelUsuario;
	}

	public JScrollPane getJscrollPaneUsuario() {
		return jscrollPaneUsuario;
	}

	public void setJscrollPaneUsuario(JScrollPane jscrollPaneUsuario) {
		this.jscrollPaneUsuario = jscrollPaneUsuario;
	}

	public JScrollPane getJscrollPane() {
		return jscrollPane;
	}

	public void setJscrollPane(JScrollPane jscrollPane) {
		this.jscrollPane = jscrollPane;
	}

	public DefaultTableModel getDefaultTableModel() {
		return defaultTableModel;
	}

	public JTable getjTableEmpleados() {
		return jTableEmpleados;
	}

	public JButton getButttonEdite() {
		return butttonEdite;
	}

	public JButton getButtonDelete() {
		return buttonDelete;
	}

	public JButton getBotonUsuarioEdite() {
		return botonUsuarioEdite;
	}

	public JButton getBotonUsuarioDelete() {
		return botonUsuarioDelete;
	}
	
	
	
}
