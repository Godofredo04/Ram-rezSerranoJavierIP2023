package org.ip.sesion01;

public class CalculoIntereses {

	public static void main(String[] args) {
		
	final double ingreso = 2500.00 ;
	final double interes_anual = 0.0175 ;
	final double interes_seis_meses = (ingreso * interes_anual) / 2;
	final double retencion = (interes_seis_meses * 0.21);
	final double interes_cobrado = (interes_seis_meses - retencion);
	
	System.out.println("Calculo de intereses");
	System.out.println();
	System.out.printf("Dinero ingresado: %.2f€" , ingreso);
	System.out.println();
	System.out.printf("Interes anual: %.2f%%" , interes_anual * 100);
	System.out.println();
	System.out.printf("Interes a los 6 meses: %.2f€" , interes_seis_meses);
	System.out.println();
	System.out.printf("Retencion realizada: %.2f€" , retencion);
	System.out.println();
	System.out.printf("Intereses cobrados: %.2f€" , interes_cobrado);
	}

}
