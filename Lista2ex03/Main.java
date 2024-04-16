package Lista2ex03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product productA = new Product("teste A", 100);
        Product productB = new Product("teste B", 20);
        Product productC = new Product("teste C", 35);

        SaleItem itemA = new SaleItem(productA, 3);
        SaleItem itemB = new SaleItem(productB, 2);
        SaleItem itemC = new SaleItem(productC, 5);

        ArrayList<SaleItem> items = new ArrayList<>();
        items.add(itemA);
        items.add(itemB);
        items.add(itemC);

        Sell sell = new Sell(items, 15);

        System.out.println("O preço final da venda é: R$ " + sell.getSellValor());
    }
}