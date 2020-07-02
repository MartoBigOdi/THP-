package ejercicios_TP;

public class Automovil {

	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadCombustible;
	private double rendimientoPorLitro;
	
	
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPatente(patente);
		this.setCapacidadTanque(capacidadTanque);
		
	}
	
	
	//Setters
	private void setMarca(String marca) {
		this.marca = marca;
	}	
	
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	private void setCapacidadTanque(double capacidadTanque) {
		if(capacidadTanque > 0) {
			this.capacidadTanque = capacidadTanque;
		} else {
			this.capacidadTanque = 0;
		}
	}
	
	public void setRendimientoLitro(double km) {
		this.rendimientoPorLitro = km;
	}
	
	private void setCantidadCombustible(double litros) {
		if(litros > 0 && litros <= this.capacidadTanque) {
			this.cantidadCombustible = litros;
		}
	}
	
	//Getter
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getPatente() {
		return this.patente;
	}
	
	public double getCapacidadTanque() {
		return this.capacidadTanque;
	}
	
	public double getCantidadCombustible() {
		return this.cantidadCombustible;
	}
	
	public double getRendimientoLitro() {
		return this.rendimientoPorLitro;
	}
	
	
	
	//Métodos privados que complementan el toString().
	private String mensajeCargaCombustible() {
	   return "Esto puede cargar de combustible = " + this.espacioDisponible();
	}
	
	
	
	//Métodos especificos 
	public boolean cargarCombustible(double cargaCombustible) {
		boolean pudoCargar;
		//Prestar atención a la lógica de la condición, es si pasa esto o pasa esto otro. 
		if(cargaCombustible <= 0 || cargaCombustible > this.espacioDisponible()) {
			pudoCargar = false;
		} else {
			this.cantidadCombustible += cargaCombustible;
			pudoCargar = true;
		}
		return pudoCargar;
	}
	
	
	
	private double espacioDisponible() {
		return this.getCapacidadTanque() - this.getCantidadCombustible();
	}
	
	
	
	public boolean pocoCombustible() {
		boolean quedaPoco = false;
		if(this.getCantidadCombustible() < this.getCapacidadTanque()*0.15) {
			quedaPoco = true;
		}
		return quedaPoco;
	}
	
	
	
	
	public double viajar(double kmAviajar) {
		double kmArecorrer;
		double litros;
		litros = consumirCombustible(kmAviajar);//Esto me da los litros que necesito para esos Km.
		kmArecorrer = litros * this.getRendimientoLitro();//Verificamos si pidemos viajar con los litros que devuelve el método "consumir
		return kmArecorrer; //Devolvemos los Km que podemos viajar. 
	}

	
	
	private double consumirCombustible(double kmArecorrer) {
		double litrosAConsumir = kmArecorrer / this.getRendimientoLitro(); //Acá sabemos cuantos litros necesito para esos Km
			if (litrosAConsumir <= this.getCantidadCombustible()) { //Comparo los litros que necesito con lo que tengo en el tanque. 
				this.cantidadCombustible -= litrosAConsumir; //Actualizo el atributo restando lo usado. 
			} else { 
				litrosAConsumir = this.getCantidadCombustible();  
				this.setCantidadCombustible(0);
			}
			return litrosAConsumir; 
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Automovil" +"\n" + "[ Marca = " + getMarca() + "\n" +"Modelo =  " 
	+ getModelo() + "\n" +"Patente = " + getPatente() + "\n" + "Capacidad de Combustible = " +getCapacidadTanque() +"\n"+"Cantidad Combustible = " 
	+ getCantidadCombustible() +
	"\n" + "Rendimiento por litro = "+ getRendimientoLitro() + "\n"  + mensajeCargaCombustible() + " ]";
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
