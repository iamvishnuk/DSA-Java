import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q: Print number from 1 to 5
        // for loop
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

        // While loops
        /*
            syntax:
            while (condition) {
                body
            }
         */

//        int num = 1;
//        while(num <= 5) {
//            System.out.println(num++);
//        }

        // Do While loop
        int num = 1;
        do {
            System.out.println(num++);
        } while(num <= 5);
    }
}
