package cursojava;

import javax.swing.JOptionPane;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* FOREACH LOOP */
		String [] paises = new String[5];
		//String [] paises = {"Venezuela","Peru","Chile","Ecuador","Colombia"};
		
		
		for(int i = 0; i < paises.length; i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce Pais "+(i+1));
			System.out.println(i+"--"+paises[i]);
		}
		
		for(String item:paises) {
			System.out.println(item);
		}
		
		
		
	}

}
