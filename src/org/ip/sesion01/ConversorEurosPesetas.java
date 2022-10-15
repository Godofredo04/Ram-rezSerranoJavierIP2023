package org.ip.sesion01; 
import java.util.Scanner;

public class ConversorEurosPesetas {
	public static void main(String[] args) {
	
		double Pesetas;
		double Euros ;
		
		Scanner Temp = new Scanner(System.in);
		System.out.println("Introduce el número de euros:");
		Euros = Temp.nextDouble();
		Pesetas = Euros * 166.368;
		System.out.printf("Tu número de pesetas es: %.2f" , Pesetas);
		System.out.println();
		System.out.println("Introduce el número de pesetas:");
		Pesetas = Temp.nextDouble();
		Euros = Pesetas / 166.368;
		System.out.printf("Tu número de Euros es: %.2f" , Euros);
		
		
		
		
	}

}
