package ejercicios_TP;

public class Hotel {

	
	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	private int habitacionesReservadas;
	
	
	//Primer constructor 
	public Hotel(String nombre, String localidad, int habitacionesTotales) {
		this.setNombre(nombre);
		this.setLocalidad(localidad);
		this.setHabTotales(habitacionesTotales);
	}
	
	
	//Segundo Constructor 
	public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesOcupadas, int habitacionesReservadas ) {
		this.setNombre(nombre);
		this.setLocalidad(localidad);
		this.setHabTotales(habitacionesTotales);
		this.setHabOcupadas(habitacionesOcupadas);
		this.setHabReservadas(habitacionesReservadas);
	}
	
	
	
	//Setters
	public void setNombre(String nombre) {//único que es público
		this.nombre = nombre;
	}
	
	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	private void setHabTotales(int habitacionesTotales) { //No pueden ser nunca negativas.
		if (habitacionesTotales < 1) {
			this.habitacionesTotales = 1; //Obligamos a poner uno si es negativo el numero total de habitaciones.
		}
		this.habitacionesTotales = habitacionesTotales;
	}
	
	private void setHabOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas = habitacionesOcupadas;
	}
	
	private void setHabReservadas(int habitacionesReservadas) { //Tienen que comprobar que haya ese numero de habitaciones.
		//También verificar que el número ingresado sea positivo.
		if(habitacionesReservadas > 0 && habitacionesReservadas <= this.habitacionesTotales) {
			this.habitacionesReservadas = habitacionesReservadas;
		}
	}
	
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	
	public int getHabTotales() {
		return this.habitacionesTotales;
	}
	
	public int getHabOcupadas() {
		return this.habitacionesOcupadas;
	}
	
	public int getHabReservadas() {
		return this.habitacionesReservadas;
	}
	
	
	
	//Métodos Privados
	private boolean ocuparSinReserva(int habitacionSinReserva) {//Acá estamos ocupando una habitación sin reserva previa.
		boolean pudoOcupar = false;
		if(habitacionSinReserva <= this.disponibilidad()) {//Llega al hotel y verificamos si hay disponibilidad, si se puede actualizamos 
			pudoOcupar = true;                       // los datos.
			this.habitacionesOcupadas += habitacionSinReserva;
		}
		return pudoOcupar;
	}
	
	
	private boolean ocuparConReserva(int habitacionConReserva) {//Prestar mucha atención para unir los datos por ejemplo acá, 
		boolean pudoOcupar = false;
		if(habitacionConReserva <= this.habitacionesReservadas) {//La condicion es entre reservas. this.habitacionesReservadas 
			this.habitacionesReservadas -= habitacionConReserva; //tiene que ser mayor para poder restar y a ese número le restamos la reserva esta. 
			this.habitacionesOcupadas += habitacionConReserva; //Actualizamos las ocupadas. 
			pudoOcupar = true;
		}
		return pudoOcupar;
	}
	
	//Métodos publicos
	public int disponibilidad() {
		return this.habitacionesTotales - this.habitacionesOcupadas - this.habitacionesReservadas; //Podemos usar el método para devolver
		//directamente el INT que necesitamos. 
	}
	
	
	public boolean reservarHabitaciones(int cantidadAreservar) {//En este método verificamos si hay una disponibilidad para hacer la reserva.
		boolean sePuede = false;
		if(cantidadAreservar <= this.disponibilidad()) {//Método disponibilidad nos devuelve un valor INT con las Habitaciones disponibles.
			sePuede = true;
			this.habitacionesReservadas += cantidadAreservar;
		}
		return sePuede;
	}
	
	
	public int cantidadHabitacionesLibres() {
		return this.habitacionesTotales - this.habitacionesOcupadas;
	}
	
	
	public boolean ocuparHabitaciones(int cantidadHabitaciones, boolean reservas) {
		boolean puedeOcupar;
		if(reservas) {//Usamos el boolean para indicar si son reservar o no. 
			puedeOcupar = this.ocuparConReserva(cantidadHabitaciones);//No olvidarsae poner el parametro de la cantidad para que el 
		} else {													  //método pueda hacer el proceso.
			puedeOcupar = this.ocuparSinReserva(cantidadHabitaciones);//No olvidarase poner el parametro para que se pueda hacer el proceso.
		}
		return puedeOcupar;//Devolvemos si es o no de reserva. Y actualizamos los valores.
	}
	
	
	public boolean desocuparHabitaciones(int habitacionesAdesocupar) {
		boolean sePuede = false;
		if(habitacionesAdesocupar <= this.habitacionesOcupadas) {
			this.habitacionesOcupadas -= habitacionesAdesocupar;
			sePuede = true;
		}
		return sePuede;
	}
	
	
	//Settiamos el Mñetodo toString().
	@Override
	public String toString() {
		return String.format("Hotel %s %s [habitaciones = %d, ocupadas = %d, reservas = %d, libres = %s, disponibles = %d]", 
				nombre, localidad, habitacionesTotales, habitacionesOcupadas, habitacionesReservadas, cantidadHabitacionesLibres(), 
				disponibilidad());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
