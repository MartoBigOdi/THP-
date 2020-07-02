package ejercicios_TP;

public class TarjetaDeCredito {

	private String numero;
	private String titular;
	private double limiteCompra;
	private double acumuladoActual;

	//
	public TarjetaDeCredito(String numero, String titular, double limiteCompra) {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setlimiteCompra(limiteCompra);
		acumuladoActual = 0; //Porque no tiene ningún gasto al momento de que le den la tarjeta o instaciamos el objeto. 
	}


	//Definos los Getters públicos
	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getLimiteCompra() {
		return limiteCompra;
	}

	public double getAcumuladoActual() {
		return acumuladoActual;
	}


	//Definimos los Setters privados manejados por la clase solamente. 
	private void setNumero(String numeroTarjeta) {
		this.numero = numeroTarjeta;
	}

	private void setTitular(String titularTarjeta) {
		this.titular = titularTarjeta;
	}

	private void setlimiteCompra(double limiteCompra) {
		this.limiteCompra = limiteCompra;
	}

	public void actualizarLimiteCompra(double limiteAct) {
		this.limiteCompra = limiteAct;
	}

	//Sobre escribirmos el toString().
	@Override
	public String toString() {
		return "Tarjeta: " + this.numero + ", Titular: " + this.titular + ", Límite de Compra: " 
				+ this.limiteCompra + ", Disponible: " + this.montoDisponible();
	}
	
	
	public double montoDisponible() {
		double disponible = 0;
		disponible = this.limiteCompra - this.acumuladoActual;//Verifiacamos si "se puede o no hacer la accion de comprar" 
		if (disponible < 0) {									//según nuestro limite de compra y acumulado actual.			
			disponible = 0;
		}
		return disponible; //SI el acumulado actual es menor que 0 asignamos 0 a disponible para no estar trabajando
		  				   // con negativos. 
	}


	private boolean compraPosible(double importeCompra) { //Acá verificamos si el monto de la compra es posible, y devuelve
		return importeCompra <= this.montoDisponible();		//un boolean. Entonces si el importe de compra es menor que
	}															//monto disponible "se puede".
	
	
	private void acumularGasto(double importeCompra) { //Acá sumamos el importe de la compra al acumulado Actual de la 
		this.acumuladoActual = + importeCompra;          //tarjeta. 
	}

	
	public boolean realizarCompra(double importeCompra) { //Acá realizamos la compra y actualizamos en caso de que 
		boolean seRealizo = false;							// se pudo hacer la acción. devolvemos true si se puede. 
		if(this.compraPosible(importeCompra)) {
			this.acumularGasto(importeCompra);
			seRealizo = true;
		}
		return seRealizo;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
