package home1;


import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Category category1 = new Category("Fruits");

        category1.addProduct(new Product("apple", 200.0, 5));
        category1.addProduct(new Product("bananas", 100.0, 4));
        category1.addProduct(new Product("pear", 300.0, 5));

        Category category2 = new Category("Clothes");

        category2.addProduct(new Product("jeans", 1200.0, 5));
        category2.addProduct(new Product("t-shirt", 500.0, 4));
        category2.addProduct(new Product("shorts", 600.0, 4));

        shop.addCategory(category1);
        shop.addCategory(category2);

        shop.printCatalog();


        User user1 = new User("John", "123");
        User user2 = new User("Tom", "456");

        user1.getBasket().addProduct(category1.getProducts().get(0));
        category1.getProducts().remove(0);

        user1.getBasket().addProduct(category1.getProducts().get(0));
        user1.getBasket().removeProduct(category1.getProducts().get(0));

        user1.getBasket().addProduct(category1.getProducts().get(1));
        category1.getProducts().remove(1);



        user2.getBasket().addProduct(category2.getProducts().get(2));
        category2.getProducts().remove(2);

        System.out.println("User login: " +user1.getLogin() + ", " + "user password: " + user1.getPassword() + "\nBasket:");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        for (Product product : user1Products) {
            System.out.println(product.getName() + " - " + "price: " + product.getPrice() + ", " + "rating: " + product.getRating() + ";");
        }
        System.out.println();

        System.out.println("User login: " +user2.getLogin() + ", " + "user password: " + user2.getPassword() + "\nBasket:");
        ArrayList<Product> user2Products = user2.getBasket().getProducts();
        for (Product product : user2Products) {
            System.out.println(product.getName() + " - " + "price: " + product.getPrice() + ", " + "rating: " + product.getRating() + ";");
        }
        System.out.println();

        shop.printCatalog();
    }
}
