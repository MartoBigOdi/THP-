package mis_ejercicios;
import java.util.Scanner;

public class Ejercicio15 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		boolean estaEnA = false;

		boolean estaEnB = false;

		boolean estaEnAmbos = false;

		boolean noEstaEnNinguno = false;

		int suEntero;

		

		System.out.println("ingrese un nro. entero");

		suEntero = input.nextInt();

		

		if (suEntero > 0 && suEntero < 10) {

			if (suEntero % 2 != 0) {

				estaEnAmbos = true;

			} else {

				estaEnA = true;

			}

		} else {

			if (suEntero % 2 != 0) {

				estaEnB = true;

			} else {

				noEstaEnNinguno = true;

			}

		}
		
		input.close();
	}
	
	
}


