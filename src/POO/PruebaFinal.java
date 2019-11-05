package POO;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class PruebaFinal {

	public PruebaFinal() {
		//code..
	}

	public static void main(String[] args) {

		Empleados[] misEmpleados = new Empleados[4];
			misEmpleados[0] = new Empleados("Joan",1);
			misEmpleados[1] = new Empleados("Liz",1);
			misEmpleados[2] = new Empleados("Irving",1);
			misEmpleados[3] = new Jefe("Katia",1);
			Jefe jefeCastTest = (Jefe)misEmpleados[3];
			jefeCastTest.setAumento(50);
		misEmpleados[0].changeSection("Sistemas");

		Arrays.sort(misEmpleados);


		//System.out.println(returnEmpleadoObject(empleado1));
		/*
		System.out.println(misEmpleados[0].getDataEmpleado());
		System.out.println(misEmpleados[1].getDataEmpleado());
		System.out.println(misEmpleados[2].getDataEmpleado());
		System.out.println(misEmpleados[3].getDataEmpleado());
		*/
		for (Empleados e: misEmpleados){
			System.out.println(e.getDataEmpleado());
		}
	}

	public static Empleados returnEmpleadoObject(Empleados empleado)
	{
		return empleado;
	}

}

class Empleados implements Comparable{
	
	private String name;
	private String section;
	protected float sueldo;
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
		this.sueldo = 1300;
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
		return "Nombre: "+name+" - Seccion: "+section+" COD:"+code+" ID:"+id+" Sueldo:"+sueldo;
	}


	@Override
	public int compareTo(Object obj) {
		Empleados otroEmpleado = (Empleados)obj;
		if (this.sueldo<otroEmpleado.sueldo)
		{
			return -1;
		}
		if (this.sueldo>otroEmpleado.sueldo)
		{
			return 1;
		}
		return 0;
	}
}

final class Jefe extends Empleados{ //using final to stop heritage from Jefe class
	/*
	*	@constructor (String, int)
	*/
	public Jefe(String nombre,int code)
	{
		super(nombre,code);
	}

	public void setAumento(int percent)
	{
		sueldo = sueldo+(sueldo*percent/100);
	}
}