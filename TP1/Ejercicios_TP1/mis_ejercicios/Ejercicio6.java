package mis_ejercicios;
import java.util.Scanner;

public class Ejercicio6 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1;
		
		System.out.println("Ingrese un número > o ");
		
		num1 = input.nextInt();
	
		if (num1 % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");

		}
		
		input.close();
	}

}
