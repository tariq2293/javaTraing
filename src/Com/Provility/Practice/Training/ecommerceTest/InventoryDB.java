package Com.Provility.Practice.Training.ecommerceTest;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class InventoryDB {
    static List<Product> productList = new ArrayList<>();


    static List<Product> init() {
        // similarly add other products
        productList.add(new Product("Strawberry", 3.50, 15));
        productList.add(new Product("Apple", 2.49, 51));
        productList.add(new Product("Milk", 3.50, 21));
        productList.add(new Product("Cheese", 3.50, 32));
        productList.add(new Product("Bread", 3.50, 20));
        productList.add(new Product("Grapes", 3.50, 19));
        productList.add(new Product("Butter", 3.50, 31));
        productList.add(new Product("Orange", 3.50, 15));
        productList.add(new Product("Wheat", 3.50, 21));

        return productList;
    }

    static int deductProduct(String productName, int count) {
        int newCounting = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name == productName && productList.get(i).count >= count) {

                newCounting = productList.get(i).count - count;


                return newCounting ;
            }
        }
        return 0;
    }

    static String remainingProduct(String productName) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name == productName) {
                String remainProduct = productList.get(i).name;
                return remainProduct;
            }
        }
        return null;
    }

    static boolean isProductAvailable(String productName, int count) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name == productName) {
                if (productList.get(i).count >= count) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    static double getUnitPrice(String productName) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name == productName) {
                return productList.get(i).unitPrice;
            }
        }
        return 0;
    }



}
