package ejercicios_TP;

public class Test_Cafetera {

	public static void testearCafetera(Cafetera cafetera) {
		System.out.println("Cantidad Máxima: " + cafetera.getCapacidadMaxima() + " Cantidad Actual: " + cafetera.getCantidadActual());
	}
	
	public static void main(String[] args) {

		Cafetera cafetera1;
		Cafetera cafetera2;
		Cafetera cafetera3;
		
		cafetera1 = new Cafetera();
		cafetera2 = new Cafetera(1500);
		cafetera3 = new Cafetera(750,500);
	
		
		testearCafetera(cafetera1);
		testearCafetera(cafetera2);
		testearCafetera(cafetera3);
		
	}
}
