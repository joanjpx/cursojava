package POO;

public class PruebaFinal {

	public PruebaFinal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados empleado1 = new Empleados("Joan");
		
		System.out.println(empleado1.getDataEmpleado());
	}

}

class Empleados{
	
	private String name;
	private String section;
	
	public Empleados(String nombre)
	{
		this.name = nombre;
		this.section = "Administración";
	}
	
	public void changeSection(String section)
	{
		this.section = section;
	}
	
	public String getDataEmpleado()
	{
		return "Nombre: "+name+" - Seccion: "+section;
	}
	
	
}