/**
 * 
 */
package POO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Joan P. Alvarado
 *
 */
//########### Class NOVIA

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
		Novia lv = new Novia();
		Auto car = new Auto("Hennessey","6661-LIM");
		
		
		System.out.println("Datos del Vehiculo : "+car.getModel()+" -- "+car.getPlaca());
		System.out.println("Datos del Propietario: "+lv.name+" "+lv.lastName);
		System.out.println("Fecha de Renovacion: "+car.renovacion);
	}

}


// ###### Class AUTO
class Auto
{
	private String model;
	private String placa;
	public Date renovacion;
	public Auto(String model, String placa)
	{
		this.model = model;
		this.placa = placa;
		GregorianCalendar calendario = new GregorianCalendar(2019,10-1,23,12,30,10);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.renovacion = calendario.getTime();
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
