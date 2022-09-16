package be.intecbrussel;

import java.util.Random;

public class ProductFactory {

    private ProductSorter productSorter;
    private String[] foodProduct = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};;
    private String[] healthProduct = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public void createProducts(int amount){
        Random r =new Random();
        for (int i = 1; i <= amount ; i++) {
            int productType = r.nextInt(3);
            int productID = r.nextInt(151);
            if(productType==0) {
                productSorter.sortProduct(new FoodProduct(foodProduct[r.nextInt(foodProduct.length - 1)], productID));
            }else if (productType==1){
                productSorter.sortProduct(new HealthProduct(healthProduct[r.nextInt(healthProduct.length-1)],productID ));
            } else {
                productSorter.sortProduct(new ElectricProduct(electricProducts[r.nextInt(electricProducts.length-1)],productID ));
            }

        }
    }

}
