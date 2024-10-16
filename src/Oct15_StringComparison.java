public class Oct15_StringComparison {
    // SCP - string constant pool
    // Stack contains references to the String
    // Heap contains the actual strings

    // == : for refrence comparison
    // .equals: content comparison

    public static void main(String[] args) {
        String s1 = "Pragra";
        String s2 = "Pragra";
        String s3 = new String("Pragra");

        System.out.println(s1==s3); // True
        System.out.println(s1.equals(s3)); // False

        // String are immutable because multiple references can point to one object.
        // If you change the object all the references to that object will now point
        // to something else and so they will change


    }





}
