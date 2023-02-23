package Com.Provility.Practice.Training.ecommerce;

import java.util.ArrayList;


public class ShoppingCart {
    static int shoppingCarIdCounter = 1;

    public ArrayList<OrderItem> items;


    private Integer id = 0;



    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.id = shoppingCarIdCounter;
        shoppingCarIdCounter++;
    }
    public static int getShoppingCarIdCounter() {
        return shoppingCarIdCounter;
    }

    public void add(OrderItem orderItem) {
        items.add(orderItem);
    }

    public void remove(int index) {
        items.remove(index);
    }

    public double totalPrice() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.calcCost();

        }
        double applyDiscount = 0;
        int shippingCost = 5;
        if (total >= 12) {
            applyDiscount = total * (.08);
        } else if (total < shippingCost) {
            System.out.println(" Apply shipping" + "=" + total + shippingCost);

        }

        return total - applyDiscount;
    }

    public void addPaperBagIfBoughtMoreItems(String itemName, int countToCheck) {
        for (OrderItem item : items) {
            if (item.getName() == itemName && item.getCount() > countToCheck) {
                OrderItem orderItem = new OrderItem("PaperBag", 0, 1);
                this.items.add(orderItem);
                break;
            }
        }
    }



    @Override
    public String toString() {
        return "ShoppingCart " +
                "items = "+ items ;
    }

}
