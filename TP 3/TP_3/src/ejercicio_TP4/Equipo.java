package ejercicio_TP4;

import java.util.ArrayList;

public class Equipo {

	private String nombre;
	private int cantidadJugadores;
	private ArrayList<Jugador> listaJugadores;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public int getCantidadJugadores() {
		return cantidadJugadores;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setCantidadJugadores(int cantidadJugadores) {
		if(cantidadJugadores <= 14) {
		this.cantidadJugadores = cantidadJugadores;
		}
	}
	
	//Constructor
	public Equipo(String nombre, int cantidadJugadores) {
		super();
		this.setNombre(nombre);
		this.setCantidadJugadores(cantidadJugadores);
		listaJugadores = new ArrayList<>();
	}

	//Dar de alta Jugador.
	public boolean darDeAlta(String numero, String apellido, int goles) {
		boolean sePudo = false;
		Jugador jugador = buscarJugador(numero);
		if(jugador == null) {
			jugador = new Jugador(numero, apellido, goles);
			if (listaJugadores.size() < this.cantidadJugadores) {
				listaJugadores.add(jugador);
				sePudo = true;
				System.out.println("Se dió alta al jugador");
			} else {
				System.out.println("No se pudo agregar jugador, pasa el límite");
			}
		} else {
			System.out.println("Ya se agregó antes");

		}
		return sePudo;
	}
	
	//Buscamos el jugador
	private Jugador buscarJugador(String numero) {
		Jugador jugador = null;
		int i = 0;
		while(i < listaJugadores.size() && jugador == null) {
			if(listaJugadores.get(i).getNumero() == numero) {
				jugador = listaJugadores.get(i);
			} else {
				i++;
			}
		}
		return jugador;  
	}

	//Mostramos los goles totales
	public int golesTotales() {
		int goles = 0;
		for (Jugador jugador : listaJugadores) {
			   goles += jugador.getGoles();   
		}
		 return goles;
	}
	
	//Mostramos los goles de un jugador
	public void mostrarGoles(String numero) {
		Jugador jugador = buscarJugador(numero);
		if ( jugador != null) {
			System.out.println("\n"+ "La cantidad de goles del jugador " + jugador.getApellido() + " es " + jugador.getGoles());
		} else {
			System.out.println("\n"+ "No existe este jugador en este equipo, verifique");
		}
	}
	
	
	
	@Override
	public String toString() {
		return "\n"+ "Equipo " + "\n"+ "[Nombre del Equipo = " + nombre + "\n"+ "Cantidad de Jugadores = " + cantidadJugadores + "\n"+ "\n"+"Lista de Jugadores = "
				+ listaJugadores + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
