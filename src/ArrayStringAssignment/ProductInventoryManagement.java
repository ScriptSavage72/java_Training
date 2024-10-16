package ArrayStringAssignment;

/*
You are managing an inventory system for an online store. Create a Java program that uses an array
to store the names of 5 products and another array to store their corresponding prices. Write a function that:
•	Displays all products with their prices.
•	Allows the user to search for a product by name and retrieve its price.

 */

public class ProductInventoryManagement {
    String productNames[];
    int productPrices[];

    public ProductInventoryManagement(String names[], int prices[]){
        this.productNames = names;
        this.productPrices = prices;
    }

    public void displayAll(){
        for (int i = 0; i < productNames.length; i++){
            System.out.println(productNames[i] + ": " + productPrices[i]);
        }
    }

    public void searchByName(String name){
        int index = -1;
        for (int i = 0; i < productNames.length; i++) {
            if(productNames[i].equals(name)){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("There is no product with this name.");
        }else {
            System.out.println();
            System.out.println(name + ": " + productPrices[index]);
        }
    }

    public static void main(String[] args) {

        String[] productNames = {"beans", "greens", "tomatoes", "potatoes", "chicken"};
        int[] productPrices = {10, 11, 12, 13, 14};
        ProductInventoryManagement products = new ProductInventoryManagement(productNames,productPrices);

        products.displayAll();
        products.searchByName("tomatoes");



    }

}
