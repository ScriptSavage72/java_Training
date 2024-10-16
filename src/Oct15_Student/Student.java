package Oct15_Student;

public class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName){
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public void printDetails(){
        System.out.println(studentID);
        System.out.println(studentName);
    }

    @Override
    public String toString(){
        return "Student ID: " + studentID + " Student Name: " + studentName;
    }
}
