package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Validacion v1 = new Validacion();
		
		v1.ValidadMonto(10);
		v1.ValidadMonto(0);
		v1.ValidadMonto(0.5);
	}

}
