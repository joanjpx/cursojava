package POO;
import POO.Coche;

public class Uso_Coche {

	public static void main(String[] args) {
		
		//Instance of new class "Coche"
		
		Coche cocheJoan = new Coche(); 
		
		Coche cocheLiz = new Coche();
		
		cocheJoan.setMarca("FORD");
		
		cocheLiz.setMarca("FERRARI");
		
		System.out.println(cocheJoan.propietario[0][1]);
		
	}

}
