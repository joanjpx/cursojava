package cursojava;

import java.util.Scanner;

public class ScannerTest {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre pf:");
		String nombre = entrada.nextLine();
		
		System.out.println("Introduzca su nombre pf:");
		int edad = entrada.nextInt();
		
		System.out.println("Nombre : "+nombre+" Edad: "+edad);
	}

}
