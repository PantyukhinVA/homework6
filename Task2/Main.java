package Task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket = new ShoppingBasket();

        basket.addProduct("Яблоко", 3);
        basket.addProduct("Банан", 2);
        basket.addProduct("Апельсин", 5);
        basket.addProduct("Помидор", 1);
        basket.addProduct("Огурец", 3);

        basket.addProduct("Яблоко", 5);

        List<String> products = basket.getProducts();
        System.out.println("Продукты в корзине: " + products);

        System.out.println("Количество яблок: " + basket.getProductQuantity("Яблоко"));

        basket.updateProductQuantity("Яблоко", 5);
        System.out.println("Обновленное количество яблок: " + basket.getProductQuantity("Яблоко"));

        basket.removeProduct("Банан");
        System.out.println("Продукты в корзине после удаления банана: " + basket.getProducts());

        basket.clear();
        System.out.println("Продукты в корзине после очистки: " + basket.getProducts());
    }
}