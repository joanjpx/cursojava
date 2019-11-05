package POO2;

public class UsoClases {
    /*
    *
    * @ main
    */
    public static void main(String[] args)
    {
        Persona p = new Persona("Joan","Perez","V24908526");
        Jefe boss = new Jefe("Juan Carlos","Rivera","123456666");
        Jefe gboss = new Jefe("Gilkeira","Pereira","666123546");

            boss.setCeo();

            System.out.println(gboss.getName()+" CEO:"+gboss.ceo);
    }
}
