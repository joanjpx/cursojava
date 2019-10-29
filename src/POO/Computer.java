package POO;

public abstract class Computer {

    public int HDD,RAM;
    public boolean SSD,liquidRefresh,turboBoost;
    private float frequency;
    private String processor;

    public Computer()
    {
        HDD = 500;
        RAM = 16;
        SSD = true;
        liquidRefresh = true;
        turboBoost = true;
    }

    public static void main(String[] args){

    }


    public void setProcessor(String model, float frequency)
    {
        this.frequency = frequency;
        this.processor = model;
    }

    public final String getSpecs()
    {
        System.out.println("HDD: "+HDD);
        System.out.println("RAM: "+RAM);
        System.out.println("SSD: "+SSD);
        System.out.println("PRO: "+processor);
        System.out.println("GHZ: "+frequency);
        return "";
    }
}
