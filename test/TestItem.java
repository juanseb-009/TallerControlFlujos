package com.cmc.repaso.test;

import com.cmc.repaso.entidades.item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		item item1 = new item();
		item1.setNombre("Teclado"); 
		item1.setProductosActuales(20);
		
		System.out.println("Valores iniciales de Teclado");
		item1.imprimir();
		System.out.println("*******************************************");
		
		item1.vender(5);
		System.out.println("Despues de vender 5 unidades");
		item1.imprimir();
		System.out.println("*******************************************");

		
		item1.devolver(2);
		System.out.println("Despues de devolver 2 unidades");
		item1.imprimir();
		System.out.println("*******************************************");

		
		System.out.println("----------------ITEM 2------------------");
		item item2 = new item();
		item2.setNombre("Bateria"); 
		item2.setProductosActuales(54);
		System.out.println("*******************************************");

		
		System.out.println("Valores iniciales de Bateria");
		item2.imprimir();
		System.out.println("*******************************************");

		
		item2.vender(15);
		System.out.println("Despues de vender 15 unidades");
		item2.imprimir();
		System.out.println("*******************************************");

		
		item2.devolver(6);
		System.out.println("Despues de devolver 6 unidades");
		item2.imprimir();
		System.out.println("*******************************************");

		
		
	}

}
