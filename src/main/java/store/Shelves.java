package store;

import java.util.List;

public class Shelves extends Utility {

    List<Goods> goodsList;


    public double priceCalculator() {
        double sum = 0;
        for (Goods prices : goodsList) {
            double endPrice = prices.priceCalculator();
            sum += endPrice;
        }
        return sum;
    }
}
