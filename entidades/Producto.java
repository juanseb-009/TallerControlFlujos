package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		
	}
	public boolean validarPrecio() {
		if (precio < 0) {
			this.precio = precio * -1;
			
		
		}
		System.out.println("Precio validado: " + this.precio);
		return true;
		
	}
	public void calcularPrecioPromo(double porcentaje) {
		this.precio = precio * porcentaje;
		System.out.println("El precio en promo es: " + this.precio);
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
		
	}

}
