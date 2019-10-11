package cursojava;

import java.util.Scanner;

public class Condicionales {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce tu edad");
		
		entrada = new Scanner(System.in);
		int edad = entrada.nextInt();
		
		if(edad>=18)
		{
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No Eres mayor de edad");
		}
	}

}
