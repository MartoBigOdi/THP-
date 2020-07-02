package ejercicio_TP4;
import java.util.ArrayList;


public class Agenda {
	
	private int limiteTurnos;
	private ArrayList<Turno> listaTurnos;
	
	//Constructor
	public Agenda(int limite) {
		this.setLimiteTurnos(limite);
		listaTurnos = new ArrayList<>();
	}
	
	//Setter y Getter
	public int getLimite() {
		return this.limiteTurnos;
	}
	
	private void setLimiteTurnos(int limite) {
		this.limiteTurnos = limite;
	}
	
	
	//Busqueda del objeto en la lista.
	private Turno buscarPaciente(String dni) {
		Turno pacienteEncontrado = null;
		int i = 0;
		while(i < listaTurnos.size() && pacienteEncontrado == null ) {
			if(listaTurnos.get(i).getDni() == dni) {
				pacienteEncontrado = listaTurnos.get(i);
			} else {
				i++;
			}
		}
		return pacienteEncontrado;  //Salimos del while retornamos el "pacienteEncontrado"
	}
	
	
	//Registramos los turno según el limite dado al constructor.
	//Falta validar si esta el "TURNO YA HECHO"
	public boolean registrarTurno(String nombre, String apellido, String telefono, String dni) {
		boolean sePudo = true;
		Turno turno = buscarPaciente(dni);
		if(turno == null) {
			turno = new Turno(nombre, apellido, telefono, dni);
			if (listaTurnos.size() < this.limiteTurnos) {
				listaTurnos.add(turno);
				sePudo = true;
				System.out.println(turno);
				System.out.println("Se tomó el turno");
			} else {
				System.out.println("No Hay más turnos.");
			}
		} else {
			System.out.println("Ya tiene turno el paciente asignado.");

		}
		return sePudo;
	}

	
	//Modificamos el estado del presente con el setter.
	public void darPresente(String dni) {
		Turno turno = buscarPaciente(dni);
		if (turno != null) {
		turno.setPresente(true);
		 	System.out.println("Tiene Presente " + turno.getNombre() + " " + turno.getApellido());
		} else {
			System.out.println("No se puedo cambiar el estado del Turno.");
		}
	}
	
	
	//Anulamos el turno según DNI.
	public void anularTurno(String dni) {
		Turno turno = buscarPaciente(dni);
		if(turno != null) {
			listaTurnos.remove(turno);
			System.out.println("Turno anulado");
		}
	}
	
	
	//Listar los ausentes. Hacemos un For Each para buscar dentro de la lista los ausentes. 
	public ArrayList<Turno> listarAusentes(){
		ArrayList<Turno> listaAusentes = new ArrayList<>();
		for(Turno turno : listaTurnos) {
			if(turno.isPresente() == false) {
				listaAusentes.add(turno);//Los sumamos a la lista de ausentes.
			}
		}
		return listaAusentes;
		
	}
	
	
	//Devulve la cantidad de turnos
	public int cantidadTurnosDados() {
		return listaTurnos.size();
	}
	
	
	
	@Override
	public String toString() {
		return "Agenda [Limite de Turnos = " + limiteTurnos +  "\n"+ "ListaTurnos = " + listaTurnos + "]";
	}

	public static void main(String[] args) {
		
	}

}
