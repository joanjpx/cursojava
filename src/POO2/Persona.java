package POO2;

public class Persona implements InterfacePersona{
    /*
    *   Class Attributes
    */
    private String name;
    private String lastName;
    private String dni;
    /*
    * @ Class Constructor Persona params(nombre, apellido, dni)
    */
    public Persona(String name, String lastName, String dni)
    {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getDNI() {
        return this.dni;
    }
}
