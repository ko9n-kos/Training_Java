package store;

public class Goods implements AccountingUtility {
    public double price;

    public Goods(double price) {
        this.price = price;
    }

    public  double getPrice() {
        return price;
    }

    public double priceCalculator(){
        return price+TaxCalculating.taxCalc(price);
    }
}
