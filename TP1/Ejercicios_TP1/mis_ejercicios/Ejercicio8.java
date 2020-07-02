package mis_ejercicios;
import java.util.Scanner;

public class Ejercicio8 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String diaIngresado;
		
		System.out.println("Ingrese un número del 1 al 7");
		diaIngresado = input.next();
		
				switch (diaIngresado) {
					case "1":
						System.out.println("Es el dia Domingo");
					break;
					case "2":
						System.out.println("Es el dia Lunes");
					break;
					case "3":
						System.out.println("Es el dia Martes");
					break;
					case "4":
						System.out.println("Es el dia Miércoles");
					break;
					case "5":
						System.out.println("Es el dia Jueves");
					break;
					case"6":
						System.out.println("Es el dia Viernes");
					break;
					case"7":
						System.out.println("Es el dia sabado");
					break;
					default:
						System.out.println("No ingreso ningún número para el día");

				}
				
				input.close();
		
	}

}
