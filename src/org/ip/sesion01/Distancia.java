package org.ip.sesion01;

public class Distancia {
	public static void main(String[] args) {
		
		double XUno = 3;
		double XDos = 5;
		double XTres = 2;
		double YUno = 4;
		double YDos = 12;
		double YTres = 1;
		
		double Primerasolucion = Math.sqrt(XUno * XUno + YUno*YUno);
		double Segundasolucion = Math.sqrt(XDos * XDos + YDos*YDos);
		double Tercerasolucion = Math.sqrt(XTres * XTres + YTres*YTres);
		
		System.out.printf("La distancia del punto (3,5) al punto (0,0) es:" + Primerasolucion);
		System.out.println();
		System.out.printf("La distancia del punto (5,12) a (0,0) es:" + Segundasolucion);
		System.out.println();
		System.out.printf("La distancia del punto (2,1) al punto (0,0) es:" + Tercerasolucion);
		
	  
		
	}

}
