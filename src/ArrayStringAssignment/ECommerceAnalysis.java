package ArrayStringAssignment;

/*
An e-commerce website tracks the number of sales made for different products each day of the week. Write a Java program that:
•	Stores the names of 7 products and the number of sales made for each in two separate arrays.
•	Allows the user to search for a product and view its total sales.

 */

import java.util.Scanner;

public class ECommerceAnalysis {
    String[] products;
    double[] sales;

    public ECommerceAnalysis(String[] products, double[] sales){
        this.products = products;
        this.sales =sales;
    }

    public void checkSales(String product){
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if(products[i].equals(product)){
                index = i;
            }
        }

        if(index != -1){
            System.out.println("The total sales for " + product + " are: " + (int)sales[index]);
        }else{
            System.out.println("The product does not exist");
        }
    }

    public static void main(String[] args) {
        String[] products = {"hoodie", "jacket", "sweater", "shorts", "hat", "shirt", "belt"};
        double[] sales = {10, 20, 30, 40, 50, 60, 70};

        ECommerceAnalysis store = new ECommerceAnalysis(products, sales);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of a product to check its sales: ");
        store.checkSales(scan.nextLine());
    }
}
