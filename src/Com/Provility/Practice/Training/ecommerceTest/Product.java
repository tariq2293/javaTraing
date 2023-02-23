package Com.Provility.Practice.Training.ecommerceTest;

public class Product {
    String name;
    double unitPrice;
    int count;

    public Product(String name, double unitPrice, int count) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCount() {

        return count;
    }

    public int setCount(int count) {
        this.count = count;
        return count;
    }
}
