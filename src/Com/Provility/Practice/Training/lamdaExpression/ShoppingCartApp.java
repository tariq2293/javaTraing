package Com.Provility.Practice.Training.lamdaExpression;


import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ShoppingCartApp {


    public static void main(String[] args) {

        InventoryDB.init();

        ShoppingCart cartOne = new ShoppingCart(); // Create One Shopping Cart
        /*String productToCheckForPaperBag = "Grapes";
        int productCountToCheckForPaperBag = 6;*/


        println("\nInitialize cart..");
        cartOne.add("Apple", 5);
        cartOne.add("Milk", 2);
        cartOne.add("Bread", 1);
        cartOne.add("Cheese", 2);


        ShoppingCart cartTwo = new ShoppingCart(); // Create One Shopping Cart
        cartTwo.add("Orange", 1);
        cartTwo.add("Milk", 1);


        ShoppingCart cartThree = new ShoppingCart(); // Create One Shopping Cart
        cartThree.add("Grapes", 9);
        cartThree.add("Butter", 3);
        cartThree.add("Wheat", 1);


        List<ShoppingCart> allShoppingCarts = new ArrayList<>();
        allShoppingCarts.add(cartOne);
        allShoppingCarts.add(cartTwo);
        allShoppingCarts.add(cartThree);

        System.out.println(allShoppingCarts);
        ShortCartAnalytics shortCartAnalytics = analyseShoppingCarts(allShoppingCarts);
    }

    static Boolean startWithStaticExample(OrderItem orderItem) {
        return orderItem.startsWithC();
    }

    public static ShortCartAnalytics analyseShoppingCarts(List<ShoppingCart> carts) {
        List<OrderItem> allOrderItemsList = new ArrayList<>();
        for (ShoppingCart shoppingCart : carts) {
            allOrderItemsList.addAll(shoppingCart.items);
        }

        Predicate<OrderItem> startsWithOrder = (item) -> item.startsWithC();
  //      allOrderItemsList.stream().filter(OrderItem::startsWithC).collect(Collectors.toList());
//        allOrderItemsList.stream().filter((orderItem) -> orderItem.startsWithC()).collect(Collectors.toList());
       allOrderItemsList.stream().filter(startsWithOrder).collect(Collectors.toList());
//        allOrderItemsList.stream().filter(ShoppingCartApp::startWithStaticExample).collect(Collectors.toList());


        Map<String, Integer> productNameCount = new HashMap<>();

        for (OrderItem orderItem : allOrderItemsList) {
            if (productNameCount.containsKey(orderItem.getName())) {
                Integer existingCount = productNameCount.get(orderItem.getName());
                Integer newCount = orderItem.getCount() + existingCount;
                productNameCount.put(orderItem.getName(), newCount);
            } else {
                productNameCount.put(orderItem.getName(), orderItem.getCount());
            }
        }

        String productName = "empty";
        Integer productQuantity = -1;
        for (Map.Entry<String, Integer> mapItemEntry : productNameCount.entrySet()) {
            if (mapItemEntry.getValue() > productQuantity) {
                productQuantity = mapItemEntry.getValue();
                productName = mapItemEntry.getKey();
            }
        }

        System.out.println(productName);

        return null;

    }


    static void println(String content) {
//        System.out.println(content);
    }
}
