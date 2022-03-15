public class Beverage {
    // super class
    private String brandName;
    private boolean isCold;
    private double price;

    public Beverage(String brandName, boolean isCold, double price)
    {
        this.brandName = brandName;
        this.isCold = isCold;
        this.price = price;
    }

    public String getBrandName()
    {
        return brandName;
    }
    public boolean isCold()
    {
        return isCold;
    }
    public double getPrice()
    {
        return price;
    }

    public void drink()
    {
        System.out.println("You drink something, what an accomplishment.");
    }
}
