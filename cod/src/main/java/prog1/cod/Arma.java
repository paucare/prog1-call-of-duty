package prog1.cod;

public class Arma extends Inventario{
	
	private String nombre;
	private int municion;
	private int peso;
	
	
	public Arma(int id, String nombre, int municion, int peso) {
		super(id);
		this.nombre = nombre;
		this.municion = municion;
		this.peso = peso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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
