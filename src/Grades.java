import java.util.Scanner;


public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an age: ");
        int Age = scan.nextInt();

        if (Age >= 90) {
            System.out.println("The grade is A");

        } else if (Age > 79 && Age < 90) {
            System.out.println("The grade is B");
        } else if (Age > 69 && Age < 80) {
            System.out.println("The grade is C");

        } else if (Age > 59 && Age < 70) {
            System.out.println("The Grade is D");

        } else if (Age < 60) {
            System.out.println("The grade is F");
        }
    }



}
