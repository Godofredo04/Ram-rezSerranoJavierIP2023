package org.ip.sesion01;

public class Circunferencia {
	
	public static void main(String[] args) {
		double radio = 4.5;
		double longitud = 2 * Math.PI * radio;
		double area = Math.PI * Math.PI * Math.pow(radio, 2.0);
		
		System.out.println("Radio = " + radio);
		System.out.println();
		System.out.printf("Longitud de la circunferencia = %.4f" , longitud);
		System.out.println();
		System.out.printf("Area de la circunferencia = %.4f" , area);
		System.out.println();
	}

}
