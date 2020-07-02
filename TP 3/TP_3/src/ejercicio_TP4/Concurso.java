package ejercicio_TP4;
import java.util.ArrayList;


public class Concurso {
	
	private String nombre;
	private ArrayList<Participante> listaParticipantes;
	
	
	//Setter y Getter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Constructor
	public Concurso() {
		this.setNombre("Quarantine Bakers");
		listaParticipantes = new ArrayList<>();
	}
	
	
	//Agregar un Participante
	public boolean agregarParticipante(String dni, String nombre, String apellido, int puntaje) {
		boolean sePudo = false;
		Participante participante = buscarParticipante(dni);
		if(participante == null) {
			participante = new Participante(dni, nombre, apellido, 0);
				listaParticipantes.add(participante);
				sePudo = true;
				System.out.println("Se agregó al Participante");
		} else {
			System.out.println("Ya se agregó antes");
		}
		return sePudo;
	}
	
	
	//Buscamos el Participante
		private Participante buscarParticipante(String dni) {
			Participante participante = null;
			int i = 0;
			while(i < listaParticipantes.size() && participante == null) {
				if(listaParticipantes.get(i).getDni() == dni) {
					participante = listaParticipantes.get(i);
				} else {
					i++;
				}
			}
			return participante;  
		}
	
		
	//Eliminamos al Participante
		public boolean eliminarParticipante(String dni) {
			boolean sePudo = false;
			Participante participante = buscarParticipante(dni);
			if(participante != null) {
					listaParticipantes.remove(participante);
					sePudo = true;
					System.out.println("Se borró al Participante " + participante.getNombre() + " " + participante.getApellido());
			} else {
				System.out.println("Ya se había borrado antes");
			}
			return sePudo;
		}
		
		
	//Votamos por un participante
	public void votarParticipante(String dni) {
		Participante participante = buscarParticipante(dni);
		if(participante != null) {
			participante.sumarVoto();
			System.out.println("\n" + "voto para el participante " + participante.getNombre() + " " +participante.getApellido());
		}else {
			System.out.println("\n" + "Voto invalido participante inexistente");
		}
	}
	
	//Obtener la cantidad de participantes
	public int cantidadParticipantes() {
		return listaParticipantes.size();
	}
		
	//Buscamos el mejor o mayor puntaje en los participantes.
	private Participante mayorPuntaje() {
		int mayorPuntaje = -1;
		Participante participanteMasVotos = null;
		for (Participante participante : listaParticipantes) {
			if(participante.getPuntaje() > mayorPuntaje) {
				mayorPuntaje = participante.getPuntaje();
				participanteMasVotos = participante; 
			}
		}
		return participanteMasVotos;
	}
	
	//mostramos el mejor puntaje
	public void mostrarMejorPuntaje() {
		Participante participante = mayorPuntaje();
		if(participante != null) {
		System.out.println("\n" + "El participante con mayor puntaje es "
		 + participante.getNombre()+ " " + participante.getApellido());
		}else {
			System.out.println("\n" +"No hay participantes");
		}
	}
	
	//Buscar Partipante por Puntaje
	public Participante buscarParticipantePorPuntaje(int puntaje) {
		Participante participante = null;
		int i = 0;
		while(i < listaParticipantes.size() && participante == null) {
			if(listaParticipantes.get(i).getPuntaje() == puntaje) {
				participante = listaParticipantes.get(i);
				System.out.println("\n" + "Participante buscado por puntaje " + participante);
			} else {
				i++;
			}
		}
		return participante;  
	}

	
	
	@Override
	public String toString() {
		return "\n" + "[El concurso " + nombre + "\n"+ "ListaParticipantes = " + listaParticipantes + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
