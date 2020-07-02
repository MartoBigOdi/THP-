package mis_ejercicios;
import java.util.Scanner;


public class Ejercicio12 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
			
		int dado;
		
		System.out.println("Ingrese los números de los tres dados tirados de esta manera 146");
		dado = input.nextInt();
		
		if(dado == 666) {
			System.out.println("Excelente");
			
		} else if (dado == 166) {
			System.out.println("Muy Bien");
			
		} else if (dado == 336){
			System.out.println("Regular");
			
		} else {
			System.out.println("Insuficiente");
			
		}
		
		input.close();
		
	}

}
