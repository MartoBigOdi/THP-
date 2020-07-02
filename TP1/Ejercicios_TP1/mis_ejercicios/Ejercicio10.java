package mis_ejercicios;
import java.util.Scanner;


public class Ejercicio10 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int horaIngresada;
		Boolean estaAbierto;
		
		System.out.println("Ingrese que hora es, en dos dígitos EJ: 13; 14; 17");
		horaIngresada = input.nextInt();
		
				if (horaIngresada < 0 || horaIngresada > 24) {
					System.out.println("Ingreso incorrecto de la hora");
					
				} else {
		
						if (horaIngresada >= 10 && horaIngresada < 18 ) {
							estaAbierto = true;
						} else {
							estaAbierto = false;
						}
				
						if(estaAbierto) {
							System.out.println("El garage está abierto");
						} else {
							System.out.println("El garage está cerrado");
		
						}
				
			}
				input.close();
		
		
	}

}
