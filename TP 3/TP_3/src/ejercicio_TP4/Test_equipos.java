package ejercicio_TP4;

public class Test_equipos {
	
	//Método para que interactuen dos objetos. 
	private static void jugar(Equipo equipo, Equipo equipo2) {
		if(equipo.golesTotales() == equipo2.golesTotales()) {
			System.out.println("\n"+ "Empataron, partido aburrido");
		} else if(equipo.golesTotales() > equipo2.golesTotales()) {
			System.out.println("\n"+ "Ganó el equipo " + equipo.getNombre());
		} else {
			System.out.println("\n"+ "Ganó el equipo " + equipo2.getNombre());
		}
	}
	
	
	public static void main(String[] args) {
		
		//Equipo2
		Equipo equipo2 = new Equipo("Club la birra social", 4);
		
		equipo2.darDeAlta("11", "Facu Granadel", 16);
		equipo2.darDeAlta("9", "Hernandez Hernan", 65);
		equipo2.darDeAlta("7", "Matias Gonzales", 12);
		equipo2.darDeAlta("5", "Lazaro Fernandez", 40);
		
		//Equipo 1
		Equipo equipo1 = new Equipo("Club Atlético Marto", 4);
	
		//Damos de alta jugadores
		equipo1.darDeAlta("10", "Vasco", 16);
		equipo1.darDeAlta("9", "Hernandez", 65);
		equipo1.darDeAlta("7", "Matias Lopez", 25);
		equipo1.darDeAlta("23", "Lazaro Hernandez", 28);
		
		//Nos avisa que pasamos el Límite
		equipo1.darDeAlta("1", "Rene iguita", 6);
		equipo1.darDeAlta("8", "Pipi Romagnoli", 54);
		
		
		//repetido tiene que mostrar mensaje.
		equipo1.darDeAlta("10", "Vasco", 10);
		
		
		System.out.println(equipo1);
		
		System.out.println(equipo2);
		
		
		//Mostrando goles por Equipo.
		System.out.println("\n"+ "Goles del equipo 1 " + equipo1.golesTotales());
		
		System.out.println("Goles del Equipo 2 " + equipo2.golesTotales());
		
		//Mostrando Goles de un Jugador
		equipo1.mostrarGoles("10");
		
		//Buscamos Jugador para mostrar sus Goles en el equipo equivocado
		equipo2.mostrarGoles("10");
		
		
		//Mostramos el Método Jugar
		jugar(equipo1, equipo2);
		
		
		
	}

}
