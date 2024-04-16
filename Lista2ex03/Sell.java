package Lista2ex03;

import java.util.ArrayList;

public class Sell {

    private ArrayList<SaleItem> items;
    private double discount;

    public Sell(ArrayList<SaleItem> items, double discount) {
        this.items = items;
        this.discount = discount;   
    }

    public Sell(ArrayList<SaleItem> items) {
        this(items, 0);
    }
    
    public double getSellValor() {
        double totalAmount = 0;

        for (SaleItem item : items) {
            totalAmount += item.getTotal();
        }

        return totalAmount * (1 -  (discount / 100));
    }
}