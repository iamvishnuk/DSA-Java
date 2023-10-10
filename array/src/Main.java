public class Main {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];

        // store 5 roll numbers
        int[] roll = new int[5];
        // or directly
        int[] rollNo = {23, 26, 31, 32, 33};

        int[] ros; // declaration of array. or is getting defined in the stack
        ros = new int[5]; // actually here object is being created in the heap memory

//        System.out.println(ros[0]);

        String[] arr = new String[5];
        System.out.println(arr[0]);


    }
}