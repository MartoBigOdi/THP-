package ejercicios_tp2;
import java.util.Scanner;

public class Parcial_ej_IVA {

	private static Scanner input = new Scanner(System.in);

	private static final double DESC_INSC = 0.08;
	private static final double DESC_MONO = 0.03;
	private static final double DESC_CFIN = 0;

	private static final double IVA_FERR = 0.21;
	private static final double IVA_PINT = 0.105;
	private static final double IVA_SANI = 0;


	//Pedimos la categoria del cliente.
	private static String categoriaCLiente() {

		String catCliente;

		do {
			System.out.println("Elija la categoria del Cliente (INSC, MONO o CFIN)");
			catCliente = input.nextLine();
		} while (!catCliente.contentEquals("INSC") && !catCliente.contentEquals("MONO") && !catCliente.contentEquals("CFIN"));

		return catCliente;
	}


	//Pedimos el rubro del cliente.
	private static String rubroPedido() {

		String rubroPedido;

		do {
			System.out.println("Elija el rubro (FERR, PINT o SANI)");
			rubroPedido = input.nextLine();
		} while (!rubroPedido.contentEquals("FERR") && !rubroPedido.contentEquals("PINT") && !rubroPedido.contentEquals("SANI"));

		return rubroPedido;
	}


	//Le pedimos el nombre.
	private static String pedirNombreCliente() {

		String nombre;

		do {
			System.out.println("Ingrese Nombre del cliente");
			nombre = input.nextLine();

		} while (nombre.contentEquals(""));

		return nombre;
	}



	//Le pedimos los km del viaje.
	private static int numeroPedido() {

		int numPedido;

		do {
			System.out.println("Ingrese Número de pedido(SI INGRESA 0 TERMINA DE PROCESAR DATOS)");
			numPedido = input.nextInt();
			input.nextLine();
		} while (numPedido < 0 || numPedido > 1000000); //Estar atento a como hago la condición. 

		return numPedido;

	}		



	//Le pedimos los km del viaje.
	private static double importeNetoPedido() {

		double importeNeto;

		do {
			System.out.println("Ingrese Importe Neto (del pedido)");
			importeNeto = input.nextInt();
			input.nextLine();
		} while (importeNeto < 0); //Estar atento a como hago la condición. 

		return importeNeto;

	}	



	//Mensaje Final
	private static  void  mensajeFinal(int cantPedidosDesc,int numPedidoMasBajo,String nombreClienteMasBajo, double importeTotalventaMasBaja) {

		System.out.println("Esta es la cantidad de pedidos con descuento: " + cantPedidosDesc);
		System.out.println("EL pedido más bajo de todos fue el de: " + nombreClienteMasBajo);
		System.out.println("Su número de pedido es: " + numPedidoMasBajo);
		System.out.println("Su importe total fué de: " + importeTotalventaMasBaja);
	}



	//Mensaje Final
	private static  void  mensajePedido(int numPedido, String nombreCliente, double importeTotal) {

		System.out.println("Número de Pedido: " + numPedido + "\n" + " Nombre Cliente: " + nombreCliente + " \n" + " Importe Total: " + importeTotal);
	}



	//Función para obtener el desc. 
	private static double obtenerDescuento(String descCateg) {

		double porcenDescCateg = 0;

		//Pasamos a mayuscula el dato ingresado. y hacemos un switch.
		switch (descCateg) {

		case "INSC":

			porcenDescCateg = DESC_INSC;

			break;

		case "MONO":

			porcenDescCateg = DESC_MONO;

			break;

		case "CFIN":

			porcenDescCateg = DESC_CFIN;

			break;	

		default:

			porcenDescCateg = 0;

		}

		return porcenDescCateg;

	}


	//Función para obtener el IVA. 
	private static double obtenerIVA(String rubroCliente) {

		double ivaRubro = 0;

		//Pasamos a miníscula el dato ingresado. y hacemos un switch.
		switch (rubroCliente) {

		case "FERR":

			ivaRubro = IVA_FERR;

			break;

		case "PINT":

			ivaRubro = IVA_PINT;

			break;

		case "SANI":

			ivaRubro = IVA_SANI;

			break;	

		default:

			ivaRubro = 0;

		}

		return ivaRubro;

	}



	//MAIN
	public static void main(String[] args) {


		int cantPedidosDesc = 0; 
		double importeTotalventaMasBaja = 100000000; //Buscamos Mím entonces iniciamos la variable alta. 
		int numPedido = numeroPedido();
		String nombreCliente = "";
		double porcenDescCateg = 0;
		double ivaRubro = 0;
		double importeDesc = 0;
		double importeTotal;
		String nombreClienteMasBajo = "";
		int numPedidoMasBajo = 0;
		double importeIva = 0; 
		double importeDescAplicado = 0;
		

		//comienza el ciclo
		while(numPedido != 0) { 

			nombreCliente = pedirNombreCliente();

			String catCliente = categoriaCLiente();

			String rubroPedido = rubroPedido();

			double importeNeto = importeNetoPedido();

			ivaRubro = obtenerIVA(rubroPedido);
			
			porcenDescCateg = obtenerDescuento(catCliente);
			
			//Prestar atención a los cálculos. Ir haciendo debug si o si. 
			importeDesc = importeNeto * porcenDescCateg;
			
			importeDescAplicado = importeNeto - importeDesc;
			
			importeIva = importeDescAplicado * ivaRubro;
		
			importeTotal = importeDescAplicado + importeIva;

			cantPedidosDesc ++;
			
			if(importeTotal < importeTotalventaMasBaja) {
				importeTotalventaMasBaja = importeTotal;
				nombreClienteMasBajo = nombreCliente;
				numPedidoMasBajo = numPedido;
			}
			
			mensajePedido(numPedido, nombreCliente, importeTotal);

			numPedido = numeroPedido();

		}

		mensajeFinal(cantPedidosDesc,numPedidoMasBajo,nombreClienteMasBajo,importeTotalventaMasBaja);

	}

}
