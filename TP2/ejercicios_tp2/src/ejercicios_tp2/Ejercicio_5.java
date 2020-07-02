package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_5 {

	private static Scanner input = new Scanner(System.in);
	
	public static void promedioMenorA20() {
		int num1, num2, num3;
		double promedio; 	
		
		do {

			System.out.println("Ingrese un valor");
			num1 = input.nextInt();

			System.out.println("Ingrese un valor");
			num2 = input.nextInt();

			System.out.println("Ingrese un valor");
			num3 = input.nextInt();	

			promedio = (num1 + num2 + num3) / 3;
			
		}  while(promedio > 20); 

			System.out.println("Estos son los números ingresados " + "\n" + num1  + " " + num2 + " " + num3);
		
			System.out.println("El promedio es " + promedio);

	}

	public static void main(String[] args) {
		
		promedioMenorA20();
		
	}

}
