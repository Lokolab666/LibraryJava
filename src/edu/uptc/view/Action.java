package edu.uptc.view;

public interface Action {
	public static String INICIARADMINISTRADOR = "iniciarAdministrador";
	public static String INICIAREMPLEADO = "iniciarEmpleado";
	public static String INICIARUSUARIO = "iniciarUsuario";
	
	public static String INICIARSESION = "iniciarSesion";
	public static String CANCELARSESION = "cerrarSesion";
	public static String INICIARSESIONEMPLEADO = "iniciarSesionEmpleado";
	public static String CANCELARSESIONEMPLEADO = "cerrarSesionEmpleado";
	
	public static String EMPLEADOSMWA = "entrarEmpleadoMWA";
	public static String LIBROSMWA = "entrarLibrosMWA";
	public static String USUARIOMWE = "entrarUsuarioMWE";
	public static String PRESTAMOWE = "prestamoWE";
	
	public static String CREAREMPLEADO = "crearEmpleado";
	public static String VEREMPLEADO = "verEmpleado";
	public static String VERLIBRO = "verLibro";
	public static String CREARUSUARIO = "crearUsuario";
	public static String VERUSUARIO = "verUsuario";
	
	public static String CREAREMPLEADOCE = "crearEmpleadoCE";
	public static String MODIFICAR_EMPLEADO = "modificarEmpleado";
	public static String CREARLIBRO = "crearLibro";
	public static String MODICIAR_LIBRO = "modificarLibro";
	
	public static String CREARLIBROVENTANA = "crearLibroVentana";
	public static String MODIFICARVER = "modificarVista";
	public static String ELIMINAREMPLEADO = "eliminarEmpleado";
	public static String MODIFICARVERLIBRO = "modificarLibroVista";
	public static String ELIMINARVERLIBRO = "eliminarLibroVista";
	
	//PRUEBA
	public static String CREARUSUARIOCE = "crearUsuarioCE";
	public static String MODIFICARUSUARIOICE = "modificarUsuarioCE";
	public static String MODIFICARUSUARIOVISTA = "modificarUsuarioVista";
	public static String ELIMINARUSUARIO = "eliminarUsuario";
	
	public static String CREARPRESTAMO = "crearPrestamoMenu";
	public static String VERPRESTAMO = "verPrestamoMenu";
	
	public static String BUSCARUSUARIOPRESTAMO = "buscarUsuarioP";
	public static String CREARPRESTAMOUSUARIO = "crearPresatamoUsuario";
	//PRUEBA 2
	public static String CREARPRESTAMOUSUARIODOS = "crearPresatamoUsuarioDos";
	
	public void enable(String window);
	public void disable(String window);
	public String[] capture(String window);
	public void show(String[][] exit, String window);
	public void showMessage(String message);
	
}
