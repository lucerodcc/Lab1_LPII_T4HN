package models;

import org.hibernate.annotations.Columns;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@Column(name = "IdEmpleado")
	private int IdEmpleado;
	
	@Column(name = "Apellidos")
	private String Apellidos;
	
	@Column(name = "Nombres")
	private String Nombres;
	
	@Column(name = "Edad")
	private int Edad;
	
	@Column(name = "Sexo")
	private String Sexo;
	
	@Column(name = "Salario")
	private int Salario;
		
	
	//CONSTRUCTOR VACIO
	public Empleado() {
	}

	//CONSTRUCTOR	

	
	//METODOS GETTERS Y SETTERS
	public int getIdEmpleado() {
		return IdEmpleado;
	}
	
	//CONSTRUCTOR
	public Empleado(String apellidos, String nombres, int edad, String sexo, int salario) {
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.IdEmpleado = idEmpleado;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		this.Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		this.Nombres = nombres;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		this.Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		this.Salario = salario;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + IdEmpleado + ", apellidos=" + Apellidos + ", nombres=" + Nombres + ", edad="
				+ Edad + ", sexo=" + Sexo + ", salario=" + Salario + "]";
	}
	
	
	
}
