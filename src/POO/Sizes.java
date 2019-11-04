package POO;

public class Sizes {

    public static String[] talla = {"S","M","L"};
    enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE};
    public static void main(String[] args)
    {
        Talla s = Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla x = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;

        System.out.println(xl);
    }
}
