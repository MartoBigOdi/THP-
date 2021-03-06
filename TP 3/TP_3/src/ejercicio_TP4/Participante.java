package ejercicio_TP4;

public class Participante {

		private String dni;
		private int puntaje;
		private String nombre;
		private String apellido;
		
		
		//Getters y Setters
	    public String getDni() {
			return dni;
		}

		public int getPuntaje() {
			return puntaje;
		}

		public String getNombre() {
			return nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		private void setPuntaje(int puntaje) {
			this.puntaje = puntaje;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		private void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		//Constructor 
		public Participante(String dni, String nombre, String apellido, int puntaje) {
			this.setDni(dni);
			this.setPuntaje(puntaje);
			this.setNombre(nombre);
			this.setApellido(apellido);
		}
		
		//Suma un voto al participante.
		public void sumarVoto() {
			this.puntaje += 1;
		}
		
	@Override
		public String toString() {
			return "\n"+ "[Nombre = " + nombre + ", Apellido = " + apellido + "\n" + "El puntaje es " + puntaje +"]";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
