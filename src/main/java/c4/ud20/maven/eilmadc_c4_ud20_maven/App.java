package c4.ud20.maven.eilmadc_c4_ud20_maven;

/**
* C02 - UD19 - Elena López
*/

import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;
import ejercicio4.Ejercicio4;
import ejercicio5.Ejercicio5;
import ejercicio6.Ejercicio6;
import ejercicio7.Ejercicio7;
import ejercicio8.Ejercicio8;
import ejercicio9.Ejercicio9;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class App {
	// --------- Variables ------------
	public static Utils utils = new utils.Utils();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO: hacer Switch case control Ejercicio 1 a 5
		// Muestra el menu mediante poantalla y dialog
		utils.mostrarPrograma("UNIDAD 20 :MAVEN");
		imprimeMenuPrincipal();
	}

	// Imprimir Menu
	static public void imprimeMenuPrincipal() {

		String mensaje = " Opcion 1: EJERCICIO 1" + "\n Opcion 2: EJERCICIO 2" + "\n Opcion 3: EJERCICIO 3"
				+ "\n Opcion 4: EJERCICIO 4"+ "\n Opcion 5: EJERCICIO 5"+ "\n Opcion 6: EJERCICIO 6"+ "\n Opcion 7: EJERCICIO 7"+ "\n Opcion 8: EJERCICIO 8"+ "\n Opcion 9: EJERCICIO 9";

		int opcion;

		// Pide mensaje hasta que se introduzca una opcion correcta.(Entre 1 y 4)
		do {

			// Pide numero de opcion de MENU mediante dialog
			opcion = utils.pideInt(mensaje, "UD20:MAVEN ");

		} while (opcion > 9);

		verificaOpcionPrincipal(opcion);

	}

	// Verifica Opcion del menu
	/**
	 * @param opcion
	 */
	static public void verificaOpcionPrincipal(int opcion) {

		switch (opcion) {
		case 1:
			// Ejercicio1
			try {
				Ejercicio1 frame = new Ejercicio1();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}

			break;
		case 2:
			// Ejercicio3
			try {
				Ejercicio2 frame = new Ejercicio2();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			// Ejercicio3
			try {
				Ejercicio3 frame = new Ejercicio3();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 4:
			// Ejercicio4
			try {
				Ejercicio4 frame = new Ejercicio4();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 5:
			// Ejercicio5
			try {
				Ejercicio5 frame = new Ejercicio5();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 6:
			// Ejercicio6
			try {
				Ejercicio6 frame = new Ejercicio6();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 7:
			// Ejercicio7
			try {
				Ejercicio7 frame = new Ejercicio7();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 8:
			// Ejercicio8
			try {
				Ejercicio8 frame = new Ejercicio8();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 9:
			// Ejercicio9
			try {
				Ejercicio9 frame = new Ejercicio9();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}

	}
}