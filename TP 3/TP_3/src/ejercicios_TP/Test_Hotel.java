package ejercicios_TP;

public class Test_Hotel {

	private static final boolean SIN_RESERVA = false;
	private static final boolean CON_RESERVA = true;
	
	//Mismo método para los dos hoteles
	public static void procesar(Hotel hotel) {
		System.out.println("Estado inicial del hotel: " + hotel.getNombre());
		System.out.println(hotel.toString()); 
		ocupar(hotel, 201, SIN_RESERVA); 
		ocupar(hotel, 30, SIN_RESERVA); 
		reservar(hotel, 50);
		liberar(hotel, 200); 
		ocupar(hotel, 30, CON_RESERVA); 
		ocupar(hotel, 30, CON_RESERVA); 
		liberar(hotel, 40);
	}

	//Creamos un método para ocupar
	public static void ocupar(Hotel elHotel, int habit, boolean esReserva) { 
		boolean pudoOcupar = false;
		if (esReserva) {
			System.out.println("intentaremos ocupar "+habit+" habitaciones con reserva");
		} else {
			System.out.println("intentaremos ocupar "+habit+" habitaciones sin reserva");
		}
		pudoOcupar = elHotel.ocuparHabitaciones(habit, esReserva);
		if (pudoOcupar) {
			System.out.println("pudo ocupar las habitaciones!!!"); //Si devuelve TRUE puede ocupar
		} else {
			System.out.println("NO pudo ocupar las habitaciones!!!");//Si devuelve False no puede ocupar.
		} 
	}

	//Creamos un método para liberar
	public static void liberar(Hotel elHotel, int habit) {
		boolean pudoLiberar = false;
		System.out.println("intentaremos liberar "+habit+" habitaciones.");
		pudoLiberar = elHotel.desocuparHabitaciones(habit);
			if (pudoLiberar) {
				System.out.println("pudo liberar las habitaciones!!!");
			} else {
				System.out.println("NO pudo liberar las habitaciones!!!");
			}
	}
	
	//Creamos un método para reservar
	public static void reservar(Hotel elHotel, int reservas) { 
		boolean pudoReservar = false; System.out.println("intentaremos reservar "+reservas+" habitaciones");
		pudoReservar = elHotel.reservarHabitaciones(reservas);
		if(pudoReservar) {
			System.out.println("pudo reservar !!!");
		}  else {
			System.out.println("NO pudo reservar!!"); 
		}
	}
	
	
	public static void main(String[] args) {
		
		Hotel hotel1;
		Hotel hotel2;
		
		hotel1 = new Hotel("Hilton", "CABA", 200);
		hotel2 = new Hotel("Astoria", "MDQ", 150, 100, 10);
		
		procesar(hotel1);
		procesar(hotel2);
	}

}
