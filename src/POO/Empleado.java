package POO;

public class Empleado {
	
	private String name;
	private float sueldo;
	private String fecha;
	private float subirSueldo;
	
	public Empleado() {
		this.name = "Joan Perez Alvarado";
		this.sueldo = (float)2300.00;
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