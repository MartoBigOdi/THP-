package ejercicios_tp2;
import java.util.Scanner;

public class ejercicio_4 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1,
		num2;

		do {

			System.out.println("Ingrese un número");
			num1 = input.nextInt();

			System.out.println("Ingrese otro número mayor al primero ingresado");
			num2 = input.nextInt();

		} while(num2 < num1); 
		
		int reservaNum1 = num1;
		
		System.out.println("Incluyendo");
		while(reservaNum1<= num2){
			
			System.out.println(reservaNum1);
			
			reservaNum1++;
		}
		
		reservaNum1 = num1;
		
		System.out.println("Excluyendo");
		while(reservaNum1 < (num2-1)){

			reservaNum1++;

			System.out.println(reservaNum1);
		}

	}
}


