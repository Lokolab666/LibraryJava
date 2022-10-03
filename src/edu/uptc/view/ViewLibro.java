package edu.uptc.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class ViewLibro extends JPanel{
	private JScrollPane jScrollPaneL;
	private DefaultTableModel defaultTableModelL;
	private JTable jTableLibros;
	private JButton buttonEditeLibro;
	private JButton buttonDeleteLibro;
	
	
	public ViewLibro() {
		setBorder(new TitledBorder("Ver empleado"));
		setLayout(null);
		
		initialize();
		aggregate();
	}


	private void initialize() {
		String[] tablaLibro = {"ISBN", "Título", "Autor", "Tipo de Género", "Fecha de Publicación", "Copias", "Calificación Edad", "Precio Multa"};
		defaultTableModelL = new DefaultTableModel();
		defaultTableModelL.setColumnIdentifiers(tablaLibro);
		jTableLibros = new JTable(defaultTableModelL);
		jTableLibros.setRowSelectionAllowed(true);
		
		jScrollPaneL = new JScrollPane(jTableLibros);
		jScrollPaneL.setBounds(10,20,720,300);
		
		buttonDeleteLibro = new JButton("Eliminar");
		buttonDeleteLibro.setBounds(380,350,100,25);
		
		buttonEditeLibro = new JButton("Editar");
		buttonEditeLibro.setBounds(250,350,100,25);
		
	}


	private void aggregate() {
		add(jScrollPaneL);
		add(buttonDeleteLibro);
		add(buttonEditeLibro);
		
	}


	public DefaultTableModel getDefaultTableModelL() {
		return defaultTableModelL;
	}


	public JTable getjTableLibros() {
		return jTableLibros;
	}


	public JButton getButtonEditeLibro() {
		return buttonEditeLibro;
	}


	public JButton getButtonDeleteLibro() {
		return buttonDeleteLibro;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
