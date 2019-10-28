package POO;
import POO.Coche;

public class Uso_Coche {

	public static void main(String[] args) {
		
		//Instance of new class "Coche"
		Coche cocheJoan = new Coche();
		Coche cocheLiz = new Coche();
		Furgoneta furgon = new Furgoneta(4,2);

		cocheJoan.setMarca("FORD");
		cocheLiz.setMarca("FERRARI");
		furgon.setMarca("TOYOTA");
		//System.out.println(cocheJoan.propietario[0][1]);
		System.out.println(furgon.getMarca());
		System.out.println(furgon.getChargeCapacity());
		System.out.println(furgon.getExtraSpots());
	}
}
