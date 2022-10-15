package orgProyectosCasa;

public class CalculoIntereses2 {

	public static void main(String[] args) {
	
		final double ingreso = 2500.00 ;
		final double interes_anual = 0.0175 ;
		final double interes_seis_meses = (ingreso * interes_anual) / 2;
		final double retencion = (interes_seis_meses * 0.21);
		final double interes_cobrado = (interes_seis_meses - retencion);
		
		System.out.printf("Calculo de intereses \n Dinero ingresado: %.2f€ \n Interes anual: %.2f%% \n Interes a los 6 meses: %.2f€ \n Retencion realizada: %.2f€ \n Intereses cobrados: %.2f€" , ingreso , interes_anual * 100 , interes_seis_meses, retencion , interes_cobrado );

	}

}
