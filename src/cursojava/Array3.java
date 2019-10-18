package cursojava;

import javax.swing.JOptionPane;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* FOREACH LOOP */
		int [] random_array = new int[150];
		
		for(int i = 0; i < random_array.length; i++)
		{
			random_array[i] = (int)(Math.random()*100);
			
			System.out.println(random_array[i]);
		}
	}

}
