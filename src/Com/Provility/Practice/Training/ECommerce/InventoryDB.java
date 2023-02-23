package Com.Provility.Practice.Training.ECommerce;

import java.util.ArrayList;
import java.util.List;

public class InventoryDB {
    static List<Product> productList = new ArrayList<>();

    static String init() {
        // similarly add other products
        productList.add(new Product("Grapes", 3.50, 100));
        productList.add(new Product("Apple", 2.50, 150));
        productList.add(new Product("Orange", 5.50, 200));
        productList.add(new Product("Papaya", 13.50, 40));
        productList.add(new Product("WaterMelon", 15.50, 50));
        productList.add(new Product("Coffee Powder", 10.50, 56));
        productList.add(new Product("Milk", 23.50, 36));
        productList.add(new Product("Bread", 5.49, 40));
        productList.add(new Product("Cheese", 8.99, 25));
        productList.add(new Product("Butter", 2.99, 30));
        productList.add(new Product("Chocolate", 4.99, 150));
        productList.add(new Product("Biscuit", 9.99, 59));
        productList.add(new Product("Maida", 14.99, 20));
        productList.add(new Product("Rice", 24.99, 70));

        return null;
    }

    static void deductProduct(String productName, int count) {



    }

    static int remainingProduct() {
        return 0;
    }

    static boolean isProductAvailable(String productName, int count){

        return false;
    }


}

