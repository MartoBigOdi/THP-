package mis_ejercicios;
import java.util.Scanner;

public class Ejercicio14 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		double num1 = 0, num2 = 0;
		String operacion;
		
		System.out.println("Ingrese que Operación aritmética desea hacer --> s = suma / r = resta / m = multiplicar / d = división");
		operacion = input.nextLine();
		
		System.out.println("Ingrese el primer número de la operación");
		num1 = input.nextDouble();
		
		System.out.println("Ingrese el segundo número de la operación");
		num2 = input.nextDouble();
		
		switch (operacion) {
		case "s": 
			double s = num1 + num2;
			System.out.println("El resultado es " + s);
		break;
		case "r": 
			double r = num1 - num2;
			System.out.println("El resultado es " + r);
		break;
		case "m": 
			double m = num1 * num2;
			System.out.println("El resultado es " + m);
		break;
		case "d": 
			double d = num1 / num2;
			System.out.println("El resultado es " + d);
		break;
		default: System.out.println("Debe ingresar números");
		
		}
		
		input.close();
		
	}

}
