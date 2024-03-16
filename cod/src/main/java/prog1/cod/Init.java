package prog1.cod;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		InventarioController inventario = new InventarioController();

		System.out.println("1. Ver inventario");
		System.out.println("2. Añadir arma principal");
		System.out.println("3. Añadir arma secundaria");
		System.out.println("4. Añadir accesorio");
		System.out.println("5. Equipar al personaje");
		System.out.println("6. Desquipar al personaje");
		System.out.println("7. Salir del programa");

		System.out.println("Introduce el numero que corresponde a la accion: ");
		int eleccion = sc.nextInt();

			switch (eleccion) {
			case 1:
				System.out.println("Este es tu inventario");
				inventario.mostrarInventario();

				break;
			case 2:
				System.out.println("Recuerda el peso maximo de las armas principales es 5");
				System.out.println("¿Como quieres llamar al arma?");
				String nombre = sc.nextLine();
				sc.nextLine();
				System.out.println("¿Cuanto pesa el arma?");
				int peso=sc.nextInt();
				
				System.out.println("¿Cuanta municion lleva inicialmente el arma?");
				int municion= sc.nextInt();
				
				ArmaPrincipal armaNueva = new ArmaPrincipal(nombre,peso,municion);
				
				inventario.addArmaPpal(armaNueva);
				
				break;
			case 3:
				
				System.out.println("Hay ahora mismo 5 armas disponibles");
				System.out.println("¿Como quieres llamar al arma?");
				String nombre2 = sc.nextLine();
				System.out.println("¿Cuanto pesa el arma?");
				System.out.println("Recuerda el peso maximo de las armas principales es 5");
				int peso2 = sc.nextInt();
				System.out.println("¿De que tipo es el arma?");
				String tipo= sc.nextLine();
				
				ArmaSecundaria armaNueva2 = new ArmaSecundaria(nombre2,peso2,tipo);
				inventario.addArmaSec(armaNueva2);
				break;
			case 4:

				break;
			case 5:

			case 6:
				break;
			}

		}

	}


