package POO;

import POO.Empleado;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public Uso_Empleado() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Empleado trabajador = new Empleado(null, 0, 0, 0, 0);
		System.out.println(trabajador.getName());
	}

}

