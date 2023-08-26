package home1;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }


    /**
     * Метод вывода в консоль каталога товаров
     */
    public void printCatalog() {
        System.out.println("SHOP CATALOG: ");
        for (Category category : categories) {
            System.out.println("Category: " + category.getName());
            ArrayList<Product> products = category.getProducts();

            for (Product product : products) {
                System.out.println(product.getName() + " - " + "price: " + product.getPrice() + ", " + "rating: " + product.getRating() + ";");
            }
        }
        System.out.println();
    }
}
