package edu.uptc.view;

import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import edu.uptc.control.Controller;

public class MainWindow extends JFrame implements Action{
	private JLabel cabecera;
	
	private SelectRol selectRol;
	private LoginWindow loginWindow;
	private MainWindowAdmin mainWindowAdmin;
	private EmpleadoWindowAdmin empleadoWindowAdmin;
	private CreateEmpleado createEmpleado;
	private ViewEmpleado viewEmpleado;
	private LoginWindowEmpleado loginWindowEmpleado;
	private EmpleadoWindowEmpleado empleadoWindowEmpleado;
	
	private LibroWindowAdmin libroWindowAdmin;
	private CreateLibro createLibro;
	private ViewLibro viewLibro;
	private MainWindowEmpleado mainWindowEmpleado;
	
	public MainWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1200, 720);
		this.setLocation(100, 100);
		this.setExtendedState(MAXIMIZED_BOTH);
		Image escudo = new ImageIcon(getClass().getResource("/escudoVillavicencio.png")).getImage();
		setIconImage(escudo);
		this.setIconImage(escudo);
		this.setTitle("Biblioteca P�blica de Villavicencio");
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(6,136,47));
		
		initialize();
		aggregate();
	}

	private void initialize() {	
		cabecera = new JLabel("");
		Image banner = new ImageIcon(getClass().getResource("/cabecera.png")).getImage();
		cabecera.setIcon(new ImageIcon(banner));
		cabecera.setBounds(0,0,1400,100);
		
		selectRol = new SelectRol();
		selectRol.setBounds(290,200,800,400);
		
		loginWindow = new LoginWindow();
		loginWindow.setBounds(500,300,350,170);
		loginWindowEmpleado = new LoginWindowEmpleado();
		loginWindowEmpleado.setBounds(500,300,350,170);
		
		mainWindowAdmin = new MainWindowAdmin();
		mainWindowAdmin.setBounds(100,130,1200,500);
		empleadoWindowAdmin = new EmpleadoWindowAdmin();
		empleadoWindowAdmin.setBounds(100,230,160,180);
		empleadoWindowEmpleado = new EmpleadoWindowEmpleado();
		empleadoWindowEmpleado.setBounds(100,230,160,180);
		libroWindowAdmin = new LibroWindowAdmin();
		libroWindowAdmin.setBounds(100,230,160,180);
		
		createEmpleado = new CreateEmpleado();
		createEmpleado.setBounds(320,230,800,300);
		createLibro = new CreateLibro();
		createLibro.setBounds(320,230,800,350);
		
		viewEmpleado = new ViewEmpleado();
		viewEmpleado.setBounds(320,230,800,400);
		
		viewLibro = new ViewLibro();
		viewLibro.setBounds(320,230,800,400);
		mainWindowEmpleado = new MainWindowEmpleado();
		mainWindowEmpleado.setBounds(100,130,1200,500);
		
	}

	private void aggregate() {
		add(cabecera);
		add(selectRol);
	}
	
	public void initialProgram(Controller controller) {
		selectRol.actionsR(controller);
		loginWindow.actions(controller);
		mainWindowAdmin.actionsMWA(controller);
		empleadoWindowAdmin.actionsEWA(controller);
		mainWindowEmpleado.actionsMWE(controller);
		empleadoWindowEmpleado.actionsEWE(controller);
		createEmpleado.actionsCE(controller);
		libroWindowAdmin.actionsLWA(controller);
		createLibro.actionCL(controller);
		
		viewEmpleado.getButttonEdite().setActionCommand(MODIFICARVER);
		viewEmpleado.getButtonDelete().setActionCommand(ELIMINAREMPLEADO);
		viewEmpleado.getButttonEdite().addActionListener(controller);
		viewEmpleado.getButtonDelete().addActionListener(controller);
		
		viewEmpleado.getBotonUsuarioEdite().setActionCommand(MODIFICARUSUARIOVISTA);
		viewEmpleado.getBotonUsuarioDelete().setActionCommand(ELIMINARUSUARIO);
		viewEmpleado.getBotonUsuarioEdite().addActionListener(controller);
		viewEmpleado.getBotonUsuarioDelete().addActionListener(controller);
		
		viewLibro.getButtonEditeLibro().setActionCommand(MODIFICARVERLIBRO);
		viewLibro.getButtonDeleteLibro().setActionCommand(ELIMINARVERLIBRO);
		viewLibro.getButtonDeleteLibro().addActionListener(controller);
		viewLibro.getButtonEditeLibro().addActionListener(controller);
		
		loginWindowEmpleado.getBotonEnviar().setActionCommand(INICIARSESIONEMPLEADO);
		loginWindowEmpleado.getBotonCancelar().setActionCommand(CANCELARSESIONEMPLEADO);
		loginWindowEmpleado.getBotonEnviar().addActionListener(controller);
		loginWindowEmpleado.getBotonCancelar().addActionListener(controller);
		
		
		
		setVisible(true);
	}

	@Override
	public void enable(String window) {
		if (window.equals("iniciarAdministrador")) {
			System.out.println("funciono1");
			loginWindow.setVisible(true);
			add(loginWindow);
			}else if(window.equals("iniciarEmpleado")) {
				System.out.println("inicia empleado en");
				loginWindowEmpleado.setVisible(true);
				add(loginWindowEmpleado);
				
				}
		
		
			else if(window.equals("iniciarSesion")) {
				System.out.println("Ventana Admin");
				mainWindowAdmin.setVisible(true);
				add(mainWindowAdmin);
			}else if (window.equals("cerrarSesion")) {
				selectRol.setVisible(true);
				add(selectRol);
				
			}else if(window.equals("entrarEmpleadoMWA")) {
				System.out.println("trolo");

				empleadoWindowAdmin.setVisible(true);
				add(empleadoWindowAdmin);
				mainWindowAdmin.setVisible(true);
				add(mainWindowAdmin);
				
			}else if (window.equals("iniciarSesionEmpleado")) {
				mainWindowEmpleado.setVisible(true);
				add(mainWindowEmpleado);
			}else if (window.equals("entrarUsuarioMWE")) {
				empleadoWindowEmpleado.setVisible(true);
				add(empleadoWindowEmpleado);
				empleadoWindowEmpleado.getBotonCrearUsuarioEWE().setVisible(true);
				empleadoWindowEmpleado.getBotonVerUsuarioEWE().setVisible(true);
				
				mainWindowEmpleado.setVisible(true);
				add(mainWindowEmpleado);
				
			}else if (window.equals("prestamoWE")) {
				empleadoWindowAdmin.setVisible(true);
				add(empleadoWindowEmpleado);
				empleadoWindowEmpleado.getBotonCrearPrestamoEWE().setVisible(true);
				empleadoWindowEmpleado.getBotonVerPrestamoEWE().setVisible(true);
				
				mainWindowEmpleado.setVisible(true);
				add(mainWindowEmpleado);
			}
		
		
			else if (window.equals("crearEmpleado")) {
				createEmpleado.setVisible(true);
				add(createEmpleado);
				mainWindowAdmin.setVisible(true);
				add(mainWindowAdmin);
				createEmpleado.getButtonEnviarCE().setVisible(true);
				cleanEspacios();
			}else if (window.equals("verEmpleado")) {
				viewEmpleado.setVisible(true);
				add(viewEmpleado);
				empleadoWindowAdmin.setVisible(true);
				add(empleadoWindowAdmin);
				mainWindowAdmin.setVisible(true);
				add(mainWindowAdmin);
			}/*else if(window.equals("modificarVista")) {
				empleadoWindowAdmin.setVisible(true);
				add(empleadoWindowAdmin);
				mainWindowAdmin.setVisible(true);
				add(mainWindowAdmin);
			}*/
			else if (window.equals("entrarLibrosMWA")) {
				System.out.println("EL libr");
				libroWindowAdmin.setVisible(true);
				add(libroWindowAdmin);
				mainWindowAdmin.setVisible(true);
				add(mainWindowAdmin);
				
			}else if (window.equals("crearLibro")) {
				System.out.println("Cradno libro");
				// Reutilizacion
				createLibro.getCajaAutor().setVisible(true);
				createLibro.getTextoAutor().setVisible(true);
				createLibro.getCajaGenero().setVisible(true);
				createLibro.getTextoGenero().setVisible(true);
				createLibro.getCajaCopias().setVisible(true);
				createLibro.getTextoCopias().setVisible(true);
				createLibro.getCajaCalificacionEdadCL().setVisible(true);
				createLibro.getTextoCalificacionEdadCL().setVisible(true);
				createLibro.gettextoAniooPublicacionCL().setVisible(true);
				createLibro.getanioPublicacionCL().setVisible(true);
				createLibro.getButtonEnviarCL().setVisible(true);
				
				
				createLibro.setVisible(true);
				add(createLibro);
				mainWindowEmpleado.setVisible(true);
				add(mainWindowEmpleado);
				
				
				cleanEspaciosLibros();
			}else if (window.equals("verLibro")) {
				viewLibro.setVisible(true);
				add(viewLibro);
				libroWindowAdmin.setVisible(true);
				add(libroWindowAdmin);
				mainWindowAdmin.setVisible(true);
				add(mainWindowAdmin);
			}else if (window.equals("crearUsuario")) {
				createEmpleado.setVisible(true);
				add(createEmpleado);
				mainWindowEmpleado.setVisible(true);
				add(mainWindowEmpleado);
				createEmpleado.getButtonEnviarCE().setVisible(true);
				cleanEspacios();
			}else if (window.equals("verUsuario")) {
				viewEmpleado.setVisible(true);
				add(viewEmpleado);
				mainWindowEmpleado.setVisible(true);
				add(mainWindowEmpleado);
			}else if (window.equals("crearPrestamoMenu")) {
				createLibro.getTextoBusquedaUsuario().setVisible(true);
				createLibro.getCajaBusquedaUsuario().setVisible(true);
				
				createLibro.getBotonBusquedaUsuario().setVisible(true);
				createLibro.getTextoISBN().setVisible(true);
				createLibro.getCajaISBN().setVisible(true);
				
				
				createLibro.setVisible(true);
				add(createLibro);
				mainWindowEmpleado.setVisible(true);
				
				add(mainWindowEmpleado);
				cleanEspaciosLibros();
			}else if (window.equals("buscarUsuarioP")) {
				createLibro.getTextoFechaPrestamo().setVisible(true);
				createLibro.getFechaInicioPrestamo().setVisible(true);
				createLibro.getBotonCrearPrestamo().setVisible(true);
				createLibro.getCajaTitulo().setVisible(true);
				createLibro.getTextoTitulo().setVisible(true);
				createLibro.getCajaPrecioCL().setVisible(true);
				createLibro.getTextoPrecioCL().setVisible(true);
				createLibro.getCajaBusquedaUsuario().setEditable(false);
			}
		
		
		
		
		
		repaint();
	}

	@Override
	public void disable(String window) {
		if (window.equals("iniciarAdministrador")) {
			System.out.println("funciono1+2");
			selectRol.setVisible(false);
			remove(selectRol);
			}else if(window.equals("iniciarSesionEmpleado")) {
				loginWindowEmpleado.setVisible(false);
				remove(loginWindowEmpleado);
				}
		
		
		
			else if(window.equals("iniciarSesion") || window.equals("cerrarSesion")) {
				loginWindow.setVisible(false);
				remove(loginWindow);
			}else if (window.equals("cerrarSesion")) {
				loginWindow.setVisible(false);
				remove(loginWindow);
			}else if (window.equals("entrarEmpleadoMWA")) {
				viewEmpleado.setVisible(false);
				remove(viewEmpleado);
				viewLibro.setVisible(false);
				remove(viewLibro);
				libroWindowAdmin.setVisible(false);
				remove(libroWindowAdmin);
				createLibro.setVisible(false);
				remove(createLibro);
			}else if (window.equals("entrarUsuarioMWE")) {
				empleadoWindowEmpleado.getBotonCrearPrestamoEWE().setVisible(false);
				empleadoWindowEmpleado.getBotonVerPrestamoEWE().setVisible(false);
				createLibro.setVisible(false);
				remove(createLibro);
			}else if (window.equals("prestamoWE")) {
				empleadoWindowEmpleado.getBotonCrearUsuarioEWE().setVisible(false);
				empleadoWindowEmpleado.getBotonVerUsuarioEWE().setVisible(false);
			}
		
		
			else if (window.equals("verEmpleado")) {
				createEmpleado.setVisible(false);
				remove(createEmpleado);
			}else if (window.equals("crearEmpleado")) {
				viewEmpleado.setVisible(false);
				createEmpleado.getButtonModificarCE().setVisible(false);
				createEmpleado.getCajaDepartamento().setVisible(false);
				createEmpleado.getCajaCiudad().setVisible(false);
				createEmpleado.getBotonEnviarUsuario().setVisible(false);
				createEmpleado.getBotonModificarUsuario().setVisible(false);
				createEmpleado.getTextoCiudad().setVisible(false);
				createEmpleado.getTextoDepartamento().setVisible(false);
				remove(viewEmpleado);
			}else if (window.equals("entrarLibrosMWA")) {
				viewEmpleado.setVisible(false);
				remove(viewEmpleado);
				createEmpleado.setVisible(false);
				remove(createEmpleado);
				empleadoWindowAdmin.setVisible(false);
				remove(empleadoWindowAdmin);
				
			}else if (window.equals("crearLibro")) {
				createLibro.getTextoBusquedaUsuario().setVisible(false);
				createLibro.getCajaBusquedaUsuario().setVisible(false);
				createLibro.getTextoFechaPrestamo().setVisible(false);
				createLibro.getFechaInicioPrestamo().setVisible(false);
				createLibro.getBotonCrearPrestamo().setVisible(false);
				createLibro.getBotonBusquedaUsuario().setVisible(false);
				
				viewLibro.setVisible(false);
				remove(viewLibro);
				cleanEspaciosLibros();
			}else if (window.equals("verLibro")) {
				createLibro.setVisible(false);
				remove(createLibro);
				cleanEspacios();
			}else if (window.equals("crearUsuario")) {
				createEmpleado.getButtonEnviarCE().setVisible(false);
				createEmpleado.getButtonModificarCE().setVisible(false);
				viewEmpleado.setVisible(false);
				remove(viewEmpleado);
			}else if (window.equals("crearPrestamoMenu")) {
				createLibro.getCajaAutor().setVisible(false);
				createLibro.getTextoAutor().setVisible(false);
				createLibro.getCajaGenero().setVisible(false);
				createLibro.getTextoGenero().setVisible(false);
				createLibro.getCajaCopias().setVisible(false);
				createLibro.getTextoCopias().setVisible(false);
				createLibro.getCajaCalificacionEdadCL().setVisible(false);
				createLibro.getTextoCalificacionEdadCL().setVisible(false);
				createLibro.gettextoAniooPublicacionCL().setVisible(false);
				createLibro.getanioPublicacionCL().setVisible(false);
				createLibro.getButtonEnviarCL().setVisible(false);
				createLibro.getButtonModificarCL().setVisible(false);
				
				
				createLibro.getCajaTitulo().setVisible(false);
				createLibro.getTextoTitulo().setVisible(false);
				createLibro.getFechaInicioPrestamo().setVisible(false);
				createLibro.getTextoFechaPrestamo().setVisible(false);
				createLibro.getCajaPrecioCL().setVisible(false);
				createLibro.getTextoPrecioCL().setVisible(false);
				
				
				
			}else if (window.equals("buscarUsuarioP")) {
				createLibro.getCajaPrecioCL().setVisible(false);
				createLibro.getTextoPrecioCL().setVisible(false);
				createLibro.getCajaTitulo().setVisible(false);
				createLibro.getTextoTitulo().setVisible(false);
				
				cleanEspaciosPrestamo();
			}
			

		repaint();
		
	}

	@Override
	public String[] capture(String window) {
		if (window.equals("iniciarSesion")) {
			String[] entrar = {
				loginWindow.getCajaUsuario().getText(),
				loginWindow.getCajaPassword().getText()
			};
			return entrar;
			
			
		} else if (window.equals("iniciarSesionEmpleado")) {
			System.out.println("Voy a validar datos");
			String[] entradaL = {
				loginWindowEmpleado.getCajaUsuarioL().getText(),
				loginWindowEmpleado.getCajaContrasena().getText()
			};
			return entradaL;
		}
		else if (window.equals("crearEmpleadoCE")) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String[] entrada = {
					createEmpleado.getCajaNombres().getText(),
					createEmpleado.getCajaApellidos().getText(),
					createEmpleado.getCajaTelefono().getText(),
					dateFormat.format(createEmpleado.getCalendarioCE().getDate()),
					createEmpleado.getCajaUsuarioCE().getText(),
					createEmpleado.getCajaPasswordCE().getText()
			};
			cleanEspacios();
			repaint();
			return entrada;
		}else if (window.equals("modificarVista")) {
			String[] captura = new String[1];
			captura[0] = "" + viewEmpleado.getjTableEmpleados().getSelectedRow();
			return captura;	
		}else if (window.equals("modificarEmpleado")) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String[] entry = {
					createEmpleado.getCajaNombres().getText(),
					createEmpleado.getCajaApellidos().getText(),
					createEmpleado.getCajaTelefono().getText(),
					simpleDateFormat.format(createEmpleado.getCalendarioCE().getDate()),
					createEmpleado.getCajaUsuarioCE().getText(),
					createEmpleado.getCajaPasswordCE().getText()
			};
			cleanEspacios();
			repaint();
			return entry;
		}else if (window.equals("eliminarEmpleado")) {
			String[] capture = new String[1];
			capture[0] = "" + viewEmpleado.getjTableEmpleados().getSelectedRow();
			return capture;
			
		}else if (window.equals("crearLibroVentana")) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String[] entrys = {
					createLibro.getCajaISBN().getText(),
					createLibro.getCajaTitulo().getText(),
					createLibro.getCajaAutor().getText(),
					"" + createLibro.getCajaGenero().getSelectedItem(),
					dateFormat.format(createLibro.getanioPublicacionCL().getDate()),
					createLibro.getCajaCopias().getText(),
					createLibro.getCajaCalificacionEdadCL().getText(),
					createLibro.getCajaPrecioCL().getText()
			};
			cleanEspaciosLibros();
			repaint();
			return entrys;
			
		}else if (window.equals("eliminarLibroVista")) {
			String[] capture = new String[1];
			capture[0] = "" + viewLibro.getjTableLibros().getSelectedRow();
			return capture;
			
		}else if (window.equals("eliminarUsuario")) {
			String[] captureUsuario = new String[1];
			captureUsuario[0] = "" + viewEmpleado.getjTableUsuario().getSelectedRow();
			return captureUsuario;
		
			
		}else if (window.equals("modificarLibro")) {
			String[] entryL = {
					createLibro.getCajaISBN().getText(),
					createLibro.getCajaTitulo().getText(),
					createLibro.getCajaAutor().getText(),
					"" + createLibro.getCajaGenero().getSelectedItem(),
					"" + createLibro.getanioPublicacionCL().getDate(),
					createLibro.getCajaCopias().getText(),
					createLibro.getCajaCalificacionEdadCL().getText(),
					createLibro.getCajaPrecioCL().getText()
			};
			cleanEspaciosLibros();
			repaint();
			return entryL;
		}else if (window.equals("modificarLibroVista")) {
			String[] capturar = new String[1];
			capturar[0] = "" + viewLibro.getjTableLibros().getSelectedRowCount();
			return capturar;
			
			//crear usuario
			
		}else if (window.equals("crearUsuarioCE")) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String[] entryU = {
				createEmpleado.getCajaNombres().getText(),
				createEmpleado.getCajaApellidos().getText(),
				createEmpleado.getCajaTelefono().getText(),
				simpleDateFormat.format(createEmpleado.getCalendarioCE().getDate()),
				"" + createEmpleado.getCajaCiudad().getSelectedItem(),
				"" + createEmpleado.getCajaDepartamento().getSelectedItem(),
				createEmpleado.getCajaUsuarioCE().getText(),
				createEmpleado.getCajaPasswordCE().getText()
			};
			cleanEspacios();
			repaint();
			return entryU;
			
			
		}else if (window.equals("modificarUsuarioVista")) {
			String[] capturaUsuario = new String[1];
			capturaUsuario[0] = "" + viewEmpleado.getjTableUsuario().getSelectedRow();
			return capturaUsuario;
		}else if (window.equals("modificarUsuarioCE")) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String[] entry = {
					createEmpleado.getCajaNombres().getText(),
					createEmpleado.getCajaApellidos().getText(),
					createEmpleado.getCajaTelefono().getText(),
					simpleDateFormat.format(createEmpleado.getCalendarioCE().getDate()),
					"" + createEmpleado.getCajaCiudad().getSelectedItem(),
					"" + createEmpleado.getCajaDepartamento().getSelectedItem(),
					createEmpleado.getCajaUsuarioCE().getText(),
					createEmpleado.getCajaPasswordCE().getText()
			};
			cleanEspacios();
			repaint();
			return entry;
		}else if (window.equals("buscarUsuarioP")) {
			String[]  entradaUsuarioP = {
				createLibro.getCajaBusquedaUsuario().getText()
			};
			return entradaUsuarioP;
		}else if (window.equals("crearPresatamoUsuario")) {
			String[] entradaLibroISBN = {
				createLibro.getCajaISBN().getText()
			};
			System.out.println(createLibro.getCajaISBN().getText() + "CJAJA PRUEBA");
			return entradaLibroISBN;
		}else if (window.equals("crearPresatamoUsuarioDos")) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(createLibro.getCajaISBN().getText()+ "isbn");
			String[] entradaPrestamos = {
				createLibro.getCajaISBN().getText(),
				createLibro.getCajaBusquedaUsuario().getText(),
				simpleDateFormat.format(createLibro.getFechaInicioPrestamo().getDate()),
			};
			
			return entradaPrestamos;
		}
		
		
		
		return null;
	}

	public void cleanEspacios() {
		createEmpleado.getCajaNombres().setText("");
		createEmpleado.getCajaNombres().setEditable(true);
		createEmpleado.getCajaApellidos().setText("");
		createEmpleado.getCajaTelefono().setText("");
		createEmpleado.getCajaUsuarioCE().setText("");
		createEmpleado.getCajaPasswordCE().setText("");
	}
	
	public void cleanEspaciosLibros() {
		createLibro.getCajaISBN().setText("");
		createLibro.getCajaISBN().setEditable(true);
		createLibro.getCajaTitulo().setText("");
		createLibro.getCajaAutor().setText("");
		createLibro.getCajaCopias().setText("");
		createLibro.getCajaCalificacionEdadCL().setText("");;
		createLibro.getCajaPrecioCL().setText("");
	}
	
	public void cleanEspaciosPrestamo() {
		createLibro.getCajaISBN().setEditable(false);
	}

	@Override
	public void show(String[][] exit, String window) {
		cleanTable();
		if (window.equals("verEmpleado")) {
			viewEmpleado.getJscrollPane().setVisible(true);
			viewEmpleado.getJscrollPaneUsuario().setVisible(false);
			
			viewEmpleado.getJscrollPaneUsuario().setVisible(false);
			viewEmpleado.getBotonUsuarioDelete().setVisible(false);
			viewEmpleado.getBotonUsuarioEdite().setVisible(false);
			viewEmpleado.getButtonDelete().setVisible(true);
			viewEmpleado.getButttonEdite().setVisible(true);
			
			
			for (int i = 0; i < exit.length; i++) {
				viewEmpleado.getDefaultTableModel().addRow(exit[i]);
				
			}
		} else if(window.equals("modificarVista")) {
			createEmpleado.getCajaNombres().setText(exit[0][0]);
			createEmpleado.getCajaApellidos().setText(exit[0][1]);
			createEmpleado.getCajaTelefono().setText(exit[0][2]);
			createEmpleado.getCajaUsuarioCE().setText(exit[0][4]);
			createEmpleado.getCajaPasswordCE().setText(exit[0][5]);
			
			createEmpleado.getButtonEnviarCE().setVisible(false);
			createEmpleado.getButtonModificarCE().setVisible(true);
			createEmpleado.getCajaNombres().setEditable(false);
		}
		else if (window.equals("verLibro")) {
			for (int i = 0; i < exit.length; i++) {
				viewLibro.getDefaultTableModelL().addRow(exit[i]);
			}
		}
		else if (window.equals("modificarLibroVista")) {
			createLibro.getCajaISBN().setText(exit[0][0]);
			createLibro.getCajaTitulo().setText(exit[0][1]);
			createLibro.getCajaAutor().setText(exit[0][2]);
			createLibro.getCajaCopias().setText(exit[0][5]);
			createLibro.getCajaCalificacionEdadCL().setText(exit[0][6]);
			createLibro.getCajaPrecioCL().setText(exit[0][7]);
			
			createLibro.getButtonEnviarCL().setVisible(false);
			createLibro.getButtonModificarCL().setVisible(true);
			createLibro.getCajaISBN().setEditable(false);
		} 
		else if (window.equals("verUsuario")) {
			viewEmpleado.getJscrollPane().setVisible(false);
			viewEmpleado.getJscrollPaneUsuario().setVisible(true);
			
			viewEmpleado.getButtonDelete().setVisible(false);
			viewEmpleado.getButttonEdite().setVisible(false);
			viewEmpleado.getBotonUsuarioDelete().setVisible(true);
			viewEmpleado.getBotonUsuarioEdite().setVisible(true);
			
			for (int i = 0; i < exit.length; i++) {	
				viewEmpleado.getDefaultTableModelUsuario().addRow(exit[i]);
			}
		}else if (window.equals("modificarUsuarioVista")) {
			createEmpleado.getCajaNombres().setText(exit[0][0]);
			createEmpleado.getCajaApellidos().setText(exit[0][1]);
			createEmpleado.getCajaTelefono().setText(exit[0][2]);
			
			
			createEmpleado.getCajaCiudad().setSelectedItem(exit[0][4]);
			createEmpleado.getCajaDepartamento().setSelectedItem(exit[0][5]);
			createEmpleado.getCajaUsuarioCE().setText(exit[0][6]);
			createEmpleado.getCajaPasswordCE().setText(exit[0][7]);
			
			createEmpleado.getButtonEnviarCE().setVisible(false);
			createEmpleado.getBotonEnviarUsuario().setVisible(false);
			createEmpleado.getBotonModificarUsuario().setVisible(true);
			createEmpleado.getButtonModificarCE().setVisible(false);
			
		}
		
		
		
		
		
		
		
		
	}

	private void cleanTable() {
		for (int i = 0; i < viewEmpleado.getDefaultTableModel().getRowCount(); i++) {
			viewEmpleado.getDefaultTableModel().removeRow(i);
			i--;
		}for (int i = 0; i < viewLibro.getDefaultTableModelL().getRowCount(); i++) {
			viewLibro.getDefaultTableModelL().removeRow(i);
			i--;
		}for (int i = 0; i < viewEmpleado.getDefaultTableModelUsuario().getRowCount(); i++) {
			viewEmpleado.getDefaultTableModelUsuario().removeRow(i);
			i--;
		}
		
	}

	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
		
	}


	
	
	
}
