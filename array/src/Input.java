import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 5;
        arr[2] = 245;
        arr[3] = 2;
        arr[4] = 3;

        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

        // print using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // enhanced for loop
        for (int j : arr) {
            System.out.print(j + " "); // here j represents element of the array
        }

    }
}
