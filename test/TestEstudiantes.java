package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiantes;

public class TestEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiantes E1 = new Estudiantes("Juan");
		Estudiantes E2 = new Estudiantes("Sol");
		Estudiantes E3 = new Estudiantes("Sebastian");
		Estudiantes E4 = new Estudiantes("María");
		
	
		System.out.println(E1.getNombre());
		E1.calificar(8, "N");
		System.out.println(E2.getNombre());
		E1.calificar(10, "N");
		System.out.println(E3.getNombre());
		E1.calificar(3, "N");
		System.out.println(E4.getNombre());
		E1.calificar(5, "N");
	
	}

}
