package Com.Provility.Practice.Training.ecommerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingCartApp {

    public static void main(String[] args) {
        ShoppingCart cartOne = new ShoppingCart(); // Create One Shopping Cart
        String productToCheckForPaperBag = "Apple";
        int productCountToCheckForPaperBag = 3;

        println("\nInitialize cart..");
        cartOne.add(new OrderItem("Apple", 2.49, 5));
        cartOne.add(new OrderItem("Milk", 3.99, 2));
        cartOne.add(new OrderItem("Bread", 5.49, 1));
        cartOne.add(new OrderItem("Cheese", 8.99, 2));
        cartOne.addPaperBagIfBoughtMoreItems(productToCheckForPaperBag, productCountToCheckForPaperBag);


        println("Total cost:" + cartOne.totalPrice());


        ShoppingCart cartTwo = new ShoppingCart(); // Create One Shopping Cart
        cartTwo.add(new OrderItem("Orange", 1.50, 15));
        cartTwo.add(new OrderItem("Milk", 3.99, 1));

        cartTwo.addPaperBagIfBoughtMoreItems(productToCheckForPaperBag, productCountToCheckForPaperBag);

        println("Total cost:" + cartTwo.totalPrice());


        ShoppingCart cartThree = new ShoppingCart(); // Create One Shopping Cart
        cartThree.add(new OrderItem("Grapes", 3.50, 9));
        cartThree.add(new OrderItem("Butter", 2.99, 3));
        cartThree.add(new OrderItem("Wheat", 4.99, 1));
        cartThree.addPaperBagIfBoughtMoreItems(productToCheckForPaperBag, productCountToCheckForPaperBag);

        println("Total cost:" + cartThree.totalPrice());

        List<ShoppingCart> allShoppingCarts = new ArrayList<>();
        allShoppingCarts.add(cartOne);
        allShoppingCarts.add(cartTwo);
        allShoppingCarts.add(cartThree);



        ShortCartAnalytics shortCartAnalytics = analyseShoppingCarts(allShoppingCarts);
        System.out.println(shortCartAnalytics);

    }

    public static ShortCartAnalytics analyseShoppingCarts(List<ShoppingCart> carts) {
        int countItem = 0;
        double totalAmount = 0.00;


        for (ShoppingCart itemNameCount : carts) {
            countItem++;
            HashMap<Integer, Long> map = new HashMap<>();
            map.put(countItem, itemNameCount.items.stream().count() );
            System.out.println(map);


            itemNameCount.totalPrice();
            HashMap<Double, Integer> maps = new HashMap<>();
            maps.put(itemNameCount.totalPrice(), countItem);
            System.out.println(maps);


            if (itemNameCount.totalPrice() > totalAmount) {
                totalAmount = itemNameCount.totalPrice();
            }

            System.out.println("Product with max item = " + itemNameCount.items
                    .stream().map(OrderItem::getName)
                    .findFirst().stream().count());


        }
//
//
//
//        for (ShoppingCart itemCount : carts){
//            countItem++;
//            HashMap<Integer, Long> map = new HashMap<>();
//            map.put(countItem, itemCount.items.stream().count());
//            System.out.println(map);
//        }
//        for(ShoppingCart idCheck : carts) {
//             id++;
//             idCheck.totalPrice();
//             HashMap<Double, Integer> map = new HashMap<>();
//             map.put(idCheck.totalPrice(), id);
//             System.out.println(map);
//        }
//        for (ShoppingCart amount : carts){
//            if (amount.totalPrice() > totalAmount) {
//                totalAmount = amount.totalPrice();
//            }
//        }
        System.out.println("higher cart amount : " + totalAmount  );

     return null;
    }

    static void println(String content) {

        System.out.println(content);
    }
}