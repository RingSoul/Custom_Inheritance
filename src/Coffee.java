public class Coffee extends Beverage {
    // subclass
    private boolean hasSugar;
    private double caffeinePercentage;

    public Coffee(String brandName, boolean isCold, double price, boolean hasSuagr, double caffeinePercentage)
    {
        super(brandName, isCold, price);
        this.hasSugar = hasSugar;
        this.caffeinePercentage = caffeinePercentage;
    }

    public boolean hasSugar()
    {
        return hasSugar;
    }
    public double getCaffeinePercentage()
    {
        return caffeinePercentage;
    }

    public void addSugar()
    {
        hasSugar = true;
        System.out.println("You added sugar into this coffee.");
    }
}
