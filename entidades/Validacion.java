package com.cmc.repaso.entidades;

public class Validacion {
	public void ValidadMonto(double monto) {
		
		if(monto > 0) {
			boolean validado;
			validado = true;
			System.out.println("La validacion del monto es " + monto + " = " +validado );
			
		}
		else {
			boolean validado;
			validado = false;
			System.out.println("La validacion del monto es " +  monto + " = " +validado );
			
		}
	
		
	}
}
