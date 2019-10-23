/**
 * 
 */
package POO;

/**
 * @author Joan P. Alvarado
 *
 */
public class Novia {
	/**
	 * @param args
	 */
	private String name;
	private String lastName;
	
	public Novia()
	{
		this.name = "Lizzeth";
		this.lastName = "V.";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Auto
{
	private String model;
	private String placa;
	
	public Auto(String model, String placa)
	{
		
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
