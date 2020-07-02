package mis_ejercicios;
import java.util.Scanner;

public class Ejercicio7 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		System.out.println("ingrese un número");
		num1 = input.nextInt();
		
		System.out.println("ingrese un segundo número");
		num2 = input.nextInt();
		
		System.out.println("ingrese un tercer número");
		num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("El número mayor es el " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El número mayor es el " + num2);

		} else if (num1 == num2 && num1 == num3){
			System.out.println("Los números son iguales ");

		} else {
			System.out.println("El número mayor es el " + num3);

		}

		input.close();
		
	}

}
