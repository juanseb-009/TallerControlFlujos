package com.cmc.repaso.entidades;

public class Estudiantes {
	
	private String nombre;
	private double nota;
	private String resultado;
	
	public Estudiantes(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void calificar(double nota, String resultado) {
		
		
		
		this.nota = nota;
		this.resultado = resultado;
		
		if(nota < 8 ) {
			resultado = "F";
			
			System.out.println("Su resultado es: " + nota + " = " + resultado );
			
		}
		else if(nota >= 8) {
			resultado = "A";
			
			System.out.println("Su resultado es: " + nota + "=" + resultado);
			
		}
		
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
