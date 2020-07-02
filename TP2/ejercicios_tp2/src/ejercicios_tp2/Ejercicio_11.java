package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_11 {

	private static Scanner input = new Scanner(System.in);

	private static int sumaSucesiva(int num1, int num2){
		int producto = 0;

		for(int i = 0; i < num2; i++){
			producto= producto+num1;
		}
		return producto;
	}

	private static int pediNumeroPositivo(String mensaje){
		int numero;

		do{
			System.out.println(mensaje);
			numero = input.nextInt();
		}while(numero < 1);

		return numero;
	}

	public static void main(String[] args) {
		int numA = 0, numB = 0, producto;

		numA = pediNumeroPositivo("Ingrese el primer valor (tiene que ser un entero positivo): ");
		numB = pediNumeroPositivo("Ingrese el segundo valor (tiene que ser un entero positivo): ");

		producto = sumaSucesiva(numA, numB);

		System.out.println("El producto es: " + producto);
	}

}
