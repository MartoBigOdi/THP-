package ejercicio_TP4;

public class Test_agenda {

	public static void main(String[] args) {
			
		Agenda agenda = new Agenda(2);
		
		//Pruebo y asigno 3 turnos.
		agenda.registrarTurno("Martin", "Vasconcelo", "12345678", "33407629");
		agenda.registrarTurno("Manuel", "Artigas", "12346778", "33434923");
		agenda.registrarTurno("Monica", "Jimenez", "12346778", "23448929");
		agenda.registrarTurno("Martin", "Vasconcelo", "12345678", "334234s29");
		agenda.registrarTurno("Manuel", "Artigas", "12346778", "33434943");
		agenda.registrarTurno("Monica", "Jimenez", "12346778", "23448239");
		
		//Tiene que devolver que ya tienen turno. 
		agenda.registrarTurno("Manuel", "Artigas", "12346778", "33434923");
		agenda.registrarTurno("Monica", "Jimenez", "12346778", "23448929");
		agenda.registrarTurno("Manuel", "Artigas", "12346778", "33434943");
		agenda.registrarTurno("Monica", "Jimenez", "12346778", "23448239");
		
		//Doy el presente
		agenda.darPresente("33434923");
		agenda.darPresente("23448929");
		
		//Anulo el turno
		agenda.anularTurno("33407629");
		
		//Agenda de Ausentes
		System.out.println("Cantidad de ausentes " + agenda.listarAusentes().size());
		System.out.println(agenda.listarAusentes());
		
		System.out.println("Esta es la cantidad de Turnos asignados del día " + agenda.cantidadTurnosDados());
		
		System.out.println(agenda);
		
	}

}
