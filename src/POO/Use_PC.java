package POO;

public class Use_PC {
    public static void main(String[] args)
    {
        Laptop pc = new Laptop();

        pc.setProcessor("Core I9 9900K", (float) 3.9);
        pc.setProcessor("AMD RYZEN 4000", (float) 3.8);

        System.out.println(pc.getSpecs());
    }
}
