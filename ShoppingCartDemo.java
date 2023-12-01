import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Item> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        cartItems.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    public void removeItem(Item item) {
        if (cartItems.remove(item)) {
            System.out.println(item.getName() + " removed from cart.");
        } else {
            System.out.println("Item not found in cart.");
        }
    }

    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Cart Contents:");
            for (Item item : cartItems) {
                System.out.println("- " + item.getName() + ": $" + item.getPrice());
            }
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Item item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Product 1", 25.99);
        Item item2 = new Item("Product 2", 14.50);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.viewCart();

        cart.removeItem(item2);

        cart.viewCart();

        double total = cart.calculateTotal();
        System.out.println("Total Cost: $" + total);
    }
}