package prog1.cod;

public class Arma extends Inventario{
	
	private int municion;
	private int peso;
	
	
	public Arma(String nombre, int municion, int peso) {
		super(nombre);
		this.municion = municion;
		this.peso = peso;
	}


	public Arma(String nombre, int peso) {
		super(nombre);
		this.peso=peso;
		
	}

	public int getMunicion() {
		return municion;
	}


	public void setMunicion(int municion) {
		this.municion = municion;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
	
	
	
	
}
