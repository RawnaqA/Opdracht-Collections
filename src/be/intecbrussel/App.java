package be.intecbrussel;

import java.util.List;

public class App {
    public static void main(String[] args) {

        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);

        productFactory.createProducts(100);
        System.out.println(productSorter.getNumberOfProducts());

        List<FoodProduct> foodProducts = productSorter.getFoodProducts();
        System.out.println(foodProducts.size());

        for (int i = 0; i < foodProducts.size(); i++) {
            System.out.println(foodProducts.get(i));

        }
    }
}
