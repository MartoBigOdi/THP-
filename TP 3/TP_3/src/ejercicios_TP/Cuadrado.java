package ejercicios_TP;

public class Cuadrado {

	private int lado;
	
	
	public Cuadrado() {
		this.lado = 0;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int getLado() {
		 return lado;
	}
	
	public int perimetro() {
		return  lado * 4;
	}
	
	public int superficie() {
		return lado * lado;
	}
	
	//sobre escribimos el método toString()
	@Override
	public String toString() {
		return "Cuadrado [lado = " + getLado() + ", perimetro = " + perimetro() + ", superficie = " + superficie() + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
