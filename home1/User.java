package home1;

public class User {

    private String login;
    private String password;

    private Basket basket;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }
}
