package org.ip.sesion01;

public class EnteroAleatorio {

	public static void main(String[] args) {
		
		int maximo_numero_generado;
		int minimo_numero_generado;
		int numero_random;
		
		 maximo_numero_generado = 15;
		 minimo_numero_generado = -15;
		 numero_random = (int) (Math.random() * (maximo_numero_generado - minimo_numero_generado + 1) + minimo_numero_generado);
		 System.out.println("Vamos a generear un entero aleatorio entre -15 y 15 \n El entero generado aleatoriamente es:" + numero_random);
	

	}

}
