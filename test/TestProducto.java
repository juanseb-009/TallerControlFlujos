package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Producto p1 = new Producto("Papas", 0);
		
		p1.setPrecio(-6.75);
		
		System.out.println(p1.validarPrecio());
		p1.calcularPrecioPromo(0.70);
	}

}
