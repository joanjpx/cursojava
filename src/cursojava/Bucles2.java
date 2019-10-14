package cursojava;

import java.util.Scanner;

public class Bucles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int intentos = 0;
		
		while(numero!=aleatorio) {
			System.out.println(aleatorio);
			System.out.println("Introduce un numero");
			numero = entrada.nextInt();
			
			if(numero==aleatorio) {
				System.out.println("Iguales");
			}else {
				System.out.println("Diferentes");
			}
		}
	}

}
