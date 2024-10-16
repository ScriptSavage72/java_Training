package ArrayStringAssignment;

/*
You are building a system for an airline company. Write a Java program that stores the names of 5 destinations in a string array. Create methods to:
•	Search for a destination and confirm whether it’s available.
•	Allow a user to update the name of a destination.

 */

import java.util.Scanner;

public class FlightBookingSystem {

    String[] destinations;

    public FlightBookingSystem(String[] destinations){
        this.destinations = destinations;
    }

    public void searchDestination(String destination){
        boolean found = false;
        for (int i = 0; i < destinations.length; i++) {
            if(destinations[i].equals(destination)){
                System.out.println("This destination is available!");
                found = true;
            }

        }
        if(!found){
            System.out.println("This desintation is not available");
        }
    }

    public void updateDestination(String oldDestination, String newDestination){
        boolean found = false;
        for (int i = 0; i < destinations.length; i++) {
            if(destinations[i].equals(oldDestination)){
                destinations[i] = newDestination;
                System.out.println("Destination successfully updated from " + oldDestination + " to " + newDestination);
                found = true;

            }
        }
        if(!found){
            System.out.println("The destination does not exist!");
        }else{
            for(String d : destinations){
                System.out.println(d);
            }
        }
    }

    public static void main(String[] args) {
        String[] desinations = {"Tokyo", "Bali", "Karbala", "Najaf", "Mecca"};
        FlightBookingSystem system = new FlightBookingSystem(desinations);

        Scanner scan = new Scanner(System.in);
        System.out.println("Options: Please select from the following menu");
        System.out.println("1. Check Availability");
        System.out.println("2. Update Destination name");
        int choice = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);

            if(choice == 1){
                System.out.print("Enter a destination to check availability: ");
                system.searchDestination(scan1.nextLine());
            }else if(choice == 2){
                System.out.print("Enter a destination name to update its name: ");
                String oldDestination = scan1.nextLine();
                System.out.print("Enter the new destination name: ");
                String newDestination = scan1.nextLine();
                system.updateDestination(oldDestination, newDestination);
            }










    }
}
