package cursojava;

import javax.swing.JOptionPane;
import java.util.*;
import java.lang.Integer;
public class Condicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("selecciona la figura \n 1.Cuadrado \n 2.Rectangulo \n 3.Triangulo \n 4.Circulo");
		
		Scanner entrada = new Scanner(System.in);
		int figura = entrada.nextInt();
		
		switch(figura){
			// si es cuadrado
			case 1:
				String x = JOptionPane.showInputDialog("Introduce el lado");
				System.out.println("El area del cuadrado es "+ Math.pow(Integer.parseInt(x),2));
			break;
			//si es rectangulo
			case 2:
				System.out.print("rectangulo");
			break;
			//si es triangulo
			case 3:
				System.out.print("triangulo");
			break;
			//si es circulo
			case 4:
				System.out.print("circulo");
			break;
		}
		
	}

}
