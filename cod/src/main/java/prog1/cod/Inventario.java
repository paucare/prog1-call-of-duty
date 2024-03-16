package prog1.cod;

public class Inventario {

	private static int cont_id = 1;
	
	protected int id;
	
	public Inventario(int id) {
		this.id = cont_id++  ;		
	}

	public Inventario(String nombre) {
		this.id = cont_id++  ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
