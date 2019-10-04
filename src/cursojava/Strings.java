package cursojava;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Joan";
		
		System.out.println("Hola," + nombre);
		
		System.out.println("Tu Nombre tiene " + nombre.length() + " Letras");
		
		System.out.println("La primera letra de tu nombre es " + nombre.charAt(0));
		
		int last = nombre.length();
		
		System.out.println("Y la ultima es "+ nombre.charAt(last-1) );
		
	}

}
