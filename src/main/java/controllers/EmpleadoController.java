package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;



/*grud*/
public class EmpleadoController {

	//Creacion deL Empleado
		public String createEmpleado (String apellidos, String nombres, int edad, String sexo, int salario) {
			
			SessionFactory sessionFactory;	//se crea una sessiom
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
			
			Session session;
			session = sessionFactory.openSession();	//se abre la sessino
			
			try {
				Empleado empleado;
				empleado = new Empleado(apellidos, nombres, edad, sexo, salario);
				
				session.beginTransaction();		//aqui inicia la transaccion
				session.save(empleado);			//se guarda la transaccion
				session.getTransaction().commit();		//commint() : confirma el registro de la grabacion
				
				sessionFactory.close(); 	//se cierra la sesion
				
				return "Empleado se ha Creado Correctamente";
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return "Error al crear empleado"; 	
			
		}
		
		//Eliminar Empleado
		
		
		public String eliminarEmpleado(int idempleado) {
			
			SessionFactory sessionFactory;		//se crea el asistente para la conexion
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
			
			Session session;
			session = sessionFactory.openSession();		//se abre la session con la conexion
			
			try {
				session.beginTransaction();		//se inicia  la transaccion		//la variable usuario contiene el id y el mapeo de la clase
				Empleado empleado = session.get(Empleado.class, idempleado);
				session.delete(empleado);//se crea un ob jeto de tipo usuario para poder eliminarlo
			//	session.delete(empleado);//aqui se registra la eliminacion, mas aun no se confirma la eliminacion en la data
				session.getTransaction().commit();	//Con el commit se confirma la eliminacion
				
				sessionFactory.close(); 	 //se cierra la session, aqui se cierra la conexion
											// al cerrar la conexion se cierra la session, ya no se tendria que cerrar la sesion
				return "Empleado Eliminado";
				
			} catch (Exception e) {

				e.printStackTrace();	//se imprime el error
			}
			
			return "Error al Eliminar Empleado";
		}
		
		//Actualizar o Modificar Empleado
		public String upDateEmpleado(int idempleado, String apellidos) {
			
			SessionFactory sessionFactory;		//se crea el asistente para la conexion
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
			
			Session session;
			session = sessionFactory.openSession();		//se abre la session con la conexion
			
			try {
				session.beginTransaction();		//se inicia  la transaccion		//la variable usuario contiene el id y el mapeo de la clase
				
				Empleado empleado = session.get(Empleado.class, idempleado);	//se crea un ob jeto de tipo usuario para poder eliminarlo
				empleado.setApellidos(apellidos);		//se le pasa u nuevo valor, usando set, para que ingrese un nuevo dato y quede almacenado
				session.update(empleado);		//se registra el cambio en memoria
				session.getTransaction().commit();       //Se confirma la transaccion
				
				sessionFactory.close();		//se ciera la session
				
				return "Empleado actualizado";
				
			} catch (Exception e) {

				e.printStackTrace();	//se imprime el error
			}
			
			return "Error al Actualizar Empleado";
		}
		
		//Leer o obtener Empleado
		public String getEmpleado(int idempleado) {
			SessionFactory sessionFactory;
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();  //crear la conexion
			 
			Session session;
			session = sessionFactory.openSession();		//abrir la conexion
			
			try {
				session.beginTransaction();
				Empleado empleado = session.get(Empleado.class, idempleado);
				session.getTransaction().commit();
				
				session.close(); 	//se cierra la session
				
				return empleado.toString();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			return "Empleado no existe";
			
		}
	
}
