package POO;

public class PruebaFinal {

	public PruebaFinal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados empleado1 = new Empleados("Joan",1);
		empleado1.changeSection("Sistemas");
		//System.out.println(returnEmpleadoObject(empleado1));
		System.out.println(empleado1.getDataEmpleado());
	}

	public static Empleados returnEmpleadoObject(Empleados empleado)
	{
		return empleado;
	}

}

class Empleados{
	
	private String name;
	private String section;
	private final int code;
	
	public Empleados(String nombre,int id)
	{
		this.name = nombre;
		this.section = "Administracion";
		this.code = 6661;
	}
	
	public void changeSection(String section)
	{
		this.section = section;
	}

	public void setCodeEmployee(int id)
	{
		//this.code = id;
	}
	
	public String getDataEmpleado()
	{
		return "Nombre: "+name+" - Seccion: "+section+" COD:"+code;
	}
	
	
}