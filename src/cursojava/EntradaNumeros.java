package cursojava;
// Formatting Numbers

import java.lang.*;
import java.util.*;
import java.math.*;
import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = JOptionPane.showInputDialog("introduce un numero");
		Double num1 = Double.parseDouble(entrada);
		//double x = 10000.0;
		System.out.printf("%1.2f",num1/3);
		System.out.println("Su raiz es : "+Math.sqrt(num1));
	}

}
