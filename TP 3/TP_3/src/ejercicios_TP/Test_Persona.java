package ejercicios_TP;

public class Test_Persona {

	//Método donde instanciamos al objeto "Persona".
	private static void completarDatos(Persona persona, String nombre, String apellido, String direccion) {
		//Usamos los setters para asignar los valores a los atributos.
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setDireccion(direccion);
		
	}
	
	
	//Método para mostrar al objeto instanciado
	private static void mostrarPersona(Persona persona) {
		
		//usamos los get para obtener los datos de los atributos.
		System.out.println(persona.toString());
		System.out.println("Apellido: " + persona.getApellido());
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Dirección: " + persona.getDireccion());
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1;
		Persona persona2;
		
		//Usamos el constructor que hicimos en la clase "Persona"
		persona1 = new Persona();
		persona2 = new Persona();
		
		//Usamos el método para asignar valores a los atributos.
		completarDatos(persona1, "Martin", "Vasconcelo" , "CABA");
		completarDatos(persona2, "Guada", "Prandi" , "CABA");
		
		//Mostramos los objetos instanciados.
		mostrarPersona(persona1);
		mostrarPersona(persona2);
		
		
		
	}

}
