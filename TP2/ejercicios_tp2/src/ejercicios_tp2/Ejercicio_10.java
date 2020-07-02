package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_10 {

	
	private static Scanner input = new Scanner(System.in);
	
	
	private static final int FIN = 0;
	
	
	private static void mensajeFinal(String ganador, int promedioSegundos, int corredoresMenosHs) {
		
		System.out.println("El ganador es " + ganador);
		System.out.println("El promedio en segundos es de: " + promedioSegundos);
		System.out.println("El porcentaje de menos de 1 hs es % " + corredoresMenosHs);
		
	
	}
	
	
	private static int segundos(int hsCorredor, int minutosCorredor, int segundosCorredor) {
		
		int totalSegundos = (hsCorredor * 60 * 60) + (minutosCorredor * 60) + segundosCorredor;
		
		return totalSegundos;
		
	}
	
	
	private static int corredorNumero() {
		
		int numero;
	
		System.out.println("Ingrese Número de Corredor (INGRESAR 0 PARA TERMINAR DE PROCESAR)");
		numero= Integer.parseInt(input.nextLine());
	
	
		return numero;
	}
	
	

	
	public static void main(String[] args) {
		
		
		String nombreCorredor = "";
		int numeroCorredor = corredorNumero();
	    int hsCorredor;
	    int minutosCorredor;
	    int segundosCorredor;
	    int totalSegundosCorredor;
	    int cantCorredores = 0;
	    int promedioSegundos = 0;
	    int corredoresMenosHs = 0;
	    int mejorTiempo = 10000;
	    String ganador = "";
	    
		
	 while(numeroCorredor > FIN && numeroCorredor != FIN) {
		 
		 
		 System.out.println("Ingrese nombre del corredor");
		 nombreCorredor = input.nextLine();
		 
		 do {
		 System.out.println("ingrese las hs");
		 hsCorredor = Integer.parseInt(input.nextLine());
		 } while (hsCorredor < 0);
		 
		 do {
		 System.out.println("Ingrese los minutos");
		 minutosCorredor = Integer.parseInt(input.nextLine());
		 } while (minutosCorredor > 60 || minutosCorredor < 0);
		 
		 do {
		 System.out.println("Ingrese los segundos");
		 segundosCorredor = Integer.parseInt(input.nextLine());
		 } while (segundosCorredor > 60 || segundosCorredor < 0);
		 
		 if (minutosCorredor < 60 ) {
			 corredoresMenosHs ++;
		 }
			 
		 cantCorredores ++;
		 
		 totalSegundosCorredor = segundos(hsCorredor, minutosCorredor, segundosCorredor);
		 
		 if(totalSegundosCorredor < mejorTiempo) {
		 mejorTiempo = totalSegundosCorredor;
		 ganador = nombreCorredor;
		 }
		 
		 promedioSegundos = totalSegundosCorredor / cantCorredores;
		 
		 corredoresMenosHs = (totalSegundosCorredor / segundosCorredor) * 100;
		 
		 numeroCorredor = corredorNumero();
		 
	 }

	 mensajeFinal(ganador, promedioSegundos, corredoresMenosHs);
	 
	 input.close();
	 
	}
	
}
