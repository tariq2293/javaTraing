package Com.Provility.Practice.Training.lamdaExpression;

public class OrderItem {
    public OrderItem(String name, double unitPrice, int count) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;

    }


    public double calcCost() {
        return this.unitPrice * this.count;
    }

    @Override
    public String toString() {
        return "Merchandise{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", count=" + count +
                '}';
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

    private String name;
    private double unitPrice;
    private int count;

    public Boolean startsWithC() {
        return name.startsWith("C");
    }

}
