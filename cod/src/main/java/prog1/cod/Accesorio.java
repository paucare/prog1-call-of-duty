package prog1.cod;

public class Accesorio extends Arma {
	private int damage;
	public Accesorio(String nombre, int peso, int damage) {
		super(nombre,peso);
		this.damage=damage;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	

}
