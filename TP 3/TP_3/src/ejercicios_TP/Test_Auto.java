package ejercicios_TP;

public class Test_Auto {

	public static void main(String[] args) {
			
		Automovil auto1;
		
		auto1 = new Automovil("Ford", "Fiesta", "ABCD 123", 40);
		
		//Setiamos el rendimiento por litro.
		auto1.setRendimientoLitro(10);
		System.out.println(auto1.cargarCombustible(30));
		System.out.println(auto1.viajar(20));
		System.out.println(auto1.viajar(20));
		System.out.println(auto1.cargarCombustible(14));
		System.out.println(auto1.viajar(20));
		System.out.println(auto1.viajar(2000));
		System.out.println(auto1.viajar(120));
		System.out.println(auto1.viajar(2000));
		System.out.println(auto1.viajar(260));
		System.out.println(auto1.cargarCombustible(35));
		System.out.println(auto1.pocoCombustible());
		System.out.println(auto1);
		
		
	}

}

