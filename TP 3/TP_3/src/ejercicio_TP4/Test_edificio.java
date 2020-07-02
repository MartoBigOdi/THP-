package ejercicio_TP4;

public class Test_edificio {

	public static void main(String[] args) {
		
		Edificio edificio = new Edificio("Cucha Cucha 958", 10);
		
		//Agreagmos departamentos
		edificio.agregarUnidad("3", "33408629", "Martin Vasconcelo");
		edificio.agregarUnidad("1", "33456689", "Matias Lopez");
		edificio.agregarUnidad("2", "26456909", "Soledad Fernandez");
		edificio.agregarUnidad("4", "30456789", "Anibal Puyol");
		
		//Departamentos repetidos, devuelve mensaje.
		edificio.agregarUnidad("3", "33408629", "Martin Vasconcelo");
		edificio.agregarUnidad("3", "33408629", "Martin Vasconcelo");
		edificio.agregarUnidad("1", "33456689", "Matias Lopez");
	
		//Actualizando saldos.
		edificio.actualizarSaldo("3", -4450);
		edificio.actualizarSaldo("1", 1500);

		//Probamos lista de morosos
		edificio.pasarAmoroso("3");
		
		//Mostrar la lista de morosos.
		edificio.mostrarListaMorosos();
		
		
		System.out.println(edificio); 
	}

}
