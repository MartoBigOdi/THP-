package ejercicio_TP4;
import java.util.ArrayList;

public class Edificio {

	private String direccion;
	private int cantidadDeptos;
	private ArrayList<Departamento> listaDeptos;
	private ArrayList<Departamento> listaDeptosMorosos;
	
	//Getter y Setters
	public String getDireccion() {
		return direccion;
	}

	public int getCantidadDeptos() {
		return cantidadDeptos;
	}

	private void setDireccion(String direccion) {
		if(!direccion.equals("")) {
		this.direccion = direccion;
		}
	}

	private void setCantidadDeptos(int cantidadDeptos) {
		if(cantidadDeptos > 0) {
		this.cantidadDeptos = cantidadDeptos;
		}
	}

	//Constructor
	public Edificio(String direccion, int cantidadDeptos) {
		this.setDireccion(direccion);
		this.setCantidadDeptos(cantidadDeptos);
		listaDeptos = new ArrayList<>();
		listaDeptosMorosos = new ArrayList<>();
	}

	//Agregamos el Depto al Edificios
	public boolean agregarUnidad(String numeroUnidad, String dniPropietario, String nombrePropietario) {
		 boolean sePudo = false;
		 Departamento departamento = buscarDepto(numeroUnidad);
			if(departamento == null) {
				departamento = new Departamento(numeroUnidad, dniPropietario, nombrePropietario);
				if (listaDeptos.size() < this.cantidadDeptos) {
					listaDeptos.add(departamento);
					sePudo = true;
					System.out.println("Se agrego Unidad");
				} else {
					System.out.println("No se agrego Unidad");
				}
			} else {
				System.out.println("Ya existe la unidad.");

			}
			return sePudo;
	}
	
	// Buscamos el departamento
	private Departamento buscarDepto(String numeroUnidad) {
		Departamento deptoEncontrado = null;
		int i = 0;
		while(i < listaDeptos.size() && deptoEncontrado == null) {
			if(listaDeptos.get(i).getNumeroUnidad() == numeroUnidad) {
				deptoEncontrado = listaDeptos.get(i);
			} else {
				i++;
			}
		}
		return deptoEncontrado;  //Salimos del while retornamos el "pacienteEncontrado"
	}
	
	//Devuelve la cantidad de unidades ocupadas.
	public int unidadesOcupadasEdificio() {
		return listaDeptos.size();
	}
	
	
	//Actualizar saldo
	public boolean actualizarSaldo(String numeroUnidad, int monto) {
		boolean sePudo = false;
		Departamento departamento = buscarDepto(numeroUnidad);
		if(departamento == null) {
			System.out.println("No existe la Unidad");
		} else {
			departamento.setSaldoDepto(monto);
			sePudo = true;
			System.out.println("Se actualizó el saldo de la unidad "+ departamento.getNumeroUnidad() + " en $" + departamento.getSaldoDepto());
		}
		return sePudo;
	}
	
	
	//Pasamos los deudores a morosos.
	public boolean pasarAmoroso(String numeroUnidad) {
		boolean sePudo = false;
		Departamento departamento = buscarDepto(numeroUnidad);
		if(departamento != null && departamento.getSaldoDepto() < 0) {
			listaDeptosMorosos.add(departamento);
			sePudo = true;
			System.out.println("\n"+ "Se ingreso el "+ departamento +" al listado de morosos");
		} else {
			System.out.println("\n"+ "No tiene deuda la unidad");
		}
		return sePudo;
	}
	
	//Mostramos la Lista de Morosos
	public void mostrarListaMorosos() {
		System.out.println("\n" + "Listado de Morosos del edificio: " + listaDeptosMorosos);
	}
	
	
	
	//EL toStering() empieza separado de lo ultimo printiado.
	@Override
	public String toString() {
		return  "\n"+ "Edificio [Direccion = " + direccion + "\n"+ " Cantidad de Unidades Ocupadas = " + unidadesOcupadasEdificio() +" Cantidad de Deptos = " + cantidadDeptos +"\n"+"ListaDeptos = "
				+ listaDeptos +"\n"+"ListaDeptosMorosos = " + listaDeptosMorosos + "]";
	}

	public static void main(String[] args) {
		
	}

}
