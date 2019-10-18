package cursojava;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* FOREACH LOOP */
		
		String [] paises = {"Venezuela","Peru","Chile","Ecuador","Colombia"};
		
		for(int i = 0; i < paises.length; i++) {
			
			System.out.println(i+"--"+paises[i]);
		}
		
		for(String item:paises) {
			System.out.println(item);
		}
		
		
		
	}

}
