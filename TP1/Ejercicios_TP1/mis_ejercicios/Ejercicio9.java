package mis_ejercicios;
import java.util.Scanner;

public class Ejercicio9 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String aportanteA, aportanteB, aportanteC;
		
		double porcentajeA, porcentajeB, porcentajeC;
		
		int montoTotal, montoA, montoB, montoC;
		
		System.out.println("Ingrese nombre del aportante");
		aportanteA = input.nextLine();
		
		System.out.println("Ingrese el nombre del aportante");
		aportanteB = input.nextLine();
		
		System.out.println("Ingrese el nombre del aportante");
		aportanteC = input.nextLine();

		System.out.println("Ingrese el monto a aportar de " + aportanteA);
		montoA = input.nextInt();
		
		System.out.println("Ingrese el monto a aportar " + aportanteB);
		montoB = input.nextInt();
		
		System.out.println("Ingrese el monto a aportar " + aportanteC);
		montoC = input.nextInt();
		
		montoTotal = montoA + montoB + montoC;
		
		porcentajeA = (montoA * 100) /montoTotal;
		
		porcentajeB = (montoB * 100) /montoTotal;
		
		porcentajeC = (montoC * 100) /montoTotal;
		
		System.out.println("MONTO TOTAL APORTADO: " + montoTotal);
		System.out.println("Nombre: " + aportanteA + " Aporte: " + montoA + " Porcentaje del total: " + porcentajeA + " %");
		System.out.println("Nombre: " + aportanteB + " Aporte: " + montoB + " Porcentaje del total: " + porcentajeB + " %");
		System.out.println("Nombre: " + aportanteC + " Aporte: " + montoC + " Porcentaje del total: " + porcentajeC + " %");
		
		input.close();
		
	}

}
