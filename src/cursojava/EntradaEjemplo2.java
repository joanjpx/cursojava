package cursojava;
// ### packages
import javax.swing.*;
import java.lang.Integer;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

		System.out.println(nombre);
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		//Pasando a Entero con la Class Integer
		int entero = Integer.parseInt(edad);
		entero++;
		System.out.println(entero);
	}

}
