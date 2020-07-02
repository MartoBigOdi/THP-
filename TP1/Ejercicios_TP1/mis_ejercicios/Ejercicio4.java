package mis_ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
	
	private static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		
		int num1, num2;
		
		System.out.println("Ingrese un número");
		num1 = input.nextInt();

		System.out.println("ingrese un segundo numero");
		num2 = input.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("Esta es la suma de " + num1 + " + " + num2 + " y da como resultado " + "= " + suma);
	}

}
