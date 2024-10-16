public class First {
    public static void main(String[] args){
        System.out.println("Hello");

        // public: enables accessibility from other classes
        // static: loaded first into memory, dont need objects to create or call static methods
        // main(): starting point of execution for your program; JVM runs this first
        // JVM: java virtual machine
        // System is the class
        // out is the reference
        // println is the method
        // x++ : post increment
        // ++x : pre increment

        int x = 10;
        x++;
        System.out.println(x);
        // prints 11

        int y = 10;
        y = y++;
        System.out.println(y);
        //prints 10: assigns the value of y first then increments
    }
}
