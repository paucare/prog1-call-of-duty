package prog1.cod;

public class InventarioController {

	private final int TAM_INVENTARIO_DEF = 10;

	private Inventario[] mainInventory;
	private Inventario[] auxInventory;
	private Inventario[] accsInventory;

	public InventarioController() {
		this.mainInventory = new ArmaPrincipal[TAM_INVENTARIO_DEF];
		this.mainInventory[0] = new ArmaPrincipal("MP7", 5, 30);
		this.mainInventory[1] = new ArmaPrincipal("Vector K10", 7, 45);
		this.mainInventory[2] = new ArmaPrincipal("SCAR-H", 12, 50);
		this.mainInventory[3] = new ArmaPrincipal("KSG", 15, 60);
		this.mainInventory[4] = new ArmaPrincipal("G36K", 10, 40);

		// Arma Secundaria
		this.auxInventory = new ArmaSecundaria[TAM_INVENTARIO_DEF];
		this.auxInventory[0] = new ArmaSecundaria("Five-Seven", 2, "Semiautomática");
		this.auxInventory[1] = new ArmaSecundaria("RPG", 10, "Lanzamisiles");
		this.auxInventory[2] = new ArmaSecundaria("G17", 3, "Semiautomática");
		this.auxInventory[3] = new ArmaSecundaria("Executioner", 4, "Revolver");
		this.auxInventory[4] = new ArmaSecundaria("Crossbow", 5, "Ballesta");

		// Acesorio
		this.accsInventory = new Accesorio[TAM_INVENTARIO_DEF];
		this.accsInventory[0] = new Accesorio("Granada", 2, 200);
		this.accsInventory[1] = new Accesorio("Cegadora", 1, 300);
		this.accsInventory[2] = new Accesorio("Claymore", 5, 400);
		this.accsInventory[3] = new Accesorio("C4", 4, 500);
		this.accsInventory[4] = new Accesorio("Botiquín", 3, 600);

	}

	public void mostrarInventario() {

		mostrarArray(this.mainInventory, "Armas principales: \n------------------------\n");
		mostrarArray(this.auxInventory, "Armas secundarias: \n------------------------\n");
		mostrarArray(this.accsInventory, "Accesorios: \n------------------------\n");
	}

	private void mostrarArray(Inventario[] arr, String msg) {
		System.out.println(msg);
		for (Inventario item : arr) {
			if (item != null)
				System.out.println(item + "\n");
		}
	}

	// Metodos para añadir armas al inventario

	public void addArmaPpal(ArmaPrincipal item) {
		int indiceActual;
	 
	    for (indiceActual = 0; indiceActual < mainInventory.length; indiceActual++) {
	        if (mainInventory[indiceActual] == null) {
	            mainInventory[indiceActual] = item;
	            return;
	        }
	    }
	    System.out.println("No se pueden crear más armas principales");
	
	}

	public void addArmaSec(ArmaSecundaria item) {
		
	}

	public void añadirEquipamiento(Accesorio item) {
		
	}

	// equiparAlUsuario
	public void equipar() {

	}

	// desquiparAlUsuario
	public void desequipar() {

	}

}
