package ArrayStringAssignment;

/*
You are building a system for a school to track student attendance. Create a Java program that:
•	Uses an array to store the names of students present in the class on a particular day.
•	Allows the user to enter a student's name and check if they attended the class.

 */

import java.time.LocalDate;
import java.util.Scanner;

public class ClassroomAttendanceTracker {
    LocalDate date;
    String[] students;

    public ClassroomAttendanceTracker(String[] students, LocalDate date){
        this.students = students;
        this.date = date;
    }

    public boolean checkAttendance(String student){
        boolean attended = false;
        for(String str : students){
            if(str.equals(student)){
                attended = true;
            }
        }
        return attended;
    }

    public static void main(String[] args) {
        int counter = 0;
        String[] students = new String[5];
        LocalDate date = LocalDate.now();
        System.out.println("Who is here today?: ");
        Scanner scan = new Scanner(System.in);
        while(counter < 5){
            students[counter] = scan.nextLine();
            counter++;

        }

        ClassroomAttendanceTracker tracker = new ClassroomAttendanceTracker(students, date);
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Check student attendance: ");
        boolean check = tracker.checkAttendance(scan1.nextLine());
        if(check){
            System.out.println("The student was here");
        }
    }
}
