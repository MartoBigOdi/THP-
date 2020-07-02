package ejercicios_TP;

public class Test_Cuadrado {

	private static void completarLado(Cuadrado cuadrado, int lado) {
		cuadrado.setLado(lado);
		System.out.println(cuadrado.toString());
	}
	
	private static void cambioLado(Cuadrado cuadrado, int lado) {
		cuadrado.setLado(lado);
		System.out.println("Cambio el tamaño del cuadrado a " + lado + " por lado.");
		System.out.println(cuadrado.toString());
	}
	
	
	public static void main(String[] args) {
		
		Cuadrado cuadrado1;
		Cuadrado cuadrado2;
		
		cuadrado1 = new Cuadrado();
		cuadrado2 = new Cuadrado();
		
		completarLado(cuadrado1, 10);
		cambioLado(cuadrado2, 50);
		
	}

}
