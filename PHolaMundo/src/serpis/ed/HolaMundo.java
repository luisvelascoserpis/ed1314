package serpis.ed;

import java.util.Scanner;

public class HolaMundo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("Dime tu nombre: ");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		
		System.out.println("Hola " + nombre + ".");
		

	}

}
