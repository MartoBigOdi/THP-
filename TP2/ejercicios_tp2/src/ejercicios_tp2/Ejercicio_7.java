package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_7 {

	private static Scanner input = new Scanner (System.in);

	public static void validacionPass() {

		String usuario = "Marto";
		String password = "123456";
		String usuarioIngresado;
		String passIngresado;
		int intento = 0;

		do {

			System.out.println("Ingrese el Usuario");
			usuarioIngresado = input.nextLine();

			System.out.println("Ingrese el password");
			passIngresado= input.nextLine();

			intento ++;
		}

		while (!(usuarioIngresado.contentEquals(usuario) || passIngresado.contentEquals(password)) && intento < 3); 

		if (usuarioIngresado.contentEquals(usuario) && passIngresado.contentEquals(password)) {
			
			System.out.println("Ha ingresado correctamente");
			
		} else {
	
			System.out.println("Se ha bloqueado su cuenta");
		}	
			
	}		
		
	public static void main(String[] args) {

		validacionPass();

	}

}
