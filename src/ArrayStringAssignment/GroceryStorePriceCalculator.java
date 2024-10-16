package ArrayStringAssignment;

/*
You are working at a grocery store that offers 5 different fruits. Create a Java program that:
•	Uses two arrays: one for storing the names of fruits and another for storing their prices per kilogram.
•	Allows the user to input the fruit name and the number of kilograms they want to purchase, then calculates and prints the total price.

 */
import java.util.Scanner;
public class GroceryStorePriceCalculator {
    String[] fruits;
    double[] fruitPrices;

    public GroceryStorePriceCalculator(String[] fruits, double[] prices){
        this.fruitPrices = prices;
        this.fruits = fruits;
    }

    public void calculatePrice(String fruit, double kilos){
        int index = -1;
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(fruit)){
                index = i;
            }
        }
        if(index != -1){
            double price = fruitPrices[index] * kilos;
            System.out.println("The price of " + kilos + " kilos of " + fruit +  " is: $" + price);
        }else{
            System.out.println("We don't sell this fruit.");
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "pear", "orange", "watermelon", "cantaloupe"};
        double[] prices = {2.59, 3.50, 2.75, 1.99, 7.80, 8.50};
        GroceryStorePriceCalculator calc = new GroceryStorePriceCalculator(fruits, prices);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the fruit you want to buy: ");
        String fruit= scan.nextLine();
        System.out.println();
        System.out.println("How many kilos would you like to buy?: ");
        double kilos = scan.nextDouble();

        calc.calculatePrice(fruit, kilos);
    }
}
