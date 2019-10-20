/**
 * 
 */
package POO;

/**
 * @author Usuario
 *
 */
public class Coche {
	
	private String marca;
	private String modelo;
	private String ruedas;
	private int ancho;
	private int alto;
	private boolean x4;
	
	public Coche() //same name as the class
	{
		marca = "TOYOTA";
		modelo = "4RUNNER";
		ruedas = "45/15/60";
		ancho = 5;
		alto = 2;
		x4 = true;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getMarca()
	{
		return this.marca;
	}
	
	/*public static void main(String[] args) {

		Coche nuevo = new Coche(); //Instance of new class "Coche"
		
		nuevo.Arranca("CHEVROLET");
		
		System.out.println(nuevo.marca);
		
	}*/
}
