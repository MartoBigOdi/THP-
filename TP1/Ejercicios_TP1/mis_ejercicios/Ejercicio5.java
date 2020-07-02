package mis_ejercicios;
import java.util.Scanner;


public class Ejercicio5 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		System.out.println("ingrese un número");
		num1 = input.nextInt();
		
		System.out.println("ingrese un segundo número");
		num2 = input.nextInt();
		
		if (num2 <= 0) {
			System.out.println("No se puede dividir por 0 "
					+ "o números negativos ");
		} else {
		
		double div = num1 / num2;
		
		System.out.println( num1 + " / " + num2 + " = " + div);
	
		}
		
		input.close();
	}

}
