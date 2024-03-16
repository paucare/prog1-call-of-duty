package prog1.cod;

public class Usuario {
	private static int espacioOcupado = 30;
	private String nombre;
	private Arma arma;
	private Accesorio[] accesorios;
	
	public Usuario(String nombre, Arma arma, Accesorio[] accesorios) {
		super();
		this.nombre = nombre;
		this.arma = arma;
		this.accesorios =accesorios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	
	
	

}
