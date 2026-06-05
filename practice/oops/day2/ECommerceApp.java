class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
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

class ShoppingCart {
    private Product[] items;
    private int itemCount;

    public ShoppingCart(int capacity) {
        this.items = new Product[capacity];
        this.itemCount = 0;
    }

    public void addProduct(Product product) {
        if (itemCount < items.length) {
            items[itemCount] = product;
            itemCount++;
            System.out.println(product.getName() + " added to cart.");
        } else {
            System.out.println("Cart is full!");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Product phone = new Product("Smartphone", 699.99);
        Product headphones = new Product("Wireless Headphones", 149.50);

        ShoppingCart cart = new ShoppingCart(5);

        System.out.println("--- Adding Items ---");
        cart.addProduct(phone);
        cart.addProduct(headphones);

        System.out.println("\n--- Checkout ---");
        System.out.println("Total Price: $" + cart.calculateTotal());
    }
}
