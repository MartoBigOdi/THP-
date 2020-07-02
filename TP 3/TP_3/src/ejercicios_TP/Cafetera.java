package ejercicios_TP;

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	
	
	//Constructor, la medida es mililitros.
	public Cafetera(int cantidadLiquido) {
		this.setCapacidadMaxima(cantidadLiquido);
		this.setCantidadActual(0);
	}
	
	public Cafetera() {
		this.setCapacidadMaxima(1000);
		this.setCantidadActual(0);
	}
	
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.setCapacidadMaxima(capacidadMaxima);
		this.setCantidadActual(cantidadActual);
	}
	//Acá terminan los 3 tipos de constructores.
	/*-----------------------------------------------------------*/
	
	
	//Getters
	public int getCapacidadMaxima() {
		return this.capacidadMaxima;
	}
	
	public int getCantidadActual() {
		return this.cantidadActual;
	}
	
	
	//Setters
	private void setCapacidadMaxima(int cantidadLiquido) {
		 if(cantidadLiquido < 250) {
			this.capacidadMaxima = 250;
		} this.capacidadMaxima = cantidadLiquido;
	}
	
	private void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	
	
	//Métodos de la clase para hacer determinada acción
	public int llenar() {
		return this.cantidadActual = this.capacidadMaxima;
	}
	
	public int servirTaza(int taza) {
		if(taza > this.cantidadActual) {
			taza = this.cantidadActual;
			this.cantidadActual -=taza;//Prestar atencion porque se actuliza en todo el condicional
		} else {
			this.cantidadActual -=taza;//Prestar atencion porque se actuliza en todo el condicional
		}
		return taza;
	}
	
	public int vacia() {
		return this.cantidadActual = 0;
	}
	
	public int agregarCafe(int cantidadAgregada) {
		int sobrante = 0;
		if((cantidadAgregada + this.cantidadActual ) > this.capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima;
			sobrante = (cantidadAgregada + this.cantidadActual) - this.capacidadMaxima;
		} else {
			this.cantidadActual += cantidadAgregada;
		}
		return sobrante;
	}
	
	
	public static void main(String[] args) {
		

	}

}
