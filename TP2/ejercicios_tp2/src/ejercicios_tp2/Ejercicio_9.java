package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_9 {

	private static Scanner input = new Scanner (System.in);

	private static void mejorPromedio() {
		for( int i = 0 ; i < 5 ; i++) {

			int num1, num2, num3;
			double promedio;

			System.out.println("Ingrese un valor");
			num1 = input.nextInt();

			System.out.println("Ingrese un valor");
			num2 = input.nextInt();

			System.out.println("Ingrese un valor");
			num3 = input.nextInt();

			promedio = (double) (num1 + num2 + num3) / 3;

			System.out.println( "\n" + "Mejor Promedio de los números ingresados " + promedio + "\n");
		}

	}

	public static void main(String[] args) {

		mejorPromedio();

		System.out.println("Terminamos el proceso de sacar los mejores promedios pedidos.");

	}

}
