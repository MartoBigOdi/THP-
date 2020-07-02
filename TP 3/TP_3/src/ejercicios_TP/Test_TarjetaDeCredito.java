package ejercicios_TP;

public class Test_TarjetaDeCredito {
	
	public static void main(String[] args) {
		
		
		TarjetaDeCredito tarjeta1;
		
		tarjeta1 = new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000); //Instanciamos la primer 
																					//Tarjeta del banco.
		
		
		if(tarjeta1.realizarCompra(4000)){
			System.out.println("Se realizó la operación con éxito.");
		} else {
			System.out.println("No se pudo realiza la operación.");
		}
		
		System.out.println(tarjeta1.toString());
		
		
		tarjeta1.actualizarLimiteCompra(3000);//Actualizamos el límite de compra
		
		if(tarjeta1.realizarCompra(4000)){
			System.out.println("Se realizó la operación con éxito.");
		} else {
			System.out.println("No se pudo realizar la operación.");
		}
		
		System.out.println(tarjeta1.toString());
		

	}

}


