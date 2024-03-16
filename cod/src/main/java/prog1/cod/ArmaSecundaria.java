package prog1.cod;

public class ArmaSecundaria extends Arma{
	private String tipo;

	public ArmaSecundaria(String nombre, int peso, String tipo) {
		super(nombre, peso);
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
