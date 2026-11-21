package com.cmc.repaso.entidades;

public class item {
	
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	
	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Productos Actuales: " + this.productosActuales);
		System.out.println("Productos Devueltos: " + this.productosDevueltos);
		System.out.println("Productos vendidos: " + this.productosVendidos);
		
	}
	public void vender(int cantidad) {
		this.productosActuales -= cantidad;
		this.productosVendidos += cantidad;
		
		
	}
	public void devolver(int cantidad) {
		
		this.productosActuales += cantidad;
		this.productosVendidos -= cantidad;
		this.productosDevueltos += cantidad;
		
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

}
