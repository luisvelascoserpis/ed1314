package serpis.ed;

import java.util.Random;
import java.util.Scanner;


//Genera un número aleatorio entre 1 y 1000 (inclusives)

/**
 * @author luisvelasco
 *
 */
public class Adivina {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//int numeroAleatorio = myRandom(1, 1000); //devolverá un número aleatorio entre 1 y 1000 (ambos inclusive)

		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		
		System.out.println("He generado un número entre 1 y 1000. Intenta adivinarlo. " + numeroAleatorio);
		
		Scanner scanner = new Scanner(System.in);
		
		int contadorIntentos = 0; 
		
		while (true) {
			contadorIntentos++; //contadorIntentos = contadorIntentos + 1;
			System.out.print("Intento número " + contadorIntentos + ". Introduce un número: ");
			int numeroIntroducido = scanner.nextInt();
			
			if (numeroIntroducido == numeroAleatorio) 
				break;
			if (numeroIntroducido < numeroAleatorio)
				System.out.println("Di uno mayor");
			else // numeroIntroducido > numeroAleatorio
				System.out.println("Di uno menor");
		}
		//Esto está fuera del ciclo
		System.out.println("Has acertado. Enhorabuena.");
		
	}
	
	
	/** Devuelve un entero entre low y hight (ambos inclusive).
	 * @param low
	 * @param hight
	 * @return
	 */
	private static int myRandom(int low, int hight) {
		Random random = new Random();
		return random.nextInt( hight -low + 1 ) + low; 
	}

}
