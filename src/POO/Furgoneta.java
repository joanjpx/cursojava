package POO;

public class Furgoneta extends Coche {

    private int chargeCapacity;
    private int extraSpots;
    /*
    * __Construct
    */
    public Furgoneta()
    {
        super(); // Call to Father Class 'Coche' @ Constructor
        this.chargeCapacity = 300;
        this.extraSpots = 4;
    }

    public Furgoneta(int chargeCapacity, int extraSpots)
    {
        this.chargeCapacity = chargeCapacity;
        this.extraSpots = extraSpots;
    }

    public int getChargeCapacity()
    {
        return this.chargeCapacity;
    }

    public int getExtraSpots()
    {
        return this.extraSpots;
    }
}
