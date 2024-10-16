package ArrayStringAssignment;

/*
A restaurant collects feedback from customers. Create a Java program that stores customer reviews (up to 5) in an array. Write functions that:
•	Displays all customer reviews.
•	Allows the user to search for specific words in the reviews and returns reviews that match.

 */
import java.util.Scanner;
public class CustomerFeedbackSystem {
    String[] reviews;

    public CustomerFeedbackSystem(String[] reviews){
        this.reviews = reviews;
    }

    public void displayReviews(){
        for(String str : reviews){
            System.out.println(str);
            System.out.println();
        }
    }

    public String[] getMatchingReviews(String words){
        String[] matches = new String[reviews.length];
        int count = 0;
        for (int i = 0; i < reviews.length; i++) {
            if(reviews[i].contains(words)){
                matches[count++] = reviews[i];
            }
        }
        return matches;
    }


    public static void main(String[] args) {

        String[] reviews = {"Great job","Okay job","Bad job","Decent job","Wow!"};
        CustomerFeedbackSystem system = new CustomerFeedbackSystem(reviews);

        system.displayReviews();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter words to find matching reviews: ");
        //String[] matchingReviews = new String[reviews.length];
        String[] matchingReviews = system.getMatchingReviews(scan.nextLine());
        for(String str : matchingReviews){
            if(str != null){
                System.out.println(str);
            }

        }




    }
}
