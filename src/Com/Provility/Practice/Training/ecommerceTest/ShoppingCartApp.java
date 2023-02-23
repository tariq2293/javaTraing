package Com.Provility.Practice.Training.ecommerceTest;


import java.util.*;

public class ShoppingCartApp {


    public static void main(String[] args) {

        InventoryDB.init();

        ShoppingCart cartOne = new ShoppingCart(); // Create One Shopping Cart


        println("\nInitialize cart..");
        cartOne.add("Apple", 5);
        cartOne.add("Milk", 2);
        cartOne.add("Bread", 1);
        cartOne.add("Cheese", 2);


        ShoppingCart cartTwo = new ShoppingCart(); // Create One Shopping Cart
        cartTwo.add("Orange", 1);
        cartTwo.add("Strawberry", 1);


        ShoppingCart cartThree = new ShoppingCart(); // Create One Shopping Cart
        cartThree.add("Grapes", 9);
        cartThree.add("Butter", 3);
        cartThree.add("Wheat", 1);





        List<ShoppingCart> allShoppingCarts = new ArrayList<>();
        allShoppingCarts.add(cartOne);
        allShoppingCarts.add(cartTwo);
        allShoppingCarts.add(cartThree);



        List<OrderItem> allProductList = new ArrayList<>();
        for (ShoppingCart shoppingCart : allShoppingCarts) {
            allProductList.addAll(shoppingCart.items);
        }


       for (OrderItem orderItem: allProductList ){
         Integer count =   InventoryDB.deductProduct(orderItem.getName(),orderItem.getCount());
          String finalStock = InventoryDB.remainingProduct(orderItem.getName());
           System.out.println("after deduction = " + finalStock + "  "+ count);
       }

        ShortCartAnalytics shortCartAnalytics = analyseShoppingCarts(allShoppingCarts);
        System.out.println(shortCartAnalytics);
    }


    public static ShortCartAnalytics analyseShoppingCarts(List<ShoppingCart> carts) {
        int countItem = 0;
        int id  = 0;
        double totalAmount = 0.00;
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

        List<OrderItem> allOrderItemsList = new ArrayList<>();
        for (ShoppingCart shoppingCart : carts) {
            allOrderItemsList.addAll(shoppingCart.items);
        }

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
        System.out.println("Max count : " + productName +" "+ productQuantity);


            return null;



    }
    static void println(String content) {
//        System.out.println(content);
    }
}
