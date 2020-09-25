package store;

import java.util.List;

public class Accounting implements AccountingUtility {

    List<AccountingUtility> collection;

    public double priceCalculator() {
        double sum = 0;
        for (AccountingUtility prices : collection) {
            double endPrice = prices.priceCalculator();
            sum += endPrice;
        }
        return sum;
    }



}
