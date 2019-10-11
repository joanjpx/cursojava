/**
 * 
 */
package cursojava;

/**
 * @author Usuario
 *
 */
public class Calculo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.6;
		
		//double raiz = Math.sqrt(16);
		//double redondeo = Math.round(a);
		double potencia = Math.pow(a,1);
		
		//Usando "Refundicion" -  Forzar Tipo
		int entero = (int)potencia;
		System.out.println(entero);
	}

}
