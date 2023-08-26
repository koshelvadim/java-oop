package home1;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Basket() {
        this.products = new ArrayList<>();
    }

    /**
     * метод добавления товара в корзину
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * метод удаления товара из корзины
     * @param product
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

}
