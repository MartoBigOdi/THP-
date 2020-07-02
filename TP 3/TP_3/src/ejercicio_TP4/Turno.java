package ejercicio_TP4;

public class Turno {
	
	private String nombre;
	private String apellido;
	private String telefono;
	private String dni;
	private boolean presente;
	
	
	public Turno(String nombre, String apellido, String telefono, String dni) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setTelefono(telefono);
		this.setDni(dni);
		this.setPresente(false);
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getDni() {
		return dni;
	}

	public boolean isPresente() {
		return presente;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	
	@Override
	public String toString() {
		return "Turno [nombre = " + nombre + ", apellido = " + apellido + ", telefono = " + telefono + ", dni = " + dni
				+ ", presente = " + presente + "]"; 
	}

	public static void main(String[] args) {
		
	}

}
