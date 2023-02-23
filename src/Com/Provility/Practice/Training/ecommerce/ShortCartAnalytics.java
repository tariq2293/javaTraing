package Com.Provility.Practice.Training.ecommerce;

public class ShortCartAnalytics {
    String productWithMaxItems;
    int productMaxCount;
    Integer idOfExpensiveShoppingCart;

    public ShortCartAnalytics(String productWithMaxItems, int productMaxCount, Integer idOfExpensiveShoppingCart) {
        this.productWithMaxItems = productWithMaxItems;
        this.productMaxCount = productMaxCount;
        this.idOfExpensiveShoppingCart = idOfExpensiveShoppingCart;
    }

    public String getProductWithMaxItems() {

        return productWithMaxItems;
    }

    public void setProductWithMaxItems(String productWithMaxItems) {

        this.productWithMaxItems = productWithMaxItems;
    }

    public int getProductMaxCount() {

        return productMaxCount;
    }

    public void setProductMaxCount(int productMaxCount) {

        this.productMaxCount = productMaxCount;
    }

    public Integer getIdOfExpensiveShoppingCart() {

        return idOfExpensiveShoppingCart;
    }

    public void setIdOfExpensiveShoppingCart(Integer idOfExpensiveShoppingCart) {
        this.idOfExpensiveShoppingCart = idOfExpensiveShoppingCart;
    }
}
