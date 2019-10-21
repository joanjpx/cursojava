package POO;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Empleado {
	
	private String name;
	private float sueldo;
	private Date altaContrato;
	private float subirSueldo;
	
	public Empleado(String nom, double amount, int year, int month, int day) {
		this.name = "Joan Perez Alvarado";
		this.sueldo = (float)2300.00;
		GregorianCalendar calendario = new GregorianCalendar(year,month,day);
		this.altaContrato = calendario.getTime();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public float getSueldo()
	{
		return this.sueldo;
	}
	
	public void setSueldo(float sueldo)
	{
		this.sueldo=sueldo;
	}

}