package mis_ejercicios;
import java.util.Scanner;


public class Ejercicio13 {
	
	private static Scanner input = new Scanner (System.in);
	
	public static final int hsExtra = 20;
	
	public static final int hsNormal = 16;

	public static void main(String[] args) {
		
		int hsTrabajadas, sueldoTotal, plusHsExtras, cantidadHsExtras;
		
		System.out.println("Ingrese las hs trabajadas");
		hsTrabajadas = input.nextInt();
		
		if (hsTrabajadas < 40) {
			
			sueldoTotal = 40 * hsNormal;
			
			System.out.println("Su sueldo es " + sueldoTotal);
			
		} else if(hsTrabajadas > 40) {
			
			plusHsExtras = (hsTrabajadas - 40) * hsExtra;
			
			cantidadHsExtras = (hsTrabajadas - 40);
			
			hsTrabajadas = hsTrabajadas - cantidadHsExtras;
			
			sueldoTotal = (hsTrabajadas * hsNormal) + (plusHsExtras);
			
			System.out.println("Su sueldo es " + sueldoTotal);

		}
		
		input.close();
		
	}

}
