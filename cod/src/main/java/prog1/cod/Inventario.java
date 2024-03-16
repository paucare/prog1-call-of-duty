package prog1.cod;

public class Inventario {

	private static int cont_id = 1;
	
	private int id;
	private int espaciosMochila;
	private String nombre;
	
	public Inventario(int id) {
		this.id = cont_id++  ;
	
		
	}

	public Inventario(String nombre) {
		this.id = cont_id++  ;
		this.espaciosMochila = 5;
		this.nombre = nombre;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEspaciosMochila() {
		return espaciosMochila;
	}

	public void setEspaciosMochila(int espaciosMochila) {
		this.espaciosMochila = espaciosMochila;
	}
	
	
	
}
