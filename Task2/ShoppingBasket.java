package Task2;

import java.util.*;

public class ShoppingBasket implements Basket {
    private final Map<String, Integer> products;

    public ShoppingBasket() {
        products = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    @Override
    public void removeProduct(String product) {
        if (products.containsKey(product)) {
            products.remove(product);
        } else {
            System.out.println("Продукт " + product + " не найден в корзине!");
        }

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, quantity);
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}
