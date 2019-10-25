package POO;

import javax.swing.JOptionPane;

public class PruebaFinal {

	public PruebaFinal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados empleado1 = new Empleados("Joan",1);
		Empleados empleado2 = new Empleados("Liz",1);
		Empleados empleado3 = new Empleados("Irving",1);
		empleado1.changeSection("Sistemas");
		//System.out.println(returnEmpleadoObject(empleado1));
		System.out.println(empleado1.getDataEmpleado());
		System.out.println(empleado2.getDataEmpleado());
		System.out.println(empleado3.getDataEmpleado());
	}

	public static Empleados returnEmpleadoObject(Empleados empleado)
	{
		return empleado;
	}

}

class Empleados{
	
	private String name;
	private String section;
	//FINAL para indicar que no será modificada una vez seteada
	private final int code;
	//STATIC para Volver ID unica entre las diferentes instancias de clase.
	private int id;
	private static int idSiguiente = 1;
	
	public Empleados(String nombre,int code)
	{
		this.name = nombre;
		this.section = "Administracion";
		this.code = code;
		this.id = idSiguiente;
		this.idSiguiente++;
	}
	/*
	*	@param String section
	*/
	public void changeSection(String section)
	{
		this.section = section;
	}
	/*
	*	@param int id
	*/
	public void setCodeEmployee(int id)
	{
		//this.code = id;
	}
	
	public String getDataEmpleado()
	{
		return "Nombre: "+name+" - Seccion: "+section+" COD:"+code+" ID:"+id;
	}
	
	
}