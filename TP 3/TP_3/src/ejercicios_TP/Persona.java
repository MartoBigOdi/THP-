package ejercicios_TP;


/*  
 * Una buena practica según el paradigma de la programación orientada a objetos 
 * es que para llegar a asignar o ver datos de los mismos se necesitan métodos. 
 *Los datos dentro de un objeto son privados. 
 **/


//Toda esta Class es para "Pesona"
public class Persona {

	//atributos
	private String apellido;
	private String nombre;
	private String direccion;
	
	//hacemos el constructor, una de sus amnera de hacerlo. 
	public Persona() {
		this.apellido = "";
		this.nombre = "";
		this.direccion = "";
	}
	
	
	//Recordar que los SETTERS son para asignar. No retornan nada solo asignan a un atributo el valor dado. 
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	//Recordar que los GETTERS son para pedir datos de los Objetos. Retorna el valor pedido del atributo.
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	//Sobre Escribimos el metodo toString() de la clase String. @Override nos da la posibilidad 
	@Override
	public String toString() {
		return "Persona [Apellido: "+apellido+", Nombre: "+nombre+ ", Dirección: " +direccion +"]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
