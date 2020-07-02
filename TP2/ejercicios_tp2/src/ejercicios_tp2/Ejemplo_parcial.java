package ejercicios_tp2;
import java.util.Scanner;

public class Ejemplo_parcial {


	private static Scanner input = new Scanner(System.in);


//Le pedimos nombre del chofer a procesar.
	private static String pedirChofer() {

		String nombreChofer;

		do {
			System.out.println("Ingrese Nombre del Chofer");
			nombreChofer = input.nextLine();
		} while (nombreChofer.contentEquals(""));

		return nombreChofer;
	}

	
	
	
//Le pedimos los km del viaje.
	private static double pedirKm() {

		double kmViaje;

		do {
			System.out.println("Ingrese los km del viaje (SI INGRESA 0 TERMINA DE PROCESAR DATOS)");
			kmViaje = input.nextInt();
		} while (kmViaje < 0 || kmViaje > 500); //Estar atento a como hago la condición. 

		return kmViaje;

	}

	
	
	
//Le pedimos la cat del auto.	
	private static String catAuto() {

		String catGama;

		do {
			System.out.println("Ingrese la categoria de la gama del vehículo (a, m o e)");
			catGama = input.next();
		} while (!catGama.contentEquals("a") && !catGama.contentEquals("m") && !catGama.contentEquals("e"));

		return catGama;
	}

	

	
//Le peidmos el porcentaje según la gama del auto.	
	private static double obtenerPorcDesg(String catGama) {

		double el_porcent=0;

		//Pasamos a miníscula el dato ingresado. y hacemos un switch.
		switch (catGama.toLowerCase()) {

		case "a":

			el_porcent = 0.06;

			break;

		case "m":

			el_porcent = 0.04;

			break;

		case "e":

			el_porcent = 0.02;

			break;	

		default:

			el_porcent = 0;

		}

		return el_porcent;

	}
	
	
	

//Le pedimos los minutos de la espera.	
	private static int tiempoEspera() {
		
		int mnEspera;

		do {
			System.out.println("Ingrese los minutos de espera");
			mnEspera = input.nextInt();

		} while (mnEspera < 0 || mnEspera > 120); //Estar atento a la condición.

		return mnEspera;

	}
	
	

	
//Valor de los km según su cantidad recorrida.	
	private static double valorKmViaje(double kmViaje) {
		
		double valorKm;
		
		if(kmViaje <= 50) {
			valorKm = 7;
		} else if (kmViaje <= 120) {
			valorKm = 5;
		} else {
			valorKm = 3;
		}
		
		return valorKm;
	}

	
	
	
	public static void main(String[] args) {

		//Variables 
		String chofer = pedirChofer();
		
		double kmDelViaje = pedirKm();
		
		final int VALOR_MIN_ESPERA = 2;
		
		int cantViajesHechos = 0;
		
		
		//Inicio ciclo

		
		while(kmDelViaje != 0) {
			
		cantViajesHechos ++;	
		
		double minEspera = tiempoEspera();
		
		String gamaCoche = catAuto();
		
		double porcentajeGamaDesg = obtenerPorcDesg(gamaCoche);
		
		double valorKm = valorKmViaje(kmDelViaje);
		
		double importeEspera = VALOR_MIN_ESPERA * minEspera;

		double importeKmViaje = kmDelViaje * valorKm;
		
		double importePlusDesg = importeKmViaje * porcentajeGamaDesg;
		
		double totalPagar = importeEspera + importeKmViaje + importePlusDesg;
		
		double importePormedioViajes = totalPagar / cantViajesHechos;
				
		System.out.println("Debe pagar a " + chofer + " el importe de " + totalPagar + " su importe promedio a cobrar es " + importePormedioViajes + "\n");
		
		kmDelViaje = pedirKm();
		
		} 
		
		System.out.println("Se termino la carga");
		
				
		/*
		System.out.println(porcentajeGamaDesg);
		System.out.println(VALOR_MIN_ESPERA);
		System.out.println(valorKm);
		System.out.println(minEspera);
		System.out.println(importeEspera);
		System.out.println(importeKmViaje);
		System.out.println(importePlusDesg);
		*/

		input.close();
		
	}

}
