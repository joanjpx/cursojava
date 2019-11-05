package POO2;

public class Jefe extends Empleado{
    // Attributes
    public static boolean ceo = false;
    /*
    * __Constructor call
    */
    public Jefe(String name, String lastName, String dni)
    {
        super(name,lastName,dni);
    }

    public void setCeo()
    {
        this.ceo = true;
    }
}
