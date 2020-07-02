package mis_ejercicios;
import java.util.Scanner;


public class Ejercicio11 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String fechaDeCompra, nombreComprador, productoSolicitado; 
		int cantidadSolicitada, precioUnitario, totalApagar;
		
		System.out.println(" Fecha del comprobante, de esté Formato YYYYMMDD --> 20200401");
		fechaDeCompra = input.nextLine();
		
		System.out.println("Ingrese Producto Solicitado");
		productoSolicitado = input.nextLine();
		
		System.out.println("Ingrese Nombre del comprador");
		nombreComprador = input.nextLine();
		
		System.out.println("Cantidad Solicitada");
		cantidadSolicitada = input.nextInt();
		
		System.out.println("Precio Unitario");
		precioUnitario = input.nextInt();
		
		totalApagar = cantidadSolicitada * precioUnitario;
		
		System.out.println("fecha de Compra: " + fechaDeCompra + "\n" + 
		"Nombre del Comprador: " + nombreComprador + "\n" + 
		"Producto Solicitado: " + productoSolicitado + "\n" + 
		"Cantidad Solicitada: " + cantidadSolicitada + "\n" +
		"Precio Unitario: " + precioUnitario + "\n" +
		"Total a Pagar: " + totalApagar);;
		
		input.close();
	}

}
