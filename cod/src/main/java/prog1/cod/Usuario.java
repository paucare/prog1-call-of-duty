package prog1.cod;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
    private double espacioMochila;
    private ArmaPrincipal armaPrincipalEquipada;
    private ArmaSecundaria armaSecundariaEquipada;
    private ArrayList<Accesorio> accesoriosEquipados;
	
    public Usuario(String nombre, double espacioMochila, ArmaPrincipal armaPrincipalEquipada,
			ArmaSecundaria armaSecundariaEquipada, ArrayList<Accesorio> accesoriosEquipados) {
		this.nombre = nombre;
		this.espacioMochila = espacioMochila;
		this.armaPrincipalEquipada = armaPrincipalEquipada;
		this.armaSecundariaEquipada = armaSecundariaEquipada;
		this.accesoriosEquipados = accesoriosEquipados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEspacioMochila() {
		return espacioMochila;
	}

	public void setEspacioMochila(double espacioMochila) {
		this.espacioMochila = espacioMochila;
	}

	public ArmaPrincipal getArmaPrincipalEquipada() {
		return armaPrincipalEquipada;
	}

	public void setArmaPrincipalEquipada(ArmaPrincipal armaPrincipalEquipada) {
		this.armaPrincipalEquipada = armaPrincipalEquipada;
	}

	public ArmaSecundaria getArmaSecundariaEquipada() {
		return armaSecundariaEquipada;
	}

	public void setArmaSecundariaEquipada(ArmaSecundaria armaSecundariaEquipada) {
		this.armaSecundariaEquipada = armaSecundariaEquipada;
	}

	public ArrayList<Accesorio> getAccesoriosEquipados() {
		return accesoriosEquipados;
	}

	public void setAccesoriosEquipados(ArrayList<Accesorio> accesoriosEquipados) {
		this.accesoriosEquipados = accesoriosEquipados;
	}
    
	 public void equiparAccesorio(Accesorio accesorio) {
	        if (accesoriosEquipados.size() < 3) {
	            accesoriosEquipados.add(accesorio);
	        } else {
	            System.out.println("El máximo de Accesorios equipados deben ser 3. No puedes equiparte más");
	        }
	    }
    
    

}
