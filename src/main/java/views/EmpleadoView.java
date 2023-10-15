package views;

import controllers.EmpleadoController;


public class EmpleadoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String empleado;		//variable usuario para llamar al controlador
		
		
		//---------------------Metodo CreateUsuario---------------------------------
	//	empleado = new EmpleadoController().createEmpleado("Suanzes", "Luis", 30, "Masculino", 1200);
	//	empleado = new EmpleadoController().createEmpleado("Peres", "Manuel", 35, "Masculino", 1500);
			
		//---------------------Metodo DeleteUusario-----------------------------------
	//	empleado = new EmpleadoController().eliminarEmpleado(3);
	//	empleado = new EmpleadoController().eliminarEmpleado(5);
		
		//---------------------Metodo UpdateUsuario-----------------------------
	//	empleado = new EmpleadoController().upDateEmpleado(6, "Monte");
	//	empleado = new EmpleadoController().upDateEmpleado(7, "Sanchez");
		
		//---------------------Metodo GetUsuario---------------------------------------------
	//	empleado = new EmpleadoController().getEmpleado(6);
		empleado = new EmpleadoController().getEmpleado(7);
		System.out.println(empleado);

	}

}
