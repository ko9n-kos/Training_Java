package store;

import java.util.List;

public class StoreHall extends Utility {

    List<Shelves> everythingWeHave;

    public double priceCalculator() {
        double sum = 0;
        for (Shelves prices : everythingWeHave) {
            double endPrice = prices.priceCalculator();
            sum += endPrice;
        }
        return sum;


    }



}
