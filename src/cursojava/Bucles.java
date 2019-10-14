package cursojava;
import javax.swing.*;
public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "123456";
		String pass = "";
		
		while(clave.equals(pass)==false) {
			pass = JOptionPane.showInputDialog("Introduce password");
			
			if(clave.equals(pass)==false) {
				System.out.println("Unallowed");
			}
		}
		
		System.out.println("Allowed");
	}

}
