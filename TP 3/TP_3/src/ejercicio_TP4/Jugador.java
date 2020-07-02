package ejercicio_TP4;

public class Jugador {
	
	private String numero;
	private String apellido;
	private int goles;
	
	
	//Constructor
	public Jugador(String numero, String apellido, int goles) {
		this.setNumero(numero);
		this.setApellido(apellido);
		this.setGoles(goles);
	}
	
	
	//Setter y Getters
	public String getNumero() {
		return numero;
	}

	public String getApellido() {
		return apellido;
	}

	public int getGoles() {
		return goles;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setGoles(int goles) {
		if(goles > 0) {
		this.goles = goles;
		}
	}

	@Override
	public String toString() {
		return "Jugador" + "\n" + "[numero = " + numero + "\n"+ "Apellido = " + apellido + "\n"+ "Goles = " + goles + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
