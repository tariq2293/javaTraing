package Com.Provility.Practice.Training.ECommerce;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ShoppingCartApp {


    public static void main(String[] args) {

        InventoryDB.init();

        ShoppingCart cartOne = new ShoppingCart(); // Create One Shopping Cart


        println("\nInitialize cart..");
        for (OrderItem orderItem : Arrays.asList(new OrderItem("Apple", 2.49, 5),
                new OrderItem("Milk", 3.99, 2),
                new OrderItem("Bread", 5.49, 1),
                new OrderItem("Cheese", 8.99, 2))) {
            cartOne.adds(orderItem);
        }
        println(cartOne.toString());
        println("Total cost:" + cartOne.totalPrice());



        ShoppingCart cartTwo = new ShoppingCart(); // Create One Shopping Cart
        cartTwo.adds(new OrderItem("Orange", 1.50, 15));
        cartTwo.adds(new OrderItem("Milk", 3.99, 1));


        println(cartTwo.toString());
        println("Total cost:" + cartTwo.totalPrice());


        ShoppingCart cartThree = new ShoppingCart(); // Create One Shopping Cart
        cartThree.adds(new OrderItem("Grapes", 3.50, 9));
        cartThree.adds(new OrderItem("Butter", 2.99, 3));
        cartThree.adds(new OrderItem("Wheat", 4.99, 1));

        println(cartThree.toString());
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
        int id = 0;


//        for (ShoppingCart itemNameCount : carts) {
//            countItem++;
//            HashMap<Integer, Long> map = new HashMap<>();
//            map.put(countItem, itemNameCount.items.stream().count() );
//            System.out.println(map);
//
//
//            itemNameCount.totalPrice();
//            HashMap<Double, Integer> maps = new HashMap<>();
//            maps.put(itemNameCount.totalPrice(), countItem);
//            System.out.println(maps);
//
//
//            if (itemNameCount.totalPrice() > totalAmount) {
//                totalAmount = itemNameCount.totalPrice();
//            }
//
//            System.out.println("Product with max item = " + itemNameCount.items
//                    .stream().map(OrderItem::getName)
//                    .findFirst().stream().count());
//
//
//        }



        for (ShoppingCart itemCount : carts){
            countItem++;
            HashMap<Integer, Long> map = new HashMap<>();
            map.put(countItem, itemCount.items.stream().count());
            System.out.println(map);
        }
        for(ShoppingCart idCheck : carts) {
             id++;
             idCheck.totalPrice();
             HashMap<Double, Integer> map = new HashMap<>();
             map.put(idCheck.totalPrice(), id);
             System.out.println(map);
        }
        for (ShoppingCart amount : carts){
            if (amount.totalPrice() > totalAmount) {
                totalAmount = amount.totalPrice();
            }
        }
        System.out.println("higher cart amount : " + totalAmount  );

        return null;
    }



    static void println(String content) {

        System.out.println(content);
    }

}
