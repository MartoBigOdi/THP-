package ejercicios_tp2;
import java.util.Scanner;

public class Parcial_Casino_Timba {

	
	//Definimos las constantes a utilizar. NO OLVIDARSE DE PONER "private static".
	private static final int COSTO_RULETA = 100;
	private static final int COSTO_BLACK_JACK = 200;
	private static final int COSTO_POKER = 500;
	private static final int DINERO_MAX = 5000;
	
	
	
	
	//Traemos el Scanner para usar lo luego.
	private static Scanner input = new Scanner (System.in);
	
	
	
	//Validamos el dinero que trae para poder decidir si ingresa o no.
	private static int dineroInicial() {
		
		int dineroIngresado;
		
		do {
			System.out.println("Ingrese el dinero que trajo para poder jugar");
			dineroIngresado = input.nextInt();
			input.nextLine();//Atento que dsp de poner un NEXTINT necesitamos poner siempre un NEXLINE. 

		} while (dineroIngresado < 500 ); //Estar atento a la condición.
		    
		System.out.println("Puede ingresar, Disfrute del juego");


		return dineroIngresado ;
	}
	
	
	
	//Le pedimos nombre del jugador a procesar.
	private static String pedirNombreCliente() {

		String nombre;

		do {
			System.out.println("Ingrese Nombre");
			nombre = input.nextLine();
			
		} while (nombre.contentEquals(""));

		return nombre;
	}
	
	
	
		
	//Pedimos el tipo de juego para saber su costo.
	private static String juegoElegido() {

		String juego;

		do {
			System.out.println("Elija el juego (RUL, POK o BLJ)");
			juego = input.nextLine();
		} while (!juego.contentEquals("RUL") && !juego.contentEquals("POK") && !juego.contentEquals("BLJ"));

		return juego;
	}
	
	
	
	
	//Sacamos el costo del juego elegido.
	private static int costoJuego(String juego) {
		int valor;
		
		if(juego.contentEquals("RUL")) {
			valor = COSTO_RULETA;
			
		} else if (juego.contentEquals("POK")) {
			valor = COSTO_POKER;
			
		} else {
			valor = COSTO_BLACK_JACK;
		}
		return valor;
	}
	
	
	
	
	//Obtenemos de manera random los numeros del 0 al 2
	private static int obtenerResultado() {
		
		return (int) (Math.random() * 3); // para que devuelva valores entre 0 y 3
	}
	
	
	
	
	//Sacamos la ganacia del juego
	private static int obtGanancia(int elCosto) { 
		return elCosto*obtenerResultado();
	}

	
	
	//Mostramos los datos que pide.
	private static  void  mensajeFinal(int dinero, int cantJuegosRuleta, int cantJuegosPoker, int cantJuegosBlackJack, int totalJugadas) {
		
		System.out.println("El dinero restante es " + dinero);
		System.out.println("Jugaste a la Ruleta: " + cantJuegosRuleta + " / Su porcentaje sobre el total de las jugadas es de " + obtPorcentaje(cantJuegosRuleta,totalJugadas));
		System.out.println("Jugaste al Poker: " + cantJuegosPoker + " / Su porcentaje sobre el total de las jugadas es de " + obtPorcentaje(cantJuegosPoker,totalJugadas));
		System.out.println("Jugaste al Black Jack: " + cantJuegosBlackJack + " / Su porcentaje sobre el total de las jugadas es de " + obtPorcentaje(cantJuegosBlackJack,totalJugadas));
	}
	
	
	//Las traje del código del profesor
	private static double obtPorcentaje(int parcial, int total){ 
			return (double)parcial*100/(double)total;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int cantJuegosPoker = 0;
		int cantJuegosRuleta = 0;
		int cantJuegosBlackJack = 0;
		int totalJugadas = 0;
		int dinero = dineroInicial();
		double dineroMinJuego = (int) dinero * 0.02;
		String nombreJugador = pedirNombreCliente();
		int dineroGanado = 0;
	
		while(dinero > dineroMinJuego && dinero >= COSTO_RULETA && dineroGanado < DINERO_MAX) {
			
			//Pido los datos para jugar
			String juegoAjugar = juegoElegido(); 
			int costoPorJugar = costoJuego(juegoAjugar);
		
			if(dinero >= 500 ) {
				
				dinero = dinero - costoPorJugar;
				
				totalJugadas = totalJugadas + 1;
				
				int ganancia = obtGanancia(costoPorJugar);
		
				dinero = dinero + ganancia;
				
				dineroGanado = dineroGanado + ganancia;
				
				
				if(juegoAjugar.contentEquals("POK")) {
					cantJuegosPoker++;
					
				} else if (juegoAjugar.contentEquals("RUL")) {
					cantJuegosRuleta++;
					
				} else {
					cantJuegosBlackJack++;
				}
				
				
				
				/*
				//Debug
				System.out.println(nombreJugador + " <---- Nombre Jugador");
				System.out.println(juegoAjugar + " <----Juego Elegido");
				System.out.println(dineroMinJuego + " <---- Dinero Min para jugar");
				System.out.println(costoPorJugar + " <---- Costo por juego");
				System.out.println(dinero + " <---- Dinero que trajo para jugar");
				System.out.println(dineroGanado + " <---- Acumulador de Dinero ganado");
				System.out.println(cantJuegosPoker + " <---- cantidad de juego POK");
				System.out.println(cantJuegosRuleta + " <---- cantidad de juego RUL");
				System.out.println(cantJuegosBlackJack + " <---- cantidad de juego BLJ");
				System.out.println(ganancia + " <---- ganancia del juego");
				*/
				
				
				
			} else {
				 
				System.out.println("No alcanza para juagr");
				
			}
		}
	
		mensajeFinal(dinero, cantJuegosRuleta, cantJuegosPoker, cantJuegosBlackJack, totalJugadas);
		System.out.println("Fin del juego");

	}
}
