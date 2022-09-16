package be.intecbrussel;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {

    private List<Product> products;
    private List<FoodProduct> foodProducts;
    private List<HealthProduct> healthProducts;
    private List<ElectricProduct> electricProducts;

    public ProductSorter(){

        products = new ArrayList<Product>();
        foodProducts = new ArrayList<FoodProduct>();
        healthProducts = new ArrayList<HealthProduct>();
        electricProducts = new ArrayList<ElectricProduct>();
    }
    public List<FoodProduct> getFoodProducts(){
        return foodProducts;
    }
    public List<HealthProduct> getHealthProducts(){
        return healthProducts;
    }
    public List<ElectricProduct> getElectricProducts(){
        return electricProducts;
    }
    public void sortProduct(Product product) {

        if (products.contains(product))
            return;
        products.add(product);
        if (product.getClass() == FoodProduct.class)
            foodProducts.add((FoodProduct) product);

        else if (product.getClass() == HealthProduct.class)
            healthProducts.add((HealthProduct) product);
        else if (product.getClass()==ElectricProduct.class)

        electricProducts.add((ElectricProduct) product);
    }
    public int getNumberOfProducts(){
        return products.size();

    }



}
