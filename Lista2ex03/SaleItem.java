package Lista2ex03;

public class SaleItem {
    
    private Product product;
    private int amount;

    public SaleItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }
    
    public double getTotal() {
        return product.getPrice() * amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmout() {
        return amount;
    }
}