package home1;

import java.util.ArrayList;

public class Category {

    private String name;
    private ArrayList<Product> products;

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    /**
     * метод добавления товара в категорию
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
    }

}
