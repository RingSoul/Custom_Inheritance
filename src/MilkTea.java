public class MilkTea extends Beverage {
    // subclass
    private String supplement; // (e.g. bubble)
    private double milkPercentage;

    public MilkTea(String brandName, boolean isCold, double price, String supplement, double milkPercentage)
    {
        super(brandName, isCold, price);
        this.supplement = supplement;
        this.milkPercentage = milkPercentage;
    }

    public String getSupplement()
    {
        return supplement;
    }
    public double getMilkPercentage()
    {
        return milkPercentage;
    }

    public void increaseMilkPercentage(double amount)
    {
        milkPercentage += amount;
        System.out.println("You just made the milk percentage " + milkPercentage * 100 + "%");
        if (milkPercentage >= 1)
        {
            System.out.println("Isn't that really just milk?");
        }
    }
}
