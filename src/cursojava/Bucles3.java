package cursojava;

import javax.swing.JOptionPane;

public class Bucles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++){
			System.out.println("Joan "+i);
		}
		
		
		boolean arroba = false;
		String mail = JOptionPane.showInputDialog("Introduce Email");
		
		for(int x = 0; x < mail.length(); x++ ) {
			
			//imprimir cada letra
			System.out.println(mail.charAt(x));
			
			// validar si hay arroba
			if(mail.charAt(x)=='@')
			{
				arroba=true;
			}
		}
		
		if(arroba==true)
		{
			System.out.println("Email Correcto");
		}else {
			System.out.println("Email Incorrecto");
		}
	}

}
