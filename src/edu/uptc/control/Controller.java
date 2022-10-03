package edu.uptc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.uptc.logic.Manage;
import edu.uptc.logic.ManageEmpleado;
import edu.uptc.logic.ManageLibro;
import edu.uptc.logic.ManagePrestamo;
import edu.uptc.logic.ManageUsuario;
import edu.uptc.view.Action;
import edu.uptc.view.LoginWindow;
import edu.uptc.view.SelectRol;

public class Controller implements ActionListener {

	private Action action;
	private Manage manage;
	private ManageEmpleado manageEmpleado;
	private ManageLibro manageLibro;
	private ManageUsuario manageUsuario;
	private ManagePrestamo managePrestamo;
	
	public Controller(Action action) {
		this.action = action;
		manage = new Manage();
		manageEmpleado = new ManageEmpleado();
		manageLibro = new ManageLibro();
		manageUsuario = new ManageUsuario();
		managePrestamo = new ManagePrestamo();
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		switch (evento.getActionCommand()) {
		case Action.INICIARADMINISTRADOR:
			action.enable(Action.INICIARADMINISTRADOR);
			action.disable(Action.INICIARADMINISTRADOR);
			break;
		
		case Action.INICIAREMPLEADO:
			action.enable(Action.INICIAREMPLEADO);
			action.disable(Action.INICIARADMINISTRADOR);
			break;
			
		case Action.INICIARUSUARIO:
			action.enable(Action.INICIAREMPLEADO);
			action.disable(Action.INICIAREMPLEADO);
			break;
		
		case Action.INICIARSESION:
			String[] entrar = action.capture(Action.INICIARSESION);
			action.showMessage(manage.createVerifi(entrar));
			if (manage.createVerifi(entrar) == "Administrador encontrado") {
				action.enable(Action.INICIARSESION);
				action.disable(Action.INICIARSESION);
			}
			
			break;
		
		case Action.CANCELARSESION:
			action.enable(Action.CANCELARSESION);
			action.disable(Action.CANCELARSESION);
			break;
		
			
		case Action.INICIARSESIONEMPLEADO:
			String[] entrarEmpleado = action.capture(Action.INICIARSESIONEMPLEADO);
			action.showMessage(manageEmpleado.buscarUserCon(entrarEmpleado));
			if (manageEmpleado.buscarUserCon(entrarEmpleado) == "Empleado encontrado") {
				action.enable(Action.INICIARSESIONEMPLEADO);
				action.disable(Action.INICIARSESION);
				action.disable(Action.INICIARSESIONEMPLEADO);
			}
			break;
			
		case Action.EMPLEADOSMWA:
			action.enable(Action.EMPLEADOSMWA);
			action.disable(Action.EMPLEADOSMWA);
			break;
		
		case Action.USUARIOMWE:
			action.enable(Action.USUARIOMWE);
			action.disable(Action.USUARIOMWE);
			break;
			
		case Action.PRESTAMOWE:
			action.disable(Action.VEREMPLEADO);
			action.disable(Action.CREAREMPLEADO);
			action.enable(Action.PRESTAMOWE);
			action.disable(Action.PRESTAMOWE);
			break;	
			
			
		case Action.CREAREMPLEADO:
			action.enable(Action.CREAREMPLEADO);
			action.disable(Action.CREAREMPLEADO);
			break;
			
		case Action.CREAREMPLEADOCE:
			String[] entry = action.capture(Action.CREAREMPLEADOCE);
			action.showMessage(manageEmpleado.createEmpleado(entry));
			break;
			
		case Action.VEREMPLEADO:
			action.enable(Action.VEREMPLEADO);
			action.disable(Action.VEREMPLEADO);
			action.show(manageEmpleado.viewData(), Action.VEREMPLEADO);
			manageEmpleado.verifyData();
			break;
			
		case Action.MODIFICARVER:
			int posicion = Integer.parseInt(action.capture(Action.MODIFICARVER)[0]);
			String[][] capture = new String[1][6];
			capture[0][0] = manageEmpleado.getEmpleadoME().get(posicion).getNombresE();
			capture[0][1] = manageEmpleado.getEmpleadoME().get(posicion).getApellidosE();
			capture[0][2] = manageEmpleado.getEmpleadoME().get(posicion).getTelefonoE();
			capture[0][3] = "" + manageEmpleado.getEmpleadoME().get(posicion).getFechaNacimientoE();
			capture[0][4] = manageEmpleado.getEmpleadoME().get(posicion).getUsuarioE();
			capture[0][5] = manageEmpleado.getEmpleadoME().get(posicion).getContrasenaE();
			action.enable(Action.CREAREMPLEADO);
			action.disable(Action.CREAREMPLEADO);
			action.show(capture, Action.MODIFICARVER);
			break;
		case Action.MODIFICAR_EMPLEADO:
			entry = action.capture(Action.MODIFICAR_EMPLEADO);
			
			action.showMessage(manageEmpleado.modifyEmpleado(entry));
			action.enable(Action.CREAREMPLEADO);
			break;
			
		case Action.ELIMINAREMPLEADO:
			action.showMessage(manageEmpleado.deleteEmpleado(action.capture(Action.ELIMINAREMPLEADO)[0]));
			action.enable(Action.VEREMPLEADO);
			action.show(manageEmpleado.viewData(), Action.VEREMPLEADO);	
			break;
		
		case Action.LIBROSMWA:
			action.enable(Action.LIBROSMWA);
			action.disable(Action.LIBROSMWA);
			break;
		
		case Action.CREARLIBRO:
			action.enable(Action.CREARLIBRO);
			action.disable(Action.CREARLIBRO);
			
			break;
		
		case Action.CREARLIBROVENTANA:
			String[] entrys = action.capture(Action.CREARLIBROVENTANA);
			action.showMessage(manageLibro.createLibro(entrys));
			break;
		
		case Action.VERLIBRO:
			action.enable(Action.VERLIBRO);
			action.disable(Action.VERLIBRO);
			action.show(manageLibro.viewDataL(), Action.VERLIBRO);
			break;
			
		case Action.ELIMINARVERLIBRO:
			action.showMessage(manageLibro.deleteLibro(action.capture(Action.ELIMINARVERLIBRO)[0]));
			action.enable(Action.VERLIBRO);
			action.show(manageLibro.viewDataL(), Action.VERLIBRO);
			break;
		
		case Action.MODIFICARVERLIBRO:
			int posicionLibro = Integer.parseInt(action.capture(Action.MODIFICARVERLIBRO)[0]);
			String[][] capturaLibro = new String[1][8];
			capturaLibro[0][0] = manageLibro.getLibroML().get(posicionLibro).getISBN();
			capturaLibro[0][1] = manageLibro.getLibroML().get(posicionLibro).getNombreL();
			capturaLibro[0][2] = manageLibro.getLibroML().get(posicionLibro).getAutorL();
			capturaLibro[0][3] = "" + manageLibro.getLibroML().get(posicionLibro).getTipoGenero();
			capturaLibro[0][4] = "" + manageLibro.getLibroML().get(posicionLibro).getFechaPublicacionL();
			capturaLibro[0][5] = "" + manageLibro.getLibroML().get(posicionLibro).getCopiasL();
			capturaLibro[0][6] = "" + manageLibro.getLibroML().get(posicionLibro).getCalificacionEdadL();
			capturaLibro[0][7] = "" + manageLibro.getLibroML().get(posicionLibro).getPrecioMultaL();
			action.enable(Action.CREARLIBRO);
			action.disable(Action.CREARLIBRO);
			action.show(capturaLibro, Action.MODIFICARVERLIBRO);
			break;
		
		case Action.MODICIAR_LIBRO:
			entrys = action.capture(Action.MODICIAR_LIBRO);
			action.showMessage(manageLibro.modifyLibro(entrys));
			action.enable(Action.CREARLIBRO);
			break;
			
		case Action.CREARUSUARIO:
			action.enable(Action.CREARUSUARIO);
			action.disable(Action.CREARUSUARIO);
			break;
		
		case Action.CREARUSUARIOCE:
			action.disable(Action.CREARUSUARIOCE);
			String[] entradaUsuario = action.capture(Action.CREARUSUARIOCE);
			action.showMessage(manageUsuario.createUsuario(entradaUsuario));
			break;
			
		case Action.VERUSUARIO:
			action.enable(Action.VERUSUARIO);
			action.disable(Action.VEREMPLEADO);
			action.show(manageUsuario.viewDataU(), Action.VERUSUARIO);
			
			break;
			
		case Action.ELIMINARUSUARIO:
			action.showMessage(manageUsuario.deleteUsuario(action.capture(Action.ELIMINARUSUARIO)[0]));
			action.enable(Action.VERUSUARIO);
			action.show(manageUsuario.viewDataU(), Action.VERUSUARIO);
			break;
			
			
		case Action.MODIFICARUSUARIOVISTA:
			int posicionUsuario = Integer.parseInt(action.capture(Action.MODIFICARUSUARIOVISTA)[0]);
			String[][] captureUsuario = new String[1][8];
			captureUsuario[0][0] = manageUsuario.getUsuarioMU().get(posicionUsuario).getNombresU();
			captureUsuario[0][1] = manageUsuario.getUsuarioMU().get(posicionUsuario).getApellidosU();
			captureUsuario[0][2] = manageUsuario.getUsuarioMU().get(posicionUsuario).getTelefonoU();
			captureUsuario[0][3] = manageUsuario.getUsuarioMU().get(posicionUsuario).getFechaNacimientoU();
			captureUsuario[0][4] = "" + manageUsuario.getUsuarioMU().get(posicionUsuario).getCiudadU();
			captureUsuario[0][5] = "" + manageUsuario.getUsuarioMU().get(posicionUsuario).getDepartamentoU();
			captureUsuario[0][6] = manageUsuario.getUsuarioMU().get(posicionUsuario).getUsuarioU();
			captureUsuario[0][7] = manageUsuario.getUsuarioMU().get(posicionUsuario).getContrasenaU();
			action.enable(Action.CREARUSUARIO);			
			action.disable(Action.CREARUSUARIO);
			action.show(captureUsuario, Action.MODIFICARUSUARIOVISTA);
			
			break;
		
		case Action.MODIFICARUSUARIOICE:
			entradaUsuario = action.capture(Action.MODIFICARUSUARIOICE);
			action.showMessage(manageUsuario.modifyUsuario(entradaUsuario));
			action.enable(Action.CREARUSUARIO);
			
			break;
		
		case Action.CREARPRESTAMO:
			action.enable(Action.CREARPRESTAMO);
			action.disable(Action.CREARPRESTAMO);
			break;
			
		case Action.BUSCARUSUARIOPRESTAMO:
			String[] buscandoUsuario = action.capture(Action.BUSCARUSUARIOPRESTAMO);
			action.showMessage(manageUsuario.buscarUsuarioPrestamo(buscandoUsuario));
			String[] buscandoLibroISBN = action.capture(Action.CREARPRESTAMOUSUARIO);
			action.showMessage(manageLibro.buscarLibroPrestamo(buscandoLibroISBN));
			
			if (manageUsuario.buscarUsuarioPrestamo(buscandoUsuario) == "Usuario encontrado" && manageLibro.buscarLibroPrestamo(buscandoLibroISBN) == 
					"Libro encontrado, generando prestamo") {
				action.enable(Action.BUSCARUSUARIOPRESTAMO);
				action.enable(Action.CREARPRESTAMOUSUARIO);
			}
			action.disable(Action.BUSCARUSUARIOPRESTAMO);
			break;
		
		case Action.CREARPRESTAMOUSUARIO:
			action.enable(Action.CREARPRESTAMO);
			String[] entradaBusquedaLibro = action.capture(Action.CREARPRESTAMOUSUARIODOS);
			action.showMessage(managePrestamo.createPrestamo(entradaBusquedaLibro));
			action.disable(Action.CREARPRESTAMO);
			
			break;
			
			
			
			
			
			
			
			
			
			
			
			
			
		default:
		}
		
	}

	
	
	
}
