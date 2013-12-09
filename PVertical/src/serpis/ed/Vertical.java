package serpis.ed;

import java.util.Scanner;

public class Vertical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = scanner.nextLine();

//		int index = 0;
//		while ( index < nombre.length() ) {
//			System.out.println(nombre.charAt( index ));
//			index++;
//		}
		
//		for (int index = 0; index < nombre.length(); index++)
//			System.out.println(nombre.charAt( index ));
	
		for (char caracter : nombre.toCharArray() )
			System.out.println( caracter );
		
		
	}

}
