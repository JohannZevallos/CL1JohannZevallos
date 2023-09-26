package com.cibertec.modelo;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmple;
	private String apellidos;
	private String nombres;
	private int edad;
	private String genero;
	private double salario;
	
	
	public Empleado() {
		
	}


	public Empleado(int idEmple, String apellidos, String nombres, int edad, String genero, double salario) {
		super();
		this.idEmple = idEmple;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.genero = genero;
		this.salario = salario;
	}


	public int getIdEmple() {
		return idEmple;
	}


	public void setIdEmple(int idEmple) {
		this.idEmple = idEmple;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//////////////////////////////////////////
	/*public String CalcularEdad() {
		
		if (edad >= 18) {
            return "La persona tiene " + edad;
        } 
       
		else {
            return "La persona es menor de 18 años.";
        }
    }*/
	
	/*public String GeneroEmple() {
	 
	if (genero="M") { 
	    System.out.println("El sexo es masculino.");
	} else if (genero="F") {
	   
	    System.out.println("El sexo es femenino.");
	
	}*/	
	
	
	/*public String SalarioEmple() {
		if (salario >= 1500 && salario <= 2500) {
			return "El sueldo está en el rango de 1500 a 2500."+ salario;
		
		    } else {	    
		    	return"El sueldo no está en el rango de 1500 a 2500.";
		    }
			  
		}*/

}
